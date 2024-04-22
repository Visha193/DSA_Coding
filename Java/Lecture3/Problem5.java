package Lecture3;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        
        //Q. Given the Week number, find the corresponding day of the week.

        // 1 - Monday
        // 4 - Thrusday

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Week Number");
        int WeekNum = input.nextInt();
        switch (WeekNum) {
            case 1:
            System.out.println("Monday");  
                break;
            case 2:
            System.out.println("Tuesday");  
                break;
            case 3:
            System.out.println("Wednesday");  
                break;
            case 4:
            System.out.println("Thrusday");  
                break;
            case 5:
            System.out.println("Friday");  
                break;
            case 6:
            System.out.println("Saturday");  
                break;
            case 7:
            System.out.println("Sunday");  
                break;
            default:
                System.out.println("You Have To Entered A Number Between (1-7) ");
                break;
        }
    }
}
