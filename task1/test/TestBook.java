import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestBook {

    static Book book1 = new Book("Head First Java", 150, 1);
    static Book book2 = new Book("Head First Java", 150, 1);
    static Book book3 = new Book("Something about python", 150, 1);
    static Book book4 = new Book("Something about python", 150, 2);
    static Book book5 = new Book("Something about python", 200, 2);

    @Test
    public void testBookHashCodeEquality() {
        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void testBookEqualMethod() {
        assertEquals(book1, book2);
        assertNotEquals(book1, book3);
    }

    @Test
    public void testBookObjectsEqualsButNotHashCode() {
        assertEquals(book3, book4);
        assertNotEquals(book3.hashCode(), book4.hashCode());
    }

    @Test
    public void testBookObjectsEqualityWithNull() {
        assertNotEquals(null, book3);
    }

    @Test
    public void testBookObjectsEqualityWithAnotherClassObject() {
        assertNotEquals(book3, new ArrayList<>());
    }

    @Test
    public void testBookObjectsEqualityWithDifferentNames() {
        assertNotEquals(book2, book3);
    }

    @Test
    public void testBookObjectsEqualityWithDifferentNumbersOfLists() {
        assertNotEquals(book3, book5);
    }
}
