import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name=sc.nextLine();

        System.out.println("Enter Age:");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course:");
        String course=sc.nextLine();

        System.out.println("Enter Email:");
        String email=sc.nextLine();

        StudentDAO dao= new StudentDAO();
        dao.addStudent(name,age,course,email);

        System.out.println("student added successfully");

    }
}