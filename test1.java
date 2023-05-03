public class test1 {
    public static void main(String[] args) {
        Library lib = new Library();
        Books b1 = new Books();

        b1.bookName = "Dumb Witness";
        b1.authorName = "Agatha Christie";
        b1.pages = 256;
        lib.adding(b1.bookName);
        lib.show();
    }
}