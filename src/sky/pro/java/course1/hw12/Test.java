package sky.pro.java.course1.hw12;

public class Test {
    public static void main(String[] args) {

        Author author1 = new Author(" Михаил", " Булгаков ");
        Book book1 = new Book("Мастер и Маргирита", author1, 1967);
        Author author2 = new Author(" Лев", " Толстой ");
        Book book2 = new Book("Война и мир", author2, 1869);

        System.out.println("Book 1: " + book1.getNameOfTheBook() + author1.toString() + book1.getPublicationYear());
        System.out.println("Book 2: " + book2.getNameOfTheBook() + author2.toString() + book2.getPublicationYear());

        System.out.println("___ Доп задача ___");
        Author author3 = new Author(" Михаил", " Шолохов ");
        Book book3 = new Book("Тихий Дон", author3, 1928);
        Author author4 = new Author(" Александр", " Пушкин ");
        Book book4 = new Book("Евгений Онегин", author4, 1833);
        Author author5 = new Author(" Михаил", " Булгаков ");
        Book book5 = new Book("Собачье Сердце", author5, 1988);

        Library library = new Library (5);
        library.putBook(book1);
        library.putBook(book2);
        library.putBook(book3);
        library.putBook(book4);
        library.putBook(book5);
        library.showAllBooks();
        System.out.println();
        library.printInfoAboutTheBook("Война и мир");
        System.out.println();
        library.setPublicationYear("Тихий Дон", 1930);
        library.printInfoAboutTheBook("Тихий Дон");
        System.out.println("___ДЗ 1.13___");
        System.out.println(author5);
        System.out.println(book5);
        System.out.println();
        System.out.println(book1.equals(book4));
        System.out.println(author2.equals(author3));
        System.out.println();
        System.out.println(book1.hashCode()==book4.hashCode());
        System.out.println(author2.hashCode()==author3.hashCode());
        System.out.println();
        System.out.print(library);
    }
}
