import java.math.*;
import java.util.*;

public class Problem1{

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     for(int i = 0; i<n; i++){
    //         for(int j = 0; j<n ; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    
    public int minMaxDistance(int[][] points) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        
        // Find minimum and maximum coordinates
        for (int[] point : points) {
            minX = Math.min(minX, point[0]);
            minY = Math.min(minY, point[1]);
            maxX = Math.max(maxX, point[0]);
            maxY = Math.max(maxY, point[1]);
        }
        
        // Calculate initial maximum distance
        int initialMaxDistance = Math.max(maxX - minX, maxY - minY);
        
        // Iterate through points to find the maximum distance after removing each point
        int maxDistance = 0;
        for (int[] point : points) {
            maxDistance = Math.max(maxDistance, 
                                   Math.max(Math.abs(point[0] - minX), Math.abs(point[0] - maxX)) +
                                   Math.max(Math.abs(point[1] - minY), Math.abs(point[1] - maxY)));
        }
        
        // Return the minimum possible maximum distance after removing exactly one point
        return Math.min(initialMaxDistance, maxDistance);
    }

}

