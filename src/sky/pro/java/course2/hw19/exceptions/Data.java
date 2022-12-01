package sky.pro.java.course2.hw19.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    private static final String REGEX = "^[A-Za-z0-9_]{1,20}$";

    public static void checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || !check(login)) {
            throw new WrongLoginException();
        }
        if (password == null || !check(password)) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

    public static boolean check(String data) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }
}