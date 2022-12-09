package sky.pro.java.course2.hw21.passport;

public class ValidateUtil {
    public static String validateString(String needСonfirmation) {
        if (needСonfirmation == null || needСonfirmation.isEmpty()) {
            throw new RuntimeException("< Введите данные >");
        } else {
            return needСonfirmation;
        }
    }
}
