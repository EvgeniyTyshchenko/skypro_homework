package sky.pro.java.course2.hw21;

public class Exercise {
    public static void main(String[] args) {

/* Учитель каждый урок начинает с того, чтобы задавать каждому ученику пример из таблицы умножения, чтобы проверить знания.
Учитель хочет, чтобы все вопросы для учеников были разными. Всего в классе учатся 15 человек.
Напишите программу, которая будет выводить в консоль 15 уникальных и случайных задач из таблицы умножения в столбец,
то есть на одной строчке одно задание (от 2*2 до 9*9). Задачи должны быть уникальными, то есть примеры по типу 2*9 и 9*2 считаются повтором.
*/
        int [][] mas = new int[15][3];
        for(int i = 0; i < mas.length; i ++) {
            for(int h = 0; h < mas[i].length; h ++) {
                mas[i][h] = (int) (Math.random() * 8) + 2;
                if(h == mas[i].length - 1) {
                    mas[i][h] = mas[i][h - 2] * mas[i][h - 1];
                    for(int q = 0; q < i; q ++) {
                        if(mas[i][h] == mas[q][h] && i > 0) {
                            if(mas[i][h - 1] == mas[q][h - 1] || mas[i][h - 2] == mas[q][h - 2]) {
                                --i;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < mas.length; i ++) {
            System.out.print("Задача №" + (i + 1) + ": ");
            for(int h = 0; h < mas[i].length; h ++) {
                if(h == 0)
                    System.out.print(mas[i][h] + " * ");
                if(h == 1)
                    System.out.println(mas[i][h]);
            }
        }
    }
}
