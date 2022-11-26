package sky.pro.java.course1.hw12;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }
    public void putBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }
    public void showAllBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getNameOfTheBook() + books[i].getAuthor() + books[i].getPublicationYear());
            } else {
                System.out.println("Список пуст!");
            }
        }
    }
    public void printInfoAboutTheBook(String nameOfTheBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getNameOfTheBook().equals(nameOfTheBook)) {
                System.out.println("Книга: " + books[i].getNameOfTheBook() + ", которую написал" + books[i].getAuthor().getName() + books[i].getAuthor().getSurname() + ", была опубликована в " + books[i].getPublicationYear());
            }
        }
    }
    public void setPublicationYear(String nameBook, int year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getNameOfTheBook().equals(nameBook)) {
                books[i].setPublicationYear(year);
            }
        }
    }
    @Override
    public String toString() {
        return "Library: " + "books=" + Arrays.toString(books) + "}";
    }
}
