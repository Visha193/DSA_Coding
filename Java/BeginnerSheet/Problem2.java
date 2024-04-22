package BeginnerSheet;

import java.util.Scanner;

public class Problem2 {

    //3) Write a Program to Add Two Integer Numbers Entered by User
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number A :");
        int a = sc.nextInt();
        System.out.print("Enter the Number B :");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum Of Numbers Are " + sum);
    }
}
