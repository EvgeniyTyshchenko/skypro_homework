package course5.hw31;

import course5.hw31.dao.cityDAO.CityDAO;
import course5.hw31.dao.cityDAO.CityDAOImpl;
import course5.hw31.dao.employeeDAO.EmployeeDAO;
import course5.hw31.dao.employeeDAO.EmployeeDAOImpl;
import course5.hw31.model.City;
import course5.hw31.model.Employee;

public class Application {


    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        System.out.println(employeeDAO.getEmployeeById(7));
        System.out.println(cityDAO.getCityById(4));


        cityDAO.addNewCity(new City( "Краснодар"));
        employeeDAO.createEmployee(new Employee("Юлия", "Никитина", "Ж", 43, new City(1)));


        System.out.println(employeeDAO.getAllEmployees());
        System.out.println(cityDAO.getAllCities());


        employeeDAO.updateEmployeeById(new Employee(8, "Мария", "Кулагина","Ж", 63, new City(3)));
        cityDAO.updateCityById(new City(8, "Ставрополь"));


        employeeDAO.deleteEmployeeById(new Employee(11));
        cityDAO.deleteCityById(new City(7));
    }
}