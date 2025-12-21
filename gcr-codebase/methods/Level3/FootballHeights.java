import java.util.*;

   public class FootballHeights {
    
      //Creating a method for generating random values for heights
      public static int[] Heights(int size) {
        Random num = new Random();
        int[] height = new int[size];

        for (int i = 0; i < size; i++) {
        height[i] = num.nextInt(101) + 150;
        }
        return height;
    }

        //Creating a method to find sum
        public static int sum(int[] height) {
        int sum = 0;
        for(int hei : height) {
            sum += hei;
        }
        return sum;
        }

        //Creating a method to find mean height
        public static double mean(int[] height) {
        return (double) sum(height) / height.length;
        }

        //Creating a method to find shortest height
        public static int shortest(int[] height) {
        int minimum = height[0];
        for (int hei : height) {
        if (hei < minimum) {
        minimum = hei;
        }
        }
        return minimum;
        }

        //Creating a method to find tallest height
        public static int tallest(int[] height) {
        int maximum = height[0];
        for (int hei : height) {
        if (hei > maximum) {
        maximum = hei;
        }
        }
        return maximum;
        }

        public static void main(String[] args) {

        int[] height = Heights(11);

        System.out.print("Heights of the players (cm):");
        for (int hei : height) {
        System.out.print(hei + " ");
        }
		
        System.out.println("Total height = " + sum(height));
        System.out.println("Mean height = " + mean(height));
        System.out.println("Shortest height = " + shortest(height));
        System.out.println("Tallest height = " + tallest(height));
        }
        }