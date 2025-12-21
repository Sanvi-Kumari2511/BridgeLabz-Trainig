import java.util.Scanner;
import java.util.Random;

    public class StudentMarks {

        //Generating random 2-digit PCM marks
        public static int[][] findScores(int students) {
        Random rand = new Random();
        int[][] arr = new int[students][3];

        for (int i = 0; i < students; i++) {
        arr[i][0] = rand.nextInt(41) + 60;  
        arr[i][1] = rand.nextInt(41) + 60;  
        arr[i][2] = rand.nextInt(41) + 60;  
        }
        return arr;
        }

        //Calculating total, average, and percentage
        public static double[][] data(int[][] marks) {
        int students = marks.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {
        int total = marks[i][0] + marks[i][1] + marks[i][2];
        double average = total / 3.0;
        double percent = (total / 300.0) * 100;

        result[i][0] = total;
        result[i][1] = Math.round(average * 100.0) / 100.0;
        result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
        }

        //Checking grade according to the percentge
        public static String grade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
        }

       //Displaying results
        public static void show(int[][] marks, double[][] data) {
     
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-5s\n","Student", "Physics", "Chemistry", "Maths", "Total", "Percent", "Grade");
        
        for (int i = 0; i < marks.length; i++) {
        System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-5s\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], data[i][0], data[i][2], grade(data[i][2]));
        }
        }


        public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = findScores(students);
        double[][] data = data(marks);

        show(marks, data);
        }
        }