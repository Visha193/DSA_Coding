

public class Pairs_in_array {
    public static void PairArray(int num[]){
        int tnp = 0;
        for(int i = 0; i<num.length;i++){
            int curr = num[i];
            for(int j = i+1; j<num.length;j++){
                System.out.print("(" + curr + "," + num[j] + ")");
                tnp++;
            }
            System.out.println();
        }
        System.out.println("Total No Of Pairs: " + tnp);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        PairArray(num);
    }
    
}
