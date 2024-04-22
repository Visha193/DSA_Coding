package Lecture3;
import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        
        //Q3. Given an year, print whether that year is a leap year or not.

        //Eg. 
        //Input: 2004
        //Output: "Leap Year"

        //Input: 2022
        //Output: "Not a Leap Year"

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int Year = input.nextInt();

        if((Year % 4 == 0 && Year % 100 != 0 )|| ( Year % 400 == 0)){
            System.out.println("Leap Year : " + Year);
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
