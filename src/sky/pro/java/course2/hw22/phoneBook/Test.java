package sky.pro.java.course2.hw22.phoneBook;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        PhoneBook petr = new PhoneBook("Иванов Петр", "+79881234569");
        PhoneBook dmitriy = new PhoneBook("Петров Дмитрий", "+79881234578");
        PhoneBook vladislav = new PhoneBook("Котов Владислав", "+79881234512");
        PhoneBook viktor = new PhoneBook("Васильев Виктор", "+79881284569");
        PhoneBook evgeniy = new PhoneBook("Демидов Евгений", "+79881231269");
        PhoneBook stanislav = new PhoneBook("Долгов Станислав", "+79881794569");
        PhoneBook vadim = new PhoneBook("Сорокин Вадим", "+79881288569");
        PhoneBook valentin = new PhoneBook("Медведев Валентин", "+79881234569");
        PhoneBook maksim = new PhoneBook("Плотников Максим", "+79881426569");
        PhoneBook vladimir = new PhoneBook("Дроздов Владимир", "+79881275369");

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put(petr.getName(), petr.getPhoneNumber());
        phoneBook.put(dmitriy.getName(), dmitriy.getPhoneNumber());
        phoneBook.put(vladislav.getName(), vladislav.getPhoneNumber());
        phoneBook.put(viktor.getName(), viktor.getPhoneNumber());
        phoneBook.put(evgeniy.getName(), evgeniy.getPhoneNumber());
        phoneBook.put(stanislav.getName(), stanislav.getPhoneNumber());
        phoneBook.put(vadim.getName(), vadim.getPhoneNumber());
        phoneBook.put(valentin.getName(), valentin.getPhoneNumber());
        phoneBook.put(maksim.getName(), maksim.getPhoneNumber());
        phoneBook.put(vladimir.getName(), vladimir.getPhoneNumber());

        System.out.println(phoneBook);
    }
}
