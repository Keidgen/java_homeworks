package pro.sky.java.course1.lesson10;

import java.util.Objects;

public class Book {
    private String titleBook;
    private Author author;
    private int yearPublish;

    public Book(String titleBook, Author author, int yearPublish) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublish = yearPublish;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthor() {
        return author.getFirstName() + " " + author.getLastName();
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublish == book.yearPublish && titleBook.equals(book.titleBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, yearPublish);
    }

    @Override
    public String toString() {
        return titleBook + " " + author.toString() + " " + yearPublish;
    }
}
