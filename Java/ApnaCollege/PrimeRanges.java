public class PrimeRanges {
    public static boolean OptimizedisPrime(int n){
        if(n == 2){
            return true;
        }
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

        public static void PrimeRange(int n){
            for(int i = 2; i <= n; i++){
                if(OptimizedisPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeRange(100);
    }
}
