package course5.hw32.dao.cityDAO;

import course5.hw32.config.HibernateSessionFactoryUtil;
import course5.hw32.model.City;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityDAOImpl implements CityDAO {

    @Override
    public City getCityById(Integer id) {
        City city = HibernateSessionFactoryUtil.getSessionFactory().openSession().get(City.class, id);
        if (city == null) {
            throw new EntityNotFoundException("Объект не найден!");
        } else {
            return city;
        }
    }

    @Override
    public void addNewCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();) {
            Transaction transaction = session.beginTransaction();
            session.save(city);
            transaction.commit();
            System.out.println("Город добавлен!");
        }
    }

    @Override
    public List<City> getAllCities() {
        List<City> cities = (List<City>) HibernateSessionFactoryUtil
                .getSessionFactory().openSession().createQuery("From City").list();
        if (!cities.isEmpty()) {
            return cities;
        } else {
            throw new EntityNotFoundException("Список городов пуст!");
        }
    }

    @Override
    public void updateCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(city);
            transaction.commit();
            System.out.println("Город обновлён!");
        }
    }

    @Override
    public boolean deleteCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(city);
            transaction.commit();
        }
        return true;
    }
}