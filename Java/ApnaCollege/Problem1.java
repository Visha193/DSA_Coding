import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // int n = 1;
        // while(n <= 10){
        //     System.out.println(n);
        //     n++;
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number : ");
        // int n = sc.nextInt();
        // int i=1;
        // while(i <= n){
        //     System.out.println(i);
        //     i++;
        // }

        // System.out.print("Enter the Number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 0;
        // while(i <= n){
        //     sum += i;
        //     i++;
            
        // }
        // System.out.println(sum);

        // System.out.print("Enter the Number : ");
        // int n = sc.nextInt();

        // while(n>0){
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n/10;
        // }

        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        while(n>0){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n/10;
        }
        System.out.print(rev);
    }
}



