// Program to calculate the day of the week.

public class WeekOfDays
{
	public static void main(String args [])
       {

		//converting the month, day, and year into int
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		int yNot = year - (14-month)/12;
		int x = yNot + (yNot/4) - (yNot/100) + (yNot/400);
		int mNot = month + (12 * ((14 - month) / 12) - 2);
		int dNot = (day + x + (31 * mNot) / 12) % 7;
		
		System.out.println("The day of given date is " + dNot);
	}
}
	