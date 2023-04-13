package course5.hw32.dao.employeeDAO;

import course5.hw32.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee getEmployeeById(Integer id);

    void createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    void updateEmployee(Employee employee);

    boolean deleteEmployee(Employee employee);
}