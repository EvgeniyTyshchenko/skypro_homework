package sky.pro.java.course1.hw12;

import java.util.Objects;

public class Book {
    final private String nameOfTheBook;
    final private Author author;
    private int publicationYear;

    public Book(String nameOfTheBook, Author author, int publicationYear) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getNameOfTheBook() {
        return nameOfTheBook;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString() {
        return nameOfTheBook + author + publicationYear;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Book book = (Book) object;
        return nameOfTheBook.equals(book.nameOfTheBook) && author.equals(author) && publicationYear == book.publicationYear;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, author, publicationYear);
    }
}