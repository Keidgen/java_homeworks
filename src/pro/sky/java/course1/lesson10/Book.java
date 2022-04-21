package pro.sky.java.course1.lesson10;

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
}
