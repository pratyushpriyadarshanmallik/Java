//Q1 - Input name, roll number and field of interest from user and print in the format below :
//Name: xyz, Roll number: xyz, Field of interest: xyz
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
        String first_name =input.next();
        System.out.print("Enter Your Last Name: ");
        String last_name =input.next();
        System.out.print("Enter Your Roll No: ");
        int roll_no = input.nextInt();
        System.out.print("Enter Your Field of Interest: ");
        String field_of_interest = input.next();
        System.out.println("Name: "+first_name +" "+last_name);
        System.out.println("Roll no : "+roll_no);
        System.out.println("Field of interest: "+field_of_interest);
    }
}
