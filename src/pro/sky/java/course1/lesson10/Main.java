package pro.sky.java.course1.lesson10;

public class Main {
    public static void main(String[] args) {
        Author authorJR = new Author("Joanne", "Rowling");
        Author authorJT = new Author("John", "Tolkien");
        Book bookHPOne = new Book("Harry Potter and the Philosopher's Stone", authorJR, 1997);
        Book bookHPTwo = new Book("Harry Potter and the Chamber of Secrets", authorJR, 1998);
        Book bookHobbit = new Book("The Hobbit, or There and Back Again", authorJT, 1937);
        Book bookLR = new Book("The Lord of the Rings", authorJT, 1954);

        bookLR.setYearPublish(1955);
        System.out.println(bookHPOne.getAuthor() + " " + bookHPOne.getTitleBook() + " " + bookHPOne.getYearPublish());
        System.out.println(bookHPTwo.getAuthor() + " " + bookHPTwo.getTitleBook() + " " + bookHPTwo.getYearPublish());
        System.out.println(bookHobbit.getAuthor() + " " + bookHobbit.getTitleBook() + " " + bookHobbit.getYearPublish());
        System.out.println(bookLR.getAuthor() + " " + bookLR.getTitleBook() + " " + bookLR.getYearPublish());
    }
}
