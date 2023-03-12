package course4.hw25;

import java.util.Objects;
import java.util.regex.Pattern;

public class User {

    private String login;
    private String email;

    public User(String login, String email) {
        setLogin(login);
        setEmail(email);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null || login.equals(email)) {
            throw new RuntimeException("Поле login должно быть корректным!");
        } else {
            this.login = login;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$").matcher(email).matches()) {
            throw new RuntimeException("Поле email должно быть корректным!");
        } else {
            this.email = email;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}