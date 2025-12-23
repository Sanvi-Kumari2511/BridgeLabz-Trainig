import java.util.Scanner;
  public class RemoveDuplicates{
	
	  //Creating a method to remove duplicates from a string
	  public static String removeDuplicate(String str){
          String result = "";
		  for(int i = 0; i < str.length(); i++){
		       char ch = str.charAt(i);
		           
				   if(result.indexOf(ch) == -1){
                        result = result + ch;
				   }
	      }   
		              return result;
	  }
			
			public static void main(String args []){
			     Scanner sc = new Scanner(System.in);
				 
				 //Taking input from user
				 System.out.println("Enter a string: ");
				 String str = sc.nextLine();
				 
				 //Calling the method
				 String output = removeDuplicate(str);
				 
				 //Displaying the result
				 System.out.println("String after removing the duplicates: " + output);
			}
      
  }