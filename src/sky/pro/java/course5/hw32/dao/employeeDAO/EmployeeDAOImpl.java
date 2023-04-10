package course5.hw32.dao.employeeDAO;

import course5.hw32.config.HibernateSessionFactoryUtil;
import course5.hw32.model.Employee;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public Employee getEmployeeById(Integer id) {
        Employee employee = HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
        if (employee == null) {
            throw new EntityNotFoundException("Объект не найден!");
        } else {
            return employee;
        }
    }

    @Override
    public void createEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
            System.out.println("Работник добавлен!");
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<course5.hw32.model.Employee> employees = (List<Employee>) HibernateSessionFactoryUtil
                .getSessionFactory().openSession().createQuery("from Employee").list();
            if (!employees.isEmpty()) {
                return employees;
            } else {
                throw new EntityNotFoundException("Список работников пуст!");
            }
    }

    @Override
    public void updateEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
            System.out.println("Работник изменен!");
        }
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
        return true;
    }
}