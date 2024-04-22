package BeginnerSheet;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        
        //6) Write a Program to Swap Two Numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number A :");
        int a = sc.nextInt();
        System.out.print("Enter the Number B :");
        int b = sc.nextInt();
        
        
        System.out.println("Before Swapping of Two Numbers Are :" );
        System.out.println("a = " + a + ", b = " + b);
        
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping of Two Numbers Are :");
        System.out.println("a = " + a + ", b = " + b);
    }
}
