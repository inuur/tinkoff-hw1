import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Object, Double> hashMap = new HashMap<>();

        Student student1 = new Student("Ainur", 22, 2);
        Student student2 = new Student("Anton", 22, 2);
        Book book1 = new Book("Head First Java", 150, 1);
        Book book2 = new Book("Head First Java", 150, 2);

        hashMap.put(student1, 5.5);
        hashMap.put(student2, 4.5);
        hashMap.put(book1, 5.5);
        hashMap.put(book2, 4.5);

        // *
        Map<Object, Double> hashTable = new Hashtable<>();

        hashTable.put(student1, 5.5);
        hashTable.put(student2, 4.5);
        hashTable.put(book1, 5.5);
        hashTable.put(book2, 4.5);
    }
}
