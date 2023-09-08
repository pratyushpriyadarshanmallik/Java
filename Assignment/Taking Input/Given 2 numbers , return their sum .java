//Q4 - Given two numbers, return their sum in the following format:
//Int t representing number of test cases
//T lines of Two integers representing the numbers to be added
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i =1;i<=t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a+b);
        }
    }
}
