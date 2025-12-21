import java.util.Arrays;
  public class RandomValues {
    
	public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
      
        arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
        }

    //Creating a method to find average, minimum, and maximum values
    public static double[] findAverageMinMax(int[] arr) {
        int minimum = arr[0];
        int maximum = arr[0];
        int sum = 0;

        for (int num : arr) {
        sum += num;
        minimum = Math.min(minimum, num);
        maximum = Math.max(maximum, num);
        }

        double average = (double) sum / arr.length;
        return new double[]{average, minimum, maximum};
        }

    public static void main(String[] args) {
        int size = 5;

        //Generating random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        System.out.println("4-digit random numbers are: " + Arrays.toString(randomNumbers));

        //Finding average, minimum, and maximum
        double[] status = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + status[0]);
        System.out.println("Minimum: " + status[1]);
        System.out.println("Maximum: " + status[2]);
    }
}