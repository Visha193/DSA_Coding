package Lecture3;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        
        //Q2. Given the 3 angles of a triangle. you need to check whether a valid triangle can be formed those 3 angles.

        //Input: 60 30 90
        //Output: "Valid Triangle"

        //Input: 60 30 40
        //Output: "Valid Triangle"

        //Condition: In order for a triangle to be a valid triangle, the sum of all sides of a triangle should be 180 & every side angle is greator than 0. 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Angle : ");
        int num0 = input.nextInt();
        System.out.print("Enter the Second Angle : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Third Angle : ");
        int num2 = input.nextInt();

        int number = (num0 + num1 + num2);
        if(number == 180 && num0 > 0 && num1 > 0 && num2 > 0){
            System.out.println("Formed A Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
