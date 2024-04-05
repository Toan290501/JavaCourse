public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("Alice", 20, 3.5));
        manager.addStudent(new Student("Bob", 22, 3.9));
        manager.addStudent(new Student("Charlie", 19, 3.2));

        System.out.println("Student list:");
        manager.printStudents();

        manager.sortStudentsByGPA();
        System.out.println("\nSoft by GPA:");
        manager.printStudents();

        System.out.println("\nfind student 'Bob':");
        manager.findStudentByName("Bob").ifPresent(System.out::println);
    }
}
