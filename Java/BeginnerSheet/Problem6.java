 package BeginnerSheet;

import java.util.Scanner;

public class Problem6 {

    //7) Write a Program to Find ASCII Value of a Character.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character :");
        char a = sc.next().charAt(0);

        System.out.println("ASCII Value of " + a + " is " + (int) a);
    }
}
