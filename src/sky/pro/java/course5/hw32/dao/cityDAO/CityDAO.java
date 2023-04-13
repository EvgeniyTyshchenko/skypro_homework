package course5.hw32.dao.cityDAO;

import course5.hw32.model.City;

import java.util.List;

public interface CityDAO {
    City getCityById(Integer id);

    void addNewCity(City city);

    List<City> getAllCities();

    void updateCity(City city);

    boolean deleteCity(City city);
}