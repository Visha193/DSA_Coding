package Lecture2;

public class AssignmentOperators {
    public static void main(String[] args) {
        
        //Assignment operators are used in java to assign value to variables.

        int age;
        age = 5;

        int a  = 20;
        int val = age;

        System.out.println(val);

        val += a; // val = val + a => 5 + 20

        System.out.println(val);

        val -=a; // val = val - a => 5 - 20

        val *=a; // val = val * a

        val /=a; // val = val / a

        val %=a; // val = val % a
        
    }
}
