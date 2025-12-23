import java.util.Scanner;
    public class LongestWord {
	     
		 //Creating a method to find the longest word in a sentence
	      public static String findLongest(String str){
		       String[] words = str.split(" ");
               String longestWord = "";
			   
			   for (int i = 0; i < words.length; i++) {
                   if (words[i].length() > longestWord.length()) {
                   longestWord = words[i];
            }
        }
        return longestWord;
    }
	      public static void main(String args []){
		      Scanner sc = new Scanner(System.in);
			  
			  //Taking input from user
			  System.out.println("Enter a string: ");
			  String str = sc.nextLine();
			  
			  //Calling the method
			  String result = findLongest(str);
			  
			  //Displaying the result
			  System.out.println("The longest word is: " + result);
		  }
	  
	}
	
	