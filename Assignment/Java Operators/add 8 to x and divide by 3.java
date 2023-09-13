//Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//is taken with 5 and then multiply the resultant value by 5. Display the final result.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        x = x+8;
        x/=3;
        x%=5;
        x*=5;
        System.out.println(x);
    }
}
