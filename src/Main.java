import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        GPA gpa = new GPA();

        System.out.println("Enter student name: ");
        student.setName(scanner.nextLine());

        System.out.println("Enter student id: ");
        student.setID(scanner.nextLine());

        System.out.println("Enter student Phone: ");
        student.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter student old: ");
        student.setOld(scanner.nextInt());

        Student s = new Student(student.getName(), student.getID(), student.getOld(),"08546333", student.getPhoneNumber());

        System.out.println("Enter student score: ");
        gpa.setScore(scanner.nextDouble());

        System.out.println("Enter student active score: ");
        gpa.setActiveScore(scanner.nextInt());
        GPA g = new GPA(s.getName(),student.getID(), student.getOld(),"08546333", student.getPhoneNumber(), gpa.getScore(), gpa.getActiveScore(), true);

        studentDetail(g,s);
    }

     public static void studentDetail (GPA gpa, Student student){
        System.out.println(gpa.toString());
     }



}
