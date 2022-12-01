package sky.pro.java.course2.hw19;

public class ValidateUtil {
    public static String validateString(String needСonfirmation) {
        if (needСonfirmation != null || !needСonfirmation.isEmpty() || !needСonfirmation.isBlank()) {
            return needСonfirmation;
        } else {
            return "< Информация не указана >";
        }
    }
}
