package task4lvl1;
import java.util.ArrayList;
import java.util.List;
class Library {

    private List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String name) {
        if(!books.contains(name)) {
			books.add(name);
		}
    }

    public void addBookToIndex(String name, int index) {
        if(!books.contains(name)) {
			books.add(index, name);
		}
    }

    public List<String> getAllbooks() {
        return books;
    }

    public String getBook(int index) {
        return books.get(index);
    }

    public void deleteBook(String name) {
        books.remove(name);
    }

    public int getSize() {
        return books.size();
    }
}
