package BeginnerSheet;

import java.util.Scanner;

public class Problem3 {

    /*4) Write a program where the user is asked to enter two integers (divisor and dividend) and the quotient and the remainder of their division is computed.(Both divisor and dividend should be integers.)*/
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Dividend :");
        int a = sc.nextInt();
        System.out.print("Enter the Divisor :");
        int b = sc.nextInt();

        int quotient = a / b;
        int division = a % b;

        System.out.println("quotient of their division is computed " + quotient);
        System.out.println("remainder of their division is computed " + division);


    }
}
