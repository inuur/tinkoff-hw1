import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {

    static Student student1 = new Student("Ainur", 22, 2);
    static Student student2 = new Student("Anton", 22, 2);
    static Student student3 = new Student("Anton", 26, 2);

    @Test
    public void testHashCodeEquality() {
        assertEquals(student1.hashCode(), student2.hashCode());
    }

    @Test
    public void testHashCodeIsTheModOf10() {
        assertEquals(student1.hashCode(), 2);
        assertEquals(student3.hashCode(), 6);
    }

    @Test
    public void testIfHashCodeNotEqualToNotBeEqualFields() {
        assertNotEquals(student1.hashCode(), student3.hashCode());
        assertNotEquals(student1, student2);
    }
}
