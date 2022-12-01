package sky.pro.java.course2.hw19.exceptions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String login;
        String password;
        String confirmPassword;
        boolean verify = true;

        Scanner scanner = new Scanner(System.in);

        while (verify) {
            System.out.println("Введите логин:");
            login = scanner.nextLine();
            System.out.println("Введите пароль:");
            password = scanner.nextLine();
            System.out.println("Повторите пароль:");
            confirmPassword = scanner.nextLine();
            try {
                Data.checkData(login, password, confirmPassword);
                System.out.println("Сохранено. Логин и пароль введены верно.");
                verify = false;
            } catch (WrongLoginException e) {
                System.out.println("Логин введен некорректно. Ознакомьтесь с правилами создания логина.");
            } catch (WrongPasswordException e) {
                System.out.println("Пароль введен некорректно. Ознакомьтесь с правилами создания пароля и убедитесь, что введенные пароли совпадают.");
            }
        }
    }
}