package Lecture3;
import java.util.*;
public class SumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n; i++)
        {   
            sum += i;
        }
        System.out.println("Sum of Numbers Are : " + sum);
    } 
}
