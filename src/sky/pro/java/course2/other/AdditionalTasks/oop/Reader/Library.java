package sky.pro.java.course2.other.AdditionalTasks.oop.Reader;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[10];
    }

    public void addBookToLibrary(String bookName){
        Book book = new Book(bookName);
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                break;
            }
        }
    }

    public void takeBook(Reader reader, String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)) {
                System.out.println("Студент: " + reader.getFullName() + ", взял книгу: " + bookName);
                books[i] = null;
            }
        }
    }

    public void returnBook(Reader reader, String bookName) {
        Book book = new Book(bookName);
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
            }
        }
        System.out.println("Студент: " + reader.getFullName() + ", вернул книгу: " + bookName);
    }

    @Override
    public String toString() {
        return "Перечень имеющихся книг: " + Arrays.toString(books);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }
}
