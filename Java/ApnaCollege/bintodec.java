public class bintodec {
    
    public static void BintoDec(int BinNum){
        int myNum = BinNum;
        int pow = 0;
        int decNum = 0;

        while(BinNum > 0){
            int lastdigit = BinNum % 10;
            decNum = (decNum + (lastdigit * (int)Math.pow(2, pow)));
            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        BintoDec(101);
    }
}
