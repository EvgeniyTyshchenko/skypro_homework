package course5.hw30;

import course5.hw30.dao.cityDAO.CityDAO;
import course5.hw30.dao.cityDAO.CityDAOImpl;
import course5.hw30.dao.employeeDAO.EmployeeDAO;
import course5.hw30.dao.employeeDAO.EmployeeDAOImpl;

import java.sql.*;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        System.out.println(cityDAO.getCityById(1));
        cityDAO.addNewCity("Пятигорск");
        System.out.println(cityDAO.getAllCities());
        cityDAO.updateCityById(7, "Кисловодск");
        cityDAO.deleteCityById(7);


        System.out.println(employeeDAO.getEmployeeById(2));
        employeeDAO.createEmployee("Евгений", "Дьячков", "М", 25, 4);
        System.out.println(employeeDAO.getAllEmployees());
        employeeDAO.updateEmployeeById(2, "Мария", "Иванова", "Ж", 43, 2);
        employeeDAO.deleteEmployeeById(7);

    }
}