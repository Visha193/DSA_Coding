import java.util.*;
public class LargestNum {
    public static int Largestsums(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < num.length; i++){
            if(largest < num[i]){
            largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest Number Found At Index : " + smallest);
        return largest;
    }

    public static void main(String [] args){
        int num[] = {2, 4, 5, 1, 9};
        System.out.println("Largest Number Found At Index : " + Largestsums(num));
    }
}
