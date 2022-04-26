package pro.sky.java.course1.lesson10;

public class Library {
    private Book[] bk;

    public Library(int sizeArr) {
        this.bk = new Book[sizeArr];
    }

    public void addBook(Book book) {
        Book[] newBook = new Book[this.bk.length + 1];

        for (int i = 0; i < this.bk.length; i++) {
            newBook[i] = this.bk[i];
        }
        newBook[newBook.length - 1] = book;
        this.bk = newBook;

    }

    public void printInfoAboutBook(String title) {
        Book[] bk = this.bk;
        for (int i = 0; i < bk.length; i++) {
            if (bk[i] == null) {
                continue;
            }
            if (bk[i].getTitleBook().equals(title)) {
                System.out.println(bk[i].getTitleBook() + " by " + bk[i].getAuthor() + " was published in " + bk[i].getYearPublish());
                break;
            }
        }
    }

    public void changeYearPublish(String title, int newYear) {
        Book[] bk = this.bk;
        for (int i = 0; i < bk.length; i++) {
            if (bk[i] == null) {
                continue;
            }
            if (bk[i].getTitleBook().equals(title)) {
                bk[i].setYearPublish(newYear);
                break;
            }
        }
    }
}
