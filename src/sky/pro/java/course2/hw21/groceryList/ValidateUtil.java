package sky.pro.java.course2.hw21.groceryList;

public class ValidateUtil {
    public static String validateString(String needСonfirmation) {
        if (needСonfirmation == null || needСonfirmation.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else {
            return needСonfirmation;
        }
    }

    public static double validateDouble(double needСonfirmation) {
        if (needСonfirmation <= 0.0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            return needСonfirmation;
        }
    }
}
