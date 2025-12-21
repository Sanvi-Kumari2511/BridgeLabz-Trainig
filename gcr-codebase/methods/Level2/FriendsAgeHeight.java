import java.util.Scanner;
 public class FriendsAgeHeight { 
   
    //Creating a method to find youngest friend
	public static String youngestOne(String[] name, int[] age) {
        int minimumAge = age[0];
        int index = 0;
        for (int i = 1; i < age.length; i++) {
        if (age[i] < minimumAge) {
        minimumAge = age[i];
        index = i;
        }
        }
        return name[index];
        }
		
		//Creating a method to find tallest friend
		public static String tallestOne(String[] name, double[] height) {
        double maximumHeight = height[0];
        int index = 0;
        for (int i = 1; i < height.length; i++) {
        if (height[i] > maximumHeight) {
        maximumHeight = height[i];
        index = i;
        }
        }
        return name[index];
        }
		
		public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Storing names of friends
        String[] friendsNames = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        //Taking input for age and height
        for (int i = 0; i < 3; i++) {
        System.out.print("Enter age of " + friendsNames[i] + ": ");
        age[i] = sc.nextInt();
        System.out.print("Enter height of " + friendsNames[i] + ": ");
        height[i] = sc.nextDouble();
        }
		String young = youngestOne(friendsNames, age);
        String tall = tallestOne(friendsNames, height);
        
		//Displaying results
        System.out.println("\nThe youngest of three frinds is: " + young);
        System.out.println("The tallest of three friends is: " + tall);
        }
        }