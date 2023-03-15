package hw26.service;

import course4.hw26.dao.UserDaoImpl;
import course4.hw26.model.User;
import course4.hw26.service.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserDaoImpl userDaoMock;

    @InjectMocks
    private UserServiceImpl out;

    private static final String USER_EVGENIY = "Evgeniy";
    private static final String USER_VLADIMIR = "Vladimir";
    private  static final String USER_VITALIY = "Vitaliy";
    private static final String USER_EGOR = "Egor";
    private static User userVladimir;
    private static User userEgor;

    private final List<User> userList = List.of(new User(USER_EVGENIY), new User(USER_VLADIMIR), new User(USER_VITALIY));

    @BeforeEach
    void createNewUser() {
        userVladimir = new User(USER_VLADIMIR);
        userEgor = new User(USER_EGOR);
    }

    @Test
    void shouldCheckUserExistReturnTrue() {
        when(userDaoMock.findAllUsers()).thenReturn(userList);
        Assertions.assertTrue(out.checkUserExist(userVladimir));
    }

    @Test
    void shouldCheckUserExistReturnFalse() {
        when(userDaoMock.findAllUsers()).thenReturn(userList);
        Assertions.assertFalse(out.checkUserExist(userEgor));
    }
}