public class MaxSubArraySum {
    public static void prefixsum(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefixsums[] = new int[num.length];
        prefixsums[0] = num[0];

        // calculate prefix array
        for(int i = 1; i<prefixsums.length; i++){
            prefixsums[i] = prefixsums[i-1] + num[i];
        }

        for(int i = 0; i<num.length;i++){
            int start = i;
            for(int j= i; j<num.length;j++){
                int end = j;

                currsum = start == 0 ? prefixsums[end] : prefixsums[end] - prefixsums[start-1]; 

                if(maxsum > currsum){
                    maxsum = currsum;
                }
            }    
        }
        System.out.println("max sum :" + maxsum);
    }

    public static void main(String[] args) {
        int num[] = {1, -2, 6, -1, 3};
        prefixsum(num);
    }
}
