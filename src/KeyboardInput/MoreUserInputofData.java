package KeyboardInput;

import java.util.Scanner;

public class MoreUserInputofData {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        String fName;
        String lName;
        int grade;
        int sid;
        String login;
        float gpa;

        System.out.print("First name: ");
        fName = keyBoard.next();
        System.out.print("Last name: ");
        lName = keyBoard.next();
        System.out.print("Grade (9-12): ");
        grade = keyBoard.nextInt();
        System.out.print("Student ID: ");
        sid = keyBoard.nextInt();
        System.out.print("Login: ");
        login = keyBoard.next();
        System.out.print("GPA (0.0-4.0): ");
        gpa = keyBoard.nextFloat();

        System.out.printf("Your information:\n\tLogin: \t%-2s\n\tID: \t%-6d\n\tName: \t%-5s, %-5s\n\tGPA: \t%-1.2f" +
                "\n\tGrade: \t%-2d", login, sid, lName, fName, gpa, grade);
    }
}
