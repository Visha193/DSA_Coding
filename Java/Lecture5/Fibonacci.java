import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the Number : "); 
    int n = sc.nextInt();

    int a = 0;
    int b = 1;
    int count = 1;

    while(count <= n+1)
    {
        System.out.println(a);
        int sum = a+b;
        a = b;
        b = sum;
        count += 1;
        } 
    }
}
