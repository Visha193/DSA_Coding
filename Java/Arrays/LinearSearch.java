public class LinearSearch {
    public static int LinearSearchs(int number[], int key){
        for(int i = 0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }   
    public static void main(String [] args){
        int number[] = {1, 2, 4, 10, 12, 16, 20, 34 };
        int key = 10;

        int index = LinearSearchs(number, key);
        if(index == -1){
            System.out.println("NOT Found");
        }else
        {
            System.out.println("Key found at index" + index);
        }
    }
}
