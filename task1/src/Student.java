import java.util.Objects;

public class Student {

    private final String name;
    private final int age;
    private final int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (course != student.course) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return age % 10;
    }
}
