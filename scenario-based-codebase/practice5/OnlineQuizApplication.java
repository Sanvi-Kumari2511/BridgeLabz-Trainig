import java.util.Scanner;
public class OnlineQuizApplication {
    public static void main(String args []) {
	   Scanner sc = new Scanner(System.in);
	  
        //Creating an array to store questions
        String[] questions = {
            "1. What is the capital of India?",
            "2. Which planet is known as the Red Planet?",
            "3. Who is known as the Father of the Nation in India?",
            "4. Which is the famous food of Bihar?",
            "5. What is the capital of Bihar?"
        };

        //Creating an array to store options
        String[][] options = {
            {"A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai"},
            {"A. Earth", "B. Venus", "C. Mars", "D. Jupiter"},
            {"A. Jawaharlal Nehru", "B. Subhash Chandra Bose", "C. Bhagat Singh", "D. Mahatma Gandhi"},
            {"A. Dosa", "B. Sambhar", "C. Kheer", "D. Litti-Chokha"},
            {"A. Gaya", "B. Aurangabad", "C. Patna", "D. Bhagalpur"}
        };

        //Creating an array for correct answers
        char[] rightAnswers = {'B', 'C', 'D', 'D', 'C'};

        int score = 0;

        System.out.println("\n===== Quiz of General Knowledge =====");

        //Using for loop for quiz
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char candidateAnswer = sc.next().toUpperCase().charAt(0);

            //Switch for answer checking
            switch (candidateAnswer) {

                case 'A':
                case 'B':
                case 'C':
                case 'D':
				
                    if (candidateAnswer == rightAnswers[i]) {
                        System.out.println("Right Answer");
                        score++;
                    } 
					else {
                        System.out.println("Wrong Answer");
                    }
                    break;

                default:
                    System.out.println("Your choice is wrong");
            }
        }

        //Final Score
        System.out.println("\n===== Quiz Finish =====");
        System.out.println("Your Score: " + score + " / " + questions.length);

        sc.close();
    }
}

	