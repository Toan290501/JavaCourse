import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter Book 's name");
        String bookTitle = scanner.nextLine();
        System.out.println("emter author");
        String bookAuthor = scanner.nextLine();

        System.out.println("enter CD title");
        String cdTitle = scanner.nextLine();
        System.out.println("Enter CD artist");
        String cdArtist= scanner.nextLine();

        library.addItem(new Book(bookTitle, bookAuthor));
        library.addItem(new CD(cdTitle, cdArtist));

        printLibraryDetails(library);
    }

    public static void printLibraryDetails(Library library) {
        for (Item item : library.getItems()) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
            } else if (item instanceof CD) {
                CD cd = (CD) item;
                System.out.println("CD: " + cd.getTitle() + " by " + cd.getArtist());
            }
        }
    }
}
