package hw32.cityDAO;

import course5.hw32.dao.cityDAO.CityDAO;
import course5.hw32.dao.cityDAO.CityDAOImpl;
import course5.hw32.model.City;
import course5.hw32.model.Employee;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CityDAOImplTest {

    private final Integer ID = 9;
    private final Integer WRONG_ID = 1_000;
    private final CityDAO cityDAO = new CityDAOImpl();
    private final City newCity = new City(ID,"Краснодар");
    private final Employee employee = new Employee("Виктор", "Солгалов", "М", 29, newCity);


    @Test
    void shouldFindCityById() {
        Assertions.assertEquals(cityDAO.getCityById(ID), newCity);
    }

    @Test
    void shouldThrowAnExceptionIfTheIdAbsent() {
        Assertions.assertThrows(EntityNotFoundException.class, () -> cityDAO.getCityById(WRONG_ID));
    }

    @Test
    void checkThatTheCityHasBeenAdded() {
        City city = new City("Пермь");
        cityDAO.addNewCity(city);
        Integer id = city.getId();

        Assertions.assertNotNull(id);
        Assertions.assertEquals(city, cityDAO.getCityById(id));
    }

    @Test
    void theIdOfTheCityInTheEmployeeObjectMustMatchTheCity() {
        Assertions.assertEquals(employee.getCity().getId(), newCity.getId());
    }

    @Test
    void theNumberOfCitiesAddedMustMatchTheExpectedNumber() {
        Assertions.assertEquals(cityDAO.getAllCities().size(), 15);
    }

    @Test
    void theUpdatedCityShouldBeChanged() {
        cityDAO.updateCity(new City(ID, "Казань"));
        Assertions.assertEquals(cityDAO.getCityById(ID).getName(), "Казань");
    }

    @Test
    void shouldRemoveTheCityFromTheDB() {
        Assertions.assertTrue(cityDAO.deleteCity(newCity));
    }
}