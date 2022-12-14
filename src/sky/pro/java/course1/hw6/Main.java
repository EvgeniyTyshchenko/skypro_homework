package sky.pro.java.course1.hw6;

public class Main {
    public static void main(String[] args) {

// Задание 1. С помощью цикла for выведите в консоль все числа от 1 до 10.
        System.out.println("Задание 1.");
        for (int i = 1; i <= 10; i ++) {
            System.out.println(i);
        }

// Задание 2. С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.println("Задание 2.");
        for (int i = 10; i >= 1; i --) {
            System.out.println(i);
        }

// Задание 3. Выведите в консоль все четные числа от 0 до 17.
        System.out.println("Задание 3.");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

// Задание 4. Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        System.out.println("Задание 4.");
        for (int i = 10; i >= -10; i --) {
            System.out.println(i);
        }

/* Задание 5. Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
В консоль результат должен выводиться в формате "… год является високосным".
 */
        System.out.println("Задание 5.");
        for (int year = 1904; year <= 2096; year ++) {
            if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }

/* Задание 6. Напишите программу, которая выводит в консоль последовательность цифр:
7 14 21 28 35 42 49 56 63 70 77 84 91 98
*/
        System.out.println("Задание 6.");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

/* Задание 7. Напишите программу, которая выводит в консоль последовательность цифр:
1 2 4 8 16 32 64 128 256 512
*/
        System.out.println ("Задание 7.");
        int number = 1;

        System.out.print (number + " ");
        for (int i = 0; i < 9; i ++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();

/* Задание 8. Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей".
 */
        System.out.println ("Задание 8.");
        int part = 29_000;
        int sum = 0;

        for (int i = 1; i <= 12; i ++) {
            sum = sum + part;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

/* Задание 9. Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку", а в банк под проценты – 12% годовых.
Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей".
*/
        System.out.println("Задание 9.");
        double sumWithPersent = 0;
        double interestRate = 0.12;

        for (int i = 1; i <= 12; i ++) {
            sumWithPersent = (sumWithPersent + part) * (1 + interestRate / 12);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPersent + " рублей");
        }

/* Задание 10.
Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка, вывести ping, а если число делится на 5 без остатка, вывести pong.
Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
Допускается наличие пустых строк в выводе.
*/
        System.out.println("Задание 10.");
        for (int i = 1; i <= 30; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else {
                System.out.println(i);
            }
        }

/* Задание 11. Вывести первые 10 чисел последовательности Фибоначчи.
Последовательность строится по следующему правилу:
Каждое следующее число равняется сумме двух предыдущих.
Должно получиться следующее: 0 1 1 2 3 5 8 13 21 34
*/
        System.out.println("Задание 11.");
        int a = 1;

        for (int i = 0; i < 35; i = a + i) {
            System.out.print(" " + i);
            a = i + a;
            System.out.print(" " + a);
        }
    }
}