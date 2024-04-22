// package Arrays;

public class Problem1 {

    public static void array(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {12, 13, 14};
        array(marks);

        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
         }
         System.out.println();
    }
}
