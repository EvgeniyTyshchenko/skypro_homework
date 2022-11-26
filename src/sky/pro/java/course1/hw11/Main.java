package sky.pro.java.course1.hw11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

/* Задание 1. Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и выводит результат в консоль.
*Эту проверку вы уже реализовывали в задании по условным операторам.*
Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то должно быть выведено “номер года — високосный год”.
Если год не високосный, то, соответственно: “номер года — невисокосный год”.
*/
        System.out.println("Задание 1.");
        int year = 2024;

        checkYear(year);

/* Задание 2. Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию приложения.
Напишите метод, куда подаются два параметра: тип операционной системы (ОС) (0 — iOS или 1 — Android) и год выпуска устройства.
Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.
*/
        System.out.println("Задание 2.");
        int clientOS = 1;
        int clientDeviceYear = 2013;

        adviseTheUser(clientOS, clientDeviceYear);

/* Задание 3. Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
*/
        System.out.println("Задание 3.");
        int deliveryDistance = 25;

        calculateDeliveryTime(deliveryDistance);

/* Задание 4. Снова вспоминаем домашнее задание по массивам. В нем была задача, которая требовала высчитать среднюю выплату за день.
Был дан сгенерированный массив из 30 значений от 100 до 200 тысяч, для его генерации допускается использовать метод из прошлого домашнего задания.
Нужно сгенерировать массив, подать его в наш метод, а внутри метода подсчитать сумму элементов и вычислить среднее значение, которое нужно вернуть из метода в виде результата.
Сложность в том, что метод нужно не просто написать, но еще и декомпозировать.
То есть для работы этого метода нужно будет создать еще методы (1 или более), которые его будут обслуживать и вычислять промежуточные результаты.
Среднее значение нужно вычислять в дробном виде, так как результат должен быть точным.
*/
        System.out.println("Задание 4.");
        int[] payments = generateRandomArray();
        calculateSum(payments);
        calculateAverage(payments);
        System.out.println("Средняя сумма трат за месяц составила " + calculateAverage(payments) + " рублей");
    }
    public static void checkYear (int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " невисокосный год");
        }
    }
    public static void adviseTheUser (int oS, int year) {
        if (oS > 1 || year > 2022) {
            System.out.println("Введите корректную информацию");
        } else if (oS == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (oS == 1) {
            if (year > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void calculateDeliveryTime (int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance < 60) {
            deliveryDays++;
            System.out.println("Потребуется " + deliveryDays + " дня");
        } else if (deliveryDistance < 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется " + deliveryDays + " дня");
        } else {
            System.out.println("Потребуется более 3 дней");
        }
    }
    public static int [] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int calculateSum (int[] payments) {
        int totalPayout = 0;

        for (int i = 0; i < payments.length; i++) {
            totalPayout +=  payments[i];
        }
        return  totalPayout;
    }
    public static double calculateAverage (int[] payments) {
        double averageSum = calculateSum(payments) / payments.length;
        return averageSum;
    }
}