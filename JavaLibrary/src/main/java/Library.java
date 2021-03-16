import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;

    }

    public int countBooks() {
        return this.stock.size();
    }

    public void addBookToLibrary(Book book) {
        if (!checkLibraryIsAtCapacity()){
            this.stock.add(book);
        }
    }

    public boolean checkLibraryIsAtCapacity() {
        if (this.countBooks() >= this.capacity){
            return true;
        } else {
            return false;
        }
    }

    public void removeBookFromLibrary(Book book) {
        this.stock.remove(book);
    }
}