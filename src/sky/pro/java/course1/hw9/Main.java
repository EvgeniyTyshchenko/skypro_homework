package sky.pro.java.course1.hw9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

/* Задание 1. Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Сумма трат за месяц составила … рублей».
*/
        System.out.println("Задание 1.");
        int [] payments = generateRandomArray();
        int totalPayout = 0;

        for (int i = 0; i < payments.length; i++) {
            totalPayout += payments [i];
        }
        System.out.println("Сумма трат за месяц составила " + totalPayout + " рублей");

/* Задание 2. Найти минимальную и максимальную трату за день.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
*/
        System.out.println("Задание 2.");
        int minSpendingPerDay = payments[0];
        int maxSpendingPerDay = payments[0];

        for (int i = 0; i < payments.length; i++) {
            if (minSpendingPerDay > payments[i]) {
                minSpendingPerDay = payments[i];
            }
        }
        for (int i = 0; i < payments.length; i++) {
            if (maxSpendingPerDay < payments[i]) {
                maxSpendingPerDay = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendingPerDay + " рублей. Максимальная сумма трат за день составила " + maxSpendingPerDay + " рублей");

/* Задание 3. А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
Нужно написать программу, которая посчитает среднее значение трат за месяц, и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
Важно помнить: подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
*/
        System.out.println("Задание 3.");
        int totalPayout_exe3 = 0;
        int amountOfDays = 30;
        double averageSum;

        for (int i = 0; i < payments.length; i ++) {
            totalPayout_exe3 += payments[i];
        }
        averageSum = totalPayout_exe3 / amountOfDays;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

/* Задание 4. В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и ФИО сотрудников начали отображаться в обратную сторону,
т.е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
Данные с именами сотрудников хранятся в виде массива символов (char[]).
Напишите код, который в случае такого бага будет выводить ФИО сотрудников в корректном виде. В качестве данных для массива используйте:
char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
В результате в консоль должно быть выведено "Ivanov Ivan".
Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
*/
        System.out.println("Задание 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

/* Задание 5. Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.
Для печати следует использовать следующий код:
for (int[] row : matrix) {
    for (int column : row) {
        System.out.print(column + " ");
    }
    System.out.println();
}
*/
        System.out.println("Задание 5. Дополнительная задача");
        int [][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i == j) || (i + j == 2)) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

/* Задание 6. У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
Нам дан массив чисел: {5, 4, 3, 2, 1}
Необходимо привести его к виду: {1, 2, 3, 4, 5}
Решите задачу с использованием дополнительного массива.
Напечатайте массив до преобразования и после с помощью
System.out.println(Arrays.toString(arr));
*/
        System.out.println("Задание 6. Дополнительная задача");
        int[] arrayOne = {5, 4, 3, 2, 1};
        int[] arrayTwo = new int[arrayOne.length];

        System.out.println(Arrays.toString(arrayOne));
        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[arrayOne.length - i - 1];
        }
        System.out.println(Arrays.toString(arrayTwo));

/* Задание 7. Решите предыдущее задание, но без использования дополнительного массива.
Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
Выведите результат программы в консоль тем же способом.
Уточнения:
• Это задание не на сортировку.
• Не использовать Arrays.sort() и другие способы сортировок.
• Числа в порядке убывания даны исключительно для указания направления чтения.
• Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
*/
        System.out.println("Задание 7. Дополнительная задача");
        int[] array_exe7 = {5, 8, 2, 3, 9};

        System.out.println(Arrays.toString(array_exe7));
        for (int i = 0; i < array_exe7.length / 2; i++) {
            int transform = array_exe7[i];
            array_exe7[i] = array_exe7[array_exe7.length - i - 1];
            array_exe7[array_exe7.length - i - 1] = transform;
        }
        System.out.println(Arrays.toString(array_exe7));

/* Задание 8. Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
Необходимо найти два числа, сумма которых равна −2.
Напечатать эти числа в консоль.
Подсказка: Может потребоваться отсортировать массив с помощью Arrays.sort(arr).
*/
        System.out.println("Задание 8. Дополнительная задача");
        int[] array_exe8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int result = -2;

        for (int i = 0; i <= array_exe8.length; i++) {
            for (int j = i + 1; j < array_exe8.length; j++) {
                if (array_exe8[i] + array_exe8[j] == result) {
                    System.out.println(array_exe8[i] + " + " + array_exe8[j] + " = " + result);
                }
            }
            break;
        }

// Задание 9. Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.
        System.out.println("Задание 9. Дополнительная задача");

        for (int i = 0; i <= array_exe8.length; i++) {
            for (int j = i + 1; j < array_exe8.length; j++) {
                if (array_exe8[i] + array_exe8[j] == result) {
                    System.out.println(array_exe8[i] + " + " + array_exe8[j] + " = " + result);
                }
            }
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
}