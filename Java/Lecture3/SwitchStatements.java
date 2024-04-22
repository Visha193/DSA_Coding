package Lecture3;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Switch Statements

    int number = 100;
    String petrolPrice;

    switch(number) {
        case 100: 
        petrolPrice = "VeryHigh";
            break;
        case 80:
        petrolPrice = "High";
            break;
        case 60:
        petrolPrice = "Average";
        break;
        case 50:
        petrolPrice = "Low";
        break;
        default:
        petrolPrice = "Very Low";
            break;
        }
        System.out.println("Status Of Petrol Price Are : " + petrolPrice);
    }

}
