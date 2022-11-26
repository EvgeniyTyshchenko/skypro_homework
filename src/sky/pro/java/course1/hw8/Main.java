package sky.pro.java.course1.hw8;

public class Main {
    public static void main(String[] args) {

/* Задание 1. Объявите три массива:
1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
*/
        System.out.println("Задание 1.");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        char [] array3 = new char[5];
        array3[0] = 'A';
        array3[1] = 'B';
        array3[2] = 'C';
        array3[3] = 'D';
        array3[4] = 'E';
        System.out.println("Объявил три массива");

/* Задание 2. Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
Запятая между последним элементом одного массива и первым элементом следующего не нужна.
*/
        System.out.println("Задание 2.");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i < array3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

/* Задание 3. Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
Запятая между последним элементом одного массива и первым элементом следующего не нужна.
*/
        System.out.println("Задание 3.");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

/* Задание 4. Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
Распечатайте результат преобразования в консоль.
*/
        System.out.println("Задание 4.");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2 != 0) {
                array1[i]++;
            }
                System.out.print(array1[i] + " ");
        }
    }
}