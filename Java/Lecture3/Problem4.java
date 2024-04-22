package Lecture3;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        
        //Q. Given 3 sides of a triangle. check if its euilateral, isosceles, or scalene.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Three Sides : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a==b && b==c){
            System.out.println(" It is A Equilateral Triangle ");
        }else if(a==b || a==c || b==c){
            System.out.println(" It is A Isosceles Triangle ");
        }else{
            System.out.println(" It is A Scalene Triangle ");
        }
    }
}
