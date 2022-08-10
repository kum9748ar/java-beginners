package Java_Conditionals;

import java.util.Scanner;

public class GradeCard {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        marks = sc.nextInt();
        String grade;
        grade = (marks >= 90) ? "A" : (marks <= 89 && marks >= 70) ? "B" : (marks <= 69 && marks >= 50) ? "C" : "D";
        System.out.println("Result is" + grade);
    }

}
