package Lecture4;

public class forloop {
    public static void main(String[] args) {
        
        //Task to print numbers from 1- 10.

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);

        int n = 10;

        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Hello " + i);
        }


        // printing numbers from 15 to 25

        int max = 25;
        for(int i = 15; i<=max; i++){
            System.out.println("hello" + i);
        }

        //print the sum of a natural number from 1 to 1000.

        // (1 - 4) => 1 + 2 + 3 + 4 => 10
        int sum = 0;
        for(int i = 1; i<=1000; i++){
            sum += i;
            System.out.println(sum);
        }

        
    }
}


