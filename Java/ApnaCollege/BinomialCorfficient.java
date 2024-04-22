public class BinomialCorfficient {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int BinomialCoefficient(int n, int r){
        int n_fact = factorial(n); //a
        int r_fact = factorial(r); //b
        int nmr_fact = factorial(n-r); // c

        int ncr = n_fact / (r_fact * nmr_fact); // ncr = a/(b*c)
        return ncr;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(BinomialCoefficient(5, 4));
    }
}


