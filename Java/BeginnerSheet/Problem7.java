package BeginnerSheet;

import java.util.Scanner;

public class Problem7 {

    //8) Write a Program to Multiply two decimal Numbers entered by User
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number A :");
        int a = sc.nextInt();
        System.out.print("Enter the Number B :");
        int b = sc.nextInt();

        int mul = a * b;

        System.out.println("Sum Of Numbers Are " + mul); 
    }
}
