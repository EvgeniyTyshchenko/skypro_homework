package course5.hw31.dao.employeeDAO;

import course5.hw31.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    Employee getEmployeeById(int id);

    void createEmployee(Employee employee);


//
//    List<Employee> getAllEmployees() throws SQLException;
//
//    void updateEmployeeById(Integer id, String firstName, String lastName,
//                            String gender, Integer age, Integer cityId) throws SQLException;
//
//    void deleteEmployeeById(int id) throws SQLException;
}