package Lecture3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        
        //Q1. Take a user input is an integer. If the input value is even or odd.

        //Input: 4
        //Output: "Even"

        //Input: 5
        //Output: "Odd"

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number You Have To Check : ");
        int number = input.nextInt();
        if(number % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
