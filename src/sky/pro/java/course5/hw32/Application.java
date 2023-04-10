package course5.hw32;

import course5.hw32.dao.cityDAO.CityDAO;
import course5.hw32.dao.cityDAO.CityDAOImpl;
import course5.hw32.dao.employeeDAO.EmployeeDAO;
import course5.hw32.dao.employeeDAO.EmployeeDAOImpl;
import course5.hw32.model.City;
import course5.hw32.model.Employee;


public class Application {


    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        System.out.println(employeeDAO.getEmployeeById(7));
        System.out.println(cityDAO.getCityById(15));


        cityDAO.addNewCity(new City( "Краснодар"));
        employeeDAO.createEmployee(new Employee("Юлия", "Никитина", "Ж", 43, new City(1)));


        System.out.println(employeeDAO.getAllEmployees());
        System.out.println(cityDAO.getAllCities());


        employeeDAO.updateEmployee(new Employee(8, "Мария", "Кулагина","Ж", 63, new City(3)));
        cityDAO.updateCity(new City(8, "Ставрополь"));


        employeeDAO.deleteEmployee(new Employee(16));
        cityDAO.deleteCity(new City(13));
    }
}