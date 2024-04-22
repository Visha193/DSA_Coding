package Lecture4;
import java.util.*;
public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number You Want to check :");
        int n = sc.nextInt();
        int a = 0;    

        for(int i = 2; i<n; i++){
            if(n%i==0){
                a++;
            }
        }
        if(n==0 || n==1){
        System.out.println("not prime");
        }
            else if(a==0){
                System.out.println("It is a prime No");
            }
            else
            {
                System.out.println("It is not a Prime No");
            }

        // System.out.print("Enter the Number You Want to check :");
        // int m = sc.nextInt();

        // int div = 2;
        // int flag = 0;

        // while(div <= m-1){
        //     if(m % div == 0){
        //         flag = 1;
        //         break;
        //     }
        //     div += 1;
        // }
        
        // if(flag == 1){
        //     System.out.println("It is not a Prime Number");
        // }else{
        //     System.out.println("It is a prime");
        // }

        }
    }