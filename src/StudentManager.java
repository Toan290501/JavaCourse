import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public boolean removeStudent(String name) {
        return students.removeIf(student -> student.getName().equals(name));
    }

    public void sortStudentsByGPA() {
        Collections.sort(students);
    }

    public Optional<Student> findStudentByName(String name) {
        return students.stream().filter(student -> student.getName().equals(name)).findFirst();
    }

    public void printStudents() {
        students.forEach(System.out::println);
    }
}
