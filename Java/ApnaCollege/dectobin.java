public class dectobin {
    
    public static void dectoBin(int DecNum){
        int myNum = DecNum;
        int pow = 0;
        int BinNum = 0;

        while(DecNum > 0){
            int lastdigit = DecNum % 2;
            BinNum = BinNum + (lastdigit *(int)Math.pow(10, pow));
            pow++;
            DecNum = DecNum / 2;
        }
        System.out.println("BinNum of " + myNum + " is " + BinNum);
    }

    public static void main(String[] args) {
        dectoBin(4);
    }
}
