package sky.pro.java.course2.other.AdditionalTasks.oop.Reader;

public class Test {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBookToLibrary("Мастер и Маргарита");
        library.addBookToLibrary("Герой нашего времени");
        library.addBookToLibrary("Зеленая лампа");
        library.addBookToLibrary("Шинель");
        library.addBookToLibrary("История одного города");
        library.addBookToLibrary("Мёртвые души");
        library.addBookToLibrary("Демон");
        library.addBookToLibrary("Левша");
        library.addBookToLibrary("Отцы и дети");
        library.addBookToLibrary("Детство");

        System.out.println(library);
        Reader reader1 = new Reader("Петров Валентин Владиславович", 1, "Искусство", "13.05.2020", "+79252553626");
        Reader reader2 = new Reader("Соловьев Петр Владимирович", 2, "Дизайн", "05.11.2021", "+79071236556");
        Reader reader3 = new Reader("Мищенко Дмитрий Сергеевич", 3, "Математика", "13.05.2020", "+79064569662");

        library.takeBook(reader1, "Отцы и дети");
        System.out.println(library);
        library.returnBook(reader1, "Отцы и дети");
        System.out.println(library);
    }
}