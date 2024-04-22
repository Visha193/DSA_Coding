
public class ContinueStatement {
    public static void main(String[] args) {
        

    // Continue Statement Skips the current iteration of loop (For, While, Do while)

        for(int i = 0; i<=10; i++){

            if(i>4 && i<9)
            {
                continue;
            }
            System.out.println(i);

            }

        int i = 1; int j = 1;

        while(i<=3){
            System.out.println("Outer Loop: " + i);

            while( j<=3){
                if (j == 2) {
                    j++;
                    continue;
                }
                System.out.println("Inner Loop:" + j);
                j++;
            }
            i++;   
        }
    }
}
