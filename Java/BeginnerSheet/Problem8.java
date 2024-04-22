package BeginnerSheet;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        int a = 0;

        for(int i=2;i<n;i++){
            if(n%i==0)
            {
                a++;
            }
        }
            if(n==0 || n==1){
            System.out.println("Not Prime");
            }
            else if(a==0){
            System.out.println("It is a Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
    } 
}
