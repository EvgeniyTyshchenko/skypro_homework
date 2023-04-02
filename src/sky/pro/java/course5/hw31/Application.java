package course5.hw31;

import course5.hw31.dao.cityDAO.CityDAO;
import course5.hw31.dao.cityDAO.CityDAOImpl;
import course5.hw31.dao.employeeDAO.EmployeeDAO;
import course5.hw31.dao.employeeDAO.EmployeeDAOImpl;


import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();


        employeeDAO.getEmployeeById(10);
//        employeeDAO.createEmployee(new Employee("Марина", "Никитина", "Ж", new City("Пенза")));

    }
}