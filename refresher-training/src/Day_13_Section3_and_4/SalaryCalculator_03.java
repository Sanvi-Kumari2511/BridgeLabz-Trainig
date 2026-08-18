package Day_13_Section3_and_4;

public class SalaryCalculator_03 {
    double calculateSalary(double basic){
        return basic;
    }

    double calculateSalary(double basic, double bonus){
        return basic + bonus;
    }

    double calculateSalary(double basic, double bonus, double deduction){
        return basic + bonus - deduction;
    }

    public static void main(String[] args) {
        SalaryCalculator_03 s = new SalaryCalculator_03();
        System.out.println(s.calculateSalary(500));
        System.out.println(s.calculateSalary(500, 200));
        System.out.println(s.calculateSalary(500,300, 100));

    }
}
