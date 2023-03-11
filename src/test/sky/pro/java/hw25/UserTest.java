package hw25;

import course4.hw25.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class UserTest {

    private static String LOGIN;
    private final static String LOGIN_NEW = "Evgeniy";
    private static String USER_EMAIL;
    private final static String USER_EMAIL_NEW = "evgeniy@mail.ru";
    private final static String SYMBOL = "@";
    private final static String POINT = ".";
    public final static String VALID_EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private static User user;

    @Test
    void shouldReturnNullLoginAndEmail() {
        user = new User(null, null);
        Assertions.assertNull(LOGIN, user.getLogin());
        Assertions.assertNull(USER_EMAIL, user.getEmail());
    }

    @BeforeEach
    void createNewUser() {
        user = new User(LOGIN_NEW, USER_EMAIL_NEW);
    }

    @Test
    void shouldReturnCorrectUserLoginAndEmail() {
        Assertions.assertEquals(LOGIN_NEW, user.getLogin());
        Assertions.assertEquals(USER_EMAIL_NEW, user.getEmail());
    }

    @Test
    void shouldThrowsExceptionIfLoginEqualsEmail() {
        Assertions.assertThrows(RuntimeException.class, () -> user.setLogin(USER_EMAIL_NEW));
    }

    @Test
    void shouldBeCheckedContentSymbols() {
        Assertions.assertTrue(user.getEmail().contains(SYMBOL));
        Assertions.assertTrue(user.getEmail().contains(POINT));
    }

    @Test
    void newUserShouldHaveLoginNotEgualEmail() {
        Assertions.assertNotEquals(user.getLogin(), user.getEmail());
    }

    @Test
    void shouldThrowsExceptionIfEmailIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> user.setEmail(null));
    }

    @Test
    void shouldVerifyEmail() {
        Assertions.assertTrue(Pattern.matches(VALID_EMAIL, USER_EMAIL_NEW));
    }
}