import java.util.Scanner;
    public class CountVowelsConsonants{
	
	//Creating a method for counting the vowels and consonants
		public static void vowelsConsonants(String str){
		int vowel = 0, consonant = 0;
		str = str.toLowerCase();
	      for(int i = 0; i < str.length(); i++){
		      char ch = str.charAt(i);
		   
		      if(ch >= 'a' && ch <= 'z'){
			     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				    vowel++;
				 }
				  else{
				  consonant++;
				  }
			    }
		     }
	         System.out.println("Number of vowels: " + vowel);
			 System.out.println("Number of consonants: " + consonant);
		  }
	    public static void main(String args []){
		
		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: " );
		String str = sc.nextLine();
		vowelsConsonants(str); 
		   
		}
	}