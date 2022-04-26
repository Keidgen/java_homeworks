package pro.sky.java.course1.lesson10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Base");
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

        System.out.println("Medium");
        Book bookHPThree = new Book("Harry Potter and the Prisoner of Azkaban", authorJR, 1999);
        Book bookHPFour = new Book("Harry Potter and the Goblet of Fire", authorJR, 2000);
        Book bookHPFive = new Book("Harry Potter and the Order of the Phoenix", authorJR, 2003);
        Book bookHPSix = new Book("Harry Potter and the Half-Blood Prince", authorJR, 2005);
        Book bookHPSeven = new Book("Harry Potter and the Deathly Hallows", authorJR, 2007);

        Library library = new Library(4);
        library.addBook(bookHPOne);
        library.addBook(bookHPTwo);
        library.addBook(bookHobbit);
        library.addBook(bookLR);
        library.addBook(bookHPThree);
        library.addBook(bookHPFour);
        library.addBook(bookHPFive);
        library.addBook(bookHPSix);
        library.addBook(bookHPSeven);

        library.printInfoAboutBook("Harry Potter and the Philosopher's Stone");
        library.printInfoAboutBook("Harry Potter and the Chamber of Secrets");
        library.printInfoAboutBook("Harry Potter and the Order of the Phoenix");
        library.printInfoAboutBook("The Lord of the Rings");
        library.printInfoAboutBook("Harry Potter and the Deathly Hallows");

        library.changeYearPublish("Harry Potter and the Deathly Hallows", 2011);
        library.printInfoAboutBook("Harry Potter and the Deathly Hallows");

        System.out.println(bookLR.toString());
        if (bookHPFive.equals(bookHPSeven)) {
            System.out.println("Это одна и та же книга");
        } else System.out.println("Книги разные");

        if (bookHobbit.equals(bookHobbit)) {
            System.out.println("Это одна и та же книга");
        } else System.out.println("Книги разные");
    }

}
