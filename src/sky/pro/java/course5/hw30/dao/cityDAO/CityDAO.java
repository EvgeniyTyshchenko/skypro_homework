package course5.hw30.dao.cityDAO;

import course5.hw30.model.City;

import java.sql.SQLException;
import java.util.List;

public interface CityDAO {

    City getCityById(int id) throws SQLException;

    void addNewCity(String cityName) throws SQLException;

    List<City> getAllCities() throws SQLException;

    void updateCityById(Integer id, String name) throws SQLException;

    void deleteCityById(Integer id) throws SQLException;
}