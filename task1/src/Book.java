import java.util.Objects;

public class Book {

    private final String name;
    private final int numberOfLists;
    private final int weights;

    public Book(String name, int numberOfLists, int weights) {
        this.name = name;
        this.numberOfLists = numberOfLists;
        this.weights = weights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        if (numberOfLists != book.numberOfLists) return false;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + numberOfLists;
        return result + weights;
    }
}
