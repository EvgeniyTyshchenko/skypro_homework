package course5.hw31.dao.employeeDAO;

import course5.hw31.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee getEmployeeById(Integer id);

    void createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    void updateEmployeeById(Employee employee);

    void deleteEmployeeById(Employee employee);
}