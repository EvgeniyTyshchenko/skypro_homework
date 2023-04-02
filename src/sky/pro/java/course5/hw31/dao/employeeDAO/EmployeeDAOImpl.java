package course5.hw31.dao.employeeDAO;


import course5.hw31.config.HibernateSessionFactoryUtil;
import course5.hw31.model.Employee;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public Employee getEmployeeById(int id) {
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



//
//    @Override
//    public List<Employee> getAllEmployees() throws SQLException {
//        List<Employee> employeeList = new ArrayList<>();
//
//        try (Connection connection = HibernateSessionFactoryUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee")) {
//
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                employeeList.add(new Employee(resultSet.getString("first_name"),
//                        resultSet.getString("last_name"),
//                        resultSet.getString("gender"),
//                        resultSet.getInt("age"),
//                        cityDAO.getCityById(resultSet.getInt("city_id"))));
//            }
//        }
//        return employeeList;
//    }
//
//    @Override
//    public void updateEmployeeById(Integer id, String firstName, String lastName,
//                                   String gender, Integer age, Integer cityId) throws SQLException {
//        String query = "UPDATE employee SET first_name = (?), last_name =(?), gender = (?), age = (?), city_id = (?) WHERE id =(?)";
//
//        try (Connection connection = HibernateSessionFactoryUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement(query)) {
//
//            statement.setInt(6, id);
//            statement.setString(1, firstName);
//            statement.setString(2, lastName);
//            statement.setString(3, gender);
//            statement.setInt(4, age);
//            statement.setInt(5, cityId);
//
//            statement.executeUpdate();
//            System.out.println("Работник изменен!");
//        }
//    }
//
//    @Override
//    public void deleteEmployeeById(int id) throws SQLException {
//        try (Connection connection = HibernateSessionFactoryUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement("DELETE FROM employee WHERE id = (?)")) {
//
//            statement.setInt(1, id);
//            statement.executeUpdate();
//            System.out.println("Работник удалён!");
//        }
//    }
}