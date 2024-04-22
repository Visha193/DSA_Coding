package IntroTopics;

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        
        System.out.println("HelloWorld");

        System.out.println("1, println");
        System.out.println("2, println");

        System.out.print("1, print");
        System.out.print("2, print");

        System.out.println();

        //System.out.println(format, arguments);
        System.out.printf("Hello %s!%n", "World");
        System.out.printf("Java is %d percent fun!", 100);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the body Weight : ");
        float myWeight = input.nextFloat();
        System.out.println("My Body Weight : " + myWeight);
        System.out.print("My Name Is : ");
        String myString = input.next();
        System.out.println("My Name Is " + myString);


    }
}
