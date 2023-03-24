import com.sun.source.tree.LiteralTree;
import jdk.jshell.EvalException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<>();
        int option;
        do {
            try {
                System.out.println("----------- Welcome to Student-management-console-application ------------");
                System.out.println("1. Select");
                System.out.println("2. Insert students");
                System.out.println("3. Update student's data");
                System.out.println("4. Remove students");
                System.out.println("5. Show all the students");
                System.out.println("6. Exit!");
                System.out.print("Input the number 1 - 5 : ");
                option = input.nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.println("------------- Selecting student data ---------------");

                        LinkedHashSet<String> Class = new LinkedHashSet<>();
                        LinkedHashSet<Integer> grade = new LinkedHashSet<>();
                        for (Student item : student) {
                            Class.add(item.Class);
                            grade.add(item.grade);
                        }
                        System.out.println("All Classes: ");
                        for (String i : Class) {
                            System.out.print (i + " ");
                        }
                        System.out.println("All Grade: ");
                        for (Integer i : grade) {
                            System.out.print (i + " ");
                        }
                        System.out.println("1. select by class");
                        System.out.println("2. select by class");
                        switch (input.nextInt()){
                            case 1->
                            {
                                System.out.println("Select students by class : ");
                                String input_class = input.next();
                                for (Student value : student) {
                                    if (input_class.equals(value.Class)) {
                                        value.output();
                                        System.out.println("\n");
                                    }
                                }
                            }
                            case 2->
                            {
                                System.out.println("Select students by grade : ");
                                int input_grade = input.nextInt();
                                for (Student value : student) {
                                    if (input_grade == value.grade) {
                                        value.output();
                                        System.out.println("\n");
                                    }
                                }
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("------------- insert Student data -----------------");
                        Student obj = new Student();
                        obj.input(input);
                        student.add(obj);
                    }
                    case 3 -> {
                        System.out.println("----------------- update student data ------------------");
                        System.out.println("Enter Student ID: ");
                        String search_id = input.next();
                        for (Student value : student) {
                            if (value.id.equals(search_id)) {
                                System.out.println("1. update score");
                                System.out.println("2. update grade");
                                System.out.println("3. Update ID");
                                switch (input.nextInt()) {
                                    case 1 -> {
                                        System.out.println("Input new score: ");
                                        value.score = input.nextInt();
                                    }
                                    case 2 -> {
                                        System.out.println("Input new grade: ");
                                        value.grade = input.nextInt();
                                    }
                                    case 3 -> {
                                        System.out.println("New ID: ");
                                        value.id = input.next();
                                    }
                                }
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("--------------------- Remove student ----------------------");
                        System.out.println("1. Remove by ID");
                        System.out.println("2. Remove by Name");
                        switch (input.nextInt()) {
                            case 1 -> {
                                System.out.println("Enter student's ID: ");
                                String old_id = input.next();
                                student.removeIf(Student -> Student.id.equals(old_id));
                            }
                            case 2 -> {
                                System.out.println("Enter student's name: ");
                                String old_name = input.next();
                                student.removeIf(Student -> Student.name.equals(old_name));
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println("----------------- Student information ------------------");
                        for (Student value : student) {
                            value.output();
                            System.out.println(" ");
                        }
                    }
                    default -> System.out.println("----------------- Thank you! -----------------");
                }
            }catch (InputMismatchException e){
                input.next();
                System.out.println("Please try again! Should be integer!");
                option = 0;
            }
        } while (option!=6);
    }
}