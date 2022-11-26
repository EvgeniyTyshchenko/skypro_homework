package sky.pro.java.course1.hw10;

public class Main {
    public static void main(String[] args) {

/* Задание 1. Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
и бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
Напишите четыре строки:
- первая с именем firstName — для хранения имени;
- вторая с именем middleName — для хранения отчества;
- третья с именем lastName — для хранения фамилии;
- четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
Выведите в консоль фразу: “ФИО сотрудника — ….”
В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
*/
        System.out.println("Задание 1.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);

/* Задание 2. Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
Напишите программу, которая изменит написание Ф.И.О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
В качестве строки с исходными данными используйте строку fullName.
Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
*/
        System.out.println("Задание 2.");

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

/* Задание 3. Система, в которой мы работаем, не принимает символ “ё”.
Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
*/
        System.out.println("Задание 3.");
        String fullName_exe3 = "Иванов Семён Семёнович";

        fullName_exe3 = fullName_exe3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName_exe3);

/* Задание 4. К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф.И.О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте: Ф.И.О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф.И.О. сотрудника в формате фамилия - имя - отчество;
- переменная firstName — для хранения имени;
- переменная middleName — для хранения отчества;
- переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
*/
        System.out.println("Задание 4.");
        String fullName_exe4 = "Ivanov Ivan Ivanovich";

        String firstName_exe4 = fullName_exe4.substring(fullName_exe4.indexOf(" "), fullName_exe4.lastIndexOf(" "));
        String middleName_exe4 = fullName_exe4.substring(fullName_exe4.lastIndexOf(" "));
        String lastName_exe4 = fullName_exe4.substring(0, fullName_exe4.indexOf(" "));
        System.out.println("Имя сотрудника — " + firstName_exe4 + "; Фамилия сотрудника — " + lastName_exe4 + "; Отчество сотрудника — " + middleName_exe4);

/* Задание 5. Периодически данные в наших регистрах заполняются неверно, и Ф.И.О. сотрудников записывают со строчных букв.
Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф.И.О. в правильный формат.
В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
Выведите результат программы в консоль.
*/
        System.out.println("Задание 5.");
        String fullName_exe5 = "ivanov ivan ivanovich";

        char[] arrayFullName_exe5 = fullName_exe5.toCharArray();
        for (int i = 0; i < arrayFullName_exe5.length; i++) {
            Character space = arrayFullName_exe5[i];
            arrayFullName_exe5[0] = Character.toUpperCase(arrayFullName_exe5[0]);
            if (space.equals(' ')) {
                arrayFullName_exe5[i+1] = Character.toUpperCase(arrayFullName_exe5[i+1]);
            }
        }
        System.out.println(arrayFullName_exe5);

/* Задание 6. Имеется две строки. Первая: "135", вторая: "246".
Соберите из двух строк одну, содержащую данные "123456". Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль.
*/
        System.out.println("Задание 6.");
        String stringOne = "135";
        String stringTwo = "246";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringOne.length() + stringTwo.length(); i++) {
            if (i % 2 == 0) {
                sb.append(stringOne.charAt(i/2));
            } else {
                sb.append(stringTwo.charAt(i/2));
            }
        }
        System.out.println(sb);

/* Задание 7. Дана строка из букв английского алфавита "aabccddefgghiijjkk".
Нужно найти и напечатать буквы, которые дублируются в строке.
Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
В итоге в консоль должен быть выведен результат программы: "acdgijk".
*/
        System.out.println("Задание 7.");
        String string_exe7 = "aabccddefgghiijjkk";

        char[] arrayString_exe7 = string_exe7.toCharArray();
        for (int i = 0; i < arrayString_exe7.length; i++) {
            for (int j = i + 1; j < arrayString_exe7.length; j++) {
                if (arrayString_exe7[i] == arrayString_exe7[j]) {
                    System.out.print(arrayString_exe7[i]);
                }
            }
        }
    }
}