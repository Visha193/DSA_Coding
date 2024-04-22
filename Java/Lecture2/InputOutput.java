package Lecture2;
import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Hello");

        int val = 20;

        System.out.println(val);
        System.out.println(5);

        System.out.println("I am " + "awesome at programming");
        System.out.println("Number = " + val); // Number = 20;
        
        //create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Value : ");
        //Take input from user
        int number = sc.nextInt();
        System.out.println("You entered " + number);
    }
    
}
