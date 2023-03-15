package hw26.dao;

import course4.hw26.dao.UserDaoImpl;
import course4.hw26.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserDaoImplTest {

    private static final String USER_EVGENIY = "Evgeniy";
    private static final String USER_VLADIMIR = "Vladimir";
    private  static final String USER_VITALIY = "Vitaliy";
    private static final String USER_EGOR = "Egor";

    private final List<User> userList = List.of(new User(USER_EVGENIY), new User(USER_VLADIMIR), new User(USER_VITALIY));
    private final List<User> userListNew = List.of(new User(USER_EVGENIY), new User(USER_VLADIMIR), new User(USER_EGOR));
    private static UserDaoImpl userDao;

    @BeforeEach
    void createNewUser() {
        userDao = new UserDaoImpl();
    }

    @Test
    void shouldReturnUserByNameIfExist() {
        Assertions.assertEquals(USER_EVGENIY, userDao.getUserByName(USER_EVGENIY));
    }

    @Test
    void shouldReturnNullIfTheUserIsNotFound() {
        Assertions.assertNull(null, userDao.getUserByName(USER_EGOR));
    }

    @Test
    void shouldReturnCollectionsUsers() {
        Assertions.assertEquals(userList, userDao.findAllUsers());
    }

    @Test
    void shouldNotEqualsListUsers() {
        Assertions.assertNotEquals(userListNew, userDao.findAllUsers());
    }
}