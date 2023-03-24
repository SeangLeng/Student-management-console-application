import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    String name;
    String id;
    int age;
    String Class;
    float score;
    int grade;
    Student(){}

    public Student(String name, String id, int age, String aClass, float score, int grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.Class = aClass;
        this.score = score;
        this.grade = grade;
    }
    void input(Scanner input) throws InputMismatchException {
        System.out.println("Enter Student name: ");
        name = input.next();
        System.out.println("Enter Student ID: ");
        id = input.next();
        System.out.println("Enter Student Age: ");
        age = input.nextInt();
        System.out.println("Enter Student's class: ");
        Class = input.next();
        System.out.println("Enter score: ");
        score = input.nextFloat();
        System.out.println("Enter grade: ");
        grade = input.nextInt();
    }
    void output(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Class: " + Class);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }
}
