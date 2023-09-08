//Q5 - Given few lines of input(number of lines unknown) where each line has two
//strings, concatenate the strings.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()){
            String a = input.next();
            String b = input.next();
            System.out.println(a+b);
        }
    }
}
