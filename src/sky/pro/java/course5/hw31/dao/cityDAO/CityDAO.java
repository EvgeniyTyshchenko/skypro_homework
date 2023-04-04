package course5.hw31.dao.cityDAO;

import course5.hw31.model.City;

import java.util.List;

public interface CityDAO {
    City getCityById(Integer id);

    void addNewCity(City city);

    List<City> getAllCities();

    void updateCityById(City city);

    void deleteCityById(City city);
}