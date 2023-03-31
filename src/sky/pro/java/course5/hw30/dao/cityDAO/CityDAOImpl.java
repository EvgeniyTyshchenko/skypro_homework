package course5.hw30.dao.cityDAO;

import course5.hw30.config.Configuration;
import course5.hw30.model.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDAOImpl implements CityDAO {

    @Override
    public City getCityById(int id) throws SQLException {
        try (Connection connection = Configuration.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM city WHERE city_id = (?)")) {
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (!resultSet.next()) {
                System.out.println("Пожалуйста, убедитесь, что id введен корректно!");
                return null;
            }
            return new City(resultSet.getString("city_name"));
        }
    }

    @Override
    public void addNewCity(String cityName) throws SQLException {
        try (Connection connection = Configuration.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO city (city_name) VALUES (?)")) {

            statement.setString(1, cityName);
            statement.executeUpdate();
            System.out.println("Город добавлен!");
        }
    }

    @Override
    public List<City> getAllCities() throws SQLException {
        List<City> cityList = new ArrayList<>();

        try (Connection connection = Configuration.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM city")) {

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                cityList.add(new City(resultSet.getString("city_name")));
            }
        }
        return cityList;
    }

    @Override
    public void updateCityById(Integer id, String cityName) throws SQLException {
        try (Connection connection = Configuration.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE city SET city_name = (?) WHERE city_id = (?)")) {

            statement.setString(1, cityName);
            statement.setInt(2, id);
            statement.executeUpdate();

            System.out.println("Город обновлён!");
        }
    }

    @Override
    public void deleteCityById(Integer id) throws SQLException {
        try (Connection connection = Configuration.getConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM city WHERE city_id = ?")) {

            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Город удалён!");
        }
    }
}