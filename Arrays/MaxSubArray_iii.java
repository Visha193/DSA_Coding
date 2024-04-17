
public class MaxSubArray_iii {

    public static void kadane(int nums[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        // Q : give me the code that passed the all negative test cases
        // A : we will take the maximum value of the array and then we will check if the sum is negative then we will start from 0
        

        for(int i=0; i<nums.length;i++){ // traversing the array
            cs = cs + nums[i]; // adding the elements of the array

            if(cs<0){
                cs = 0;
            }

            ms = Math.max(cs, ms); // finding the maximum sum
        }

        System.out.println("Max SubArray Are : "+  ms);
    }

    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(num);
    }

    // public static void main(String[] args) {
    //     int num[] = {-1,-2,-3,-4};
    //     kadane(num);
    // }
}