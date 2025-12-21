import java.util.Scanner;

    public class Bonus {

        //Creating a method for generating salary and years of service
        public static int[][] employeeData(int number) {
        int[][] dataEmp = new int[number][2]; 

        for (int i = 0; i < number; i++) {
		
        //Generating random 5-digit number for salary
        int salary = (int)(Math.random() * 90000) + 10000;
		
        //Generating random years of service
        int years = (int)(Math.random() * 10) + 1;

        dataEmp[i][0] = salary;
        dataEmp[i][1] = years;
        }
        return dataEmp;
        }
  
        //Creating a method for calculating new salary and bonus
        public static double[][] newSalaryAndBonus(int[][] employeeData) {
        int num = employeeData.length;
        double[][] newData = new double[num][2]; 

        for (int i = 0; i < num; i++) {
        int salary = employeeData[i][0];
        int years = employeeData[i][1];
        double bonusRate = (years > 5) ? 0.05 : 0.02;

        double bonus = salary * bonusRate;
        double newSalary = salary + bonus;

        newData[i][0] = newSalary;
        newData[i][1] = bonus;
        }
        return newData;
        }

        //Creating a method for calculating totals and display in tabular format
        public static void salaryDetails(int[][] employeeData, double[][] newSalaryData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < employeeData.length; i++) {
        int oldSalary = employeeData[i][0];
        int years = employeeData[i][1];
        double bonus = newSalaryData[i][1];
        double newSalary = newSalaryData[i][0];

        totalOldSalary += oldSalary;
        totalNewSalary += newSalary;
        totalBonus += bonus;

        System.out.println((i+1) + "\t" + oldSalary + "\t\t" + years + "\t" + String.format("%.2f", bonus) + "\t" + String.format("%.2f", newSalary));
        }

        System.out.println("Total\t" + (int)totalOldSalary + "\t\t-\t" + String.format("%.2f", totalBonus) + "\t" + String.format("%.2f", totalNewSalary));
        }

        public static void main(String[] args) {
           int EmpNumber = 10;
           int[][] employeeData = employeeData(EmpNumber);
           double[][] newSalaryData = newSalaryAndBonus(employeeData);
           salaryDetails(employeeData, newSalaryData);
           }
           }
