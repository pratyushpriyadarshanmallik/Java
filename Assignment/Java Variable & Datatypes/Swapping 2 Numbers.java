//Q5 - Write a Java program to swap two numbers with the help of a third variable.
public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("Before Swapping x is "+x +" and y is "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping x is "+x +" and y is "+y);
    }
}
