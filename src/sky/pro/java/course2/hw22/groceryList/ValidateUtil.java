package sky.pro.java.course2.hw22.groceryList;

public class ValidateUtil {
    public static String validateString(String needConfirmation) {
        if (needConfirmation == null || needConfirmation.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        } else {
            return needConfirmation;
        }
    }

    public static double validateDouble(double needConfirmation) {
        if (needConfirmation <= 0.0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            return needConfirmation;
        }
    }
}
