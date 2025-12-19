import java.util.Scanner;

  public class AgeHeight {
     public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
		
	//Taking inputs from user for storing salary and years of service
	String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        float[] heights = new float[3];
		
	//Taking inputs for ages
	System.out.println("Enter the age of Amar, Akbar and Anthony: ");
        for(int i = 0; i < 3; i++) {
        System.out.print(names[i] + " age : ");
        age [i] = sc.nextInt();
        }
		
	// Taking inputs for heights
        System.out.println("\nEnter the height of Amar, Akbar and Anthony: ");
        for(int i = 0; i < 3; i++) {
        System.out.print(names[i] + " height : ");
        heights[i] = sc.nextFloat();
        }
		
	//Finding the youngest and the tallest friend 
        int minAge = age[0];
        String youngest = names[0];

        float maxHeight = heights[0];
        String tallest = names[0];
		
	for(int i = 1; i < 3; i++) {
        if(age[i] < minAge) {
        minAge = age[i];
        youngest = names[i];
        }

        if(heights[i] > maxHeight) {
        maxHeight = heights[i];
        tallest = names[i];
        }
        }
		
	//Displaying outputs
	System.out.println("\nYoungest friend is : " + youngest + " (" + minAge + " years)");
        System.out.println("Tallest friend is : " + tallest + " (" + maxHeight + " cm)");
        }
        }