package course5.hw30.dao.employeeDAO;

import course5.hw30.config.Configuration;
import course5.hw30.dao.cityDAO.CityDAO;
import course5.hw30.dao.cityDAO.CityDAOImpl;
import course5.hw30.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    CityDAO cityDAO = new CityDAOImpl();

    @Override
    public Employee getEmployeeById(int id) throws SQLException {
        try (Connection connection = Configuration.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?)")) {
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            return new Employee(resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("gender"),
                    cityDAO.getCityById(resultSet.getInt("city_id")));
        }
    }

    @Override
    public void createEmployee(String first_name, String last_name,
                               String gender, Integer age, Integer city_id) throws SQLException {
        String query = "INSERT INTO employee (first_name, last_name, gender, age, city_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = Configuration.getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, first_name);
            statement.setString(2, last_name);
            statement.setString(3, gender);
            statement.setInt(4, age);
            statement.setInt(5, city_id);

            statement.executeUpdate();
            System.out.println("Работник добавлен!");
        }
    }

    @Override
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();

        try (Connection connection = Configuration.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee")) {

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                employeeList.add(new Employee(resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("gender"),
                        resultSet.getInt("age"),
                        cityDAO.getCityById(resultSet.getInt("city_id"))));
            }
        }
        return employeeList;
    }

    @Override
    public void updateEmployeeById(Integer id, String first_name, String last_name,
                                   String gender, Integer age, Integer city_id) throws SQLException {
        String query = "UPDATE employee SET first_name = (?), last_name =(?), gender = (?), age = (?), city_id = (?) WHERE id =(?)";

        try (Connection connection = Configuration.getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(6, id);
            statement.setString(1, first_name);
            statement.setString(2, last_name);
            statement.setString(3, gender);
            statement.setInt(4, age);
            statement.setInt(5, city_id);

            statement.executeUpdate();
            System.out.println("Работник изменен!");
        }
    }

    @Override
    public void deleteEmployeeById(int id) throws SQLException {
        try (Connection connection = Configuration.getConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM employee WHERE id = (?)")) {

            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Работник удалён!");
        }
    }
}