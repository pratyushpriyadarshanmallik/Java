//Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
//to calculate his total marks and percentage marks.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        float mark_1 = input.nextFloat ();
        float mark_2 = input.nextFloat ();
        float mark_3 = input.nextFloat ();
        float total_marks = mark_1+mark_2+mark_3;
        System.out.println("Total marks of Robert is: "+total_marks);
        float percentage = total_marks/3;
        System.out.println("Percentage obtained: "+percentage +"%");
    }
}
