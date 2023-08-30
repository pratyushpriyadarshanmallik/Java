import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter Rate of Intrest: ");
        float r = sc.nextFloat();
        System.out.println("Enter time: ");
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("Principle: "+p);
        System.out.println("Rate: "+r);
        System.out.println("Time: "+t);
        System.out.println("Simple Intrest:"+si);
    }
}
