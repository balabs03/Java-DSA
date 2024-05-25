package Assignments;
import java.util.Scanner;
public class _8_Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark : ");
        int marks = sc.nextInt();
        grade(marks);
    }
    static void grade(int marks){
        if(marks >= 91 && marks <= 100){
            System.out.println("The grade is AA");
        }else if(marks >= 81 && marks <= 90){
            System.out.println("The grade is AB");
        }else if(marks >= 71 && marks <= 80) {
            System.out.println("The grade is BB");
        }else if(marks >= 61 && marks <= 70) {
            System.out.println("The grade is BC");
        }else if(marks >= 51 && marks <= 60) {
            System.out.println("The grade is CD");
        }else if(marks >= 41 && marks <= 50) {
            System.out.println("The grade is DD");
        }else{
            System.out.println("Fail");
        }
    }
}
