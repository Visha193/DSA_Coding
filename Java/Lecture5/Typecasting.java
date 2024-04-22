public class Typecasting {
    public static void main(String[] args) {
        
        /*  TypeCasting
        It is a method or process that converts a data types into another data type in both ways : 
        1. manually -> Programmer
        2. automatically -> Compiler

        --------------Narrowing TypeCasting----------->
        double -> float -> long -> int -> Short -> Byte
        <-------------Widening TypeCasting-------------

        It Has a Two types :
        1. Implicit TypeCasting/ Automatic/ Widening TypeCasting/ Casting Down
        2. Explicit Typecasting/ Manually/ Narrowing TypeCasting
        Smaller Data Types are converted to Bigger data types Automatically.*/
        // Case 1

        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

        // by = sh;
        // by = in;
        // by = lo;

        sh = by;
        // in = by;
        // lo = by;
         
        in = by;
        in = sh;
        // in = lo;

        lo = by;
        lo = sh;
        lo = in;

        // Case 2

        // by = 100;
        // for(byte b = 0; b <= 128; b++)
        // {
        //     System.out.println("Hello");
        // }

        // Case 3

        float f = 5.6f;
        double d = 6.5;

        // f = d;
        d = f; 

        // Case 4
        in = (int) f;

        byte b = (byte) 130;
        System.out.println(b);

        // Case 5

        char ch = 'a';

        in = ch;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int) ch);
        
        ch = 70;
        System.out.println(ch);
        System.out.println((int) 200);

        ch = (char)(ch + 1);
        System.out.println(ch);

        ch = 'a' + 1; // Unicode Value of a = 97 and 'a' + 1 = 98 = 'b'
        ch = (char)('a' + ch); // 97 + 98 -> 195 -> A~
        System.out.println(ch);

        System.out.println(10 + 20 + "Hello" + 10 + 20);
        System.out.println(2 + ' ' + 5);
        System.out.println(2 + " " + 5);
        System.out.println("Hello" + '\t' + "World");
        System.out.println("Hello" + "\t" + "World");
        System.out.println(2 + '\t' + 3);
    }
} 
