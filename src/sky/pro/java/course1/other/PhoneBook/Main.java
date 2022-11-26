package sky.pro.java.course1.other.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(15);

        phoneBook.addContact("Иванов Иван Иванович", "89880000001");
        phoneBook.addContact("Романов Владимир Георгиевич", "89880000002");
        phoneBook.addContact("Черноволенко Светлана Петровна", "89880000003");
        phoneBook.addContact("Зубакина Валентина Игоревна", "89880000004");
        phoneBook.addContact("Севастьянова Людмила Ивановна", "89880000005");
        phoneBook.addContact("Черниговская Анастасия Владимировна", "89880000006");
        phoneBook.addContact("Кот Александ Васильевич", "89880000007");
        phoneBook.addContact("Воронов Святослав Игоревич", "89880000008");
        phoneBook.addContact("Петров Василий Иванович", "89880000009");
        phoneBook.addContact("Мотько Дмитрий Валентинович", "89880000010");

        phoneBook.printAllContacts();
        System.out.println();

        System.out.println("Текущий размер телефонной книги: " + phoneBook.getCurrentSize());
        System.out.println();

        phoneBook.findContact("Романов Владимир Георгиевич");
        System.out.println();

        phoneBook.removeContact("Зубакина Валентина Игоревна");
        phoneBook.findContact("Зубакина Валентина Игоревна");
        System.out.println();

        phoneBook.printAllContacts();
        System.out.println();

        System.out.println("Текущий размер телефонной книги: " + phoneBook.getCurrentSize());
    }
}
