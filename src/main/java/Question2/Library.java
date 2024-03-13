package Question2;

public class Library {
    String bookName;
    int numberOfCopy;
    String authorName;
    public  void descriptionType(){
        descriptionType();
    }

    public Library(String bookName, int numberOfCopy, String authorName) {
        this.bookName = bookName;
        this.numberOfCopy = numberOfCopy;
        this.authorName = authorName;
    }
}
class HorrorTypeOfBook extends Library{

    public HorrorTypeOfBook(String bookName, int numberOfCopy, String authorName) {
        super(bookName, numberOfCopy, authorName);
    }

    @Override
    public void descriptionType() {
        System.out.println("horror type ");
    }
}

class AdventureTypeOfBook extends Library{
    public AdventureTypeOfBook(String bookName, int numberOfCopy, String authorName) {
        super(bookName, numberOfCopy, authorName);
    }

    @Override
    public void descriptionType() {
        System.out.println("Adventure type");
    }
}
class Demo{
    public static void main(String[] args) {
        // static binding happens at compile time so the compiler know
        Library book = new HorrorTypeOfBook("B",3,"j");

        book.descriptionType(); // static binding this happens at compile time the compiler knows that
        // the type of book is horror it happens at compile time

    }
}