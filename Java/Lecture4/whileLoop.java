package Lecture4;
import java.util.*;
public class whileLoop {
    public static void main(String[] args) {

        int n1 = 10;
        int i1 = 1;
        while(i1 <= n1){
            System.out.println("hello" + i1);
            i1++;
        }
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            ans = ans*10 + rem;
        }
        System.out.print(ans);
    }
}
