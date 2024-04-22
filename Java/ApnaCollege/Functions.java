import java.util.*;
public class Functions {

    // public static void swap(int a, int b){
    //     // swap
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("A = " + a + " " +  "B = " + b);
        
    // }
    // public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     swap(a , b);

    public static int multiply(int a, int b){
        int sum = a*b;
        return sum;
    }

    public static void main(String[] args) {
        int product = multiply(3, 5);
        System.out.println(product); 
    }
}
