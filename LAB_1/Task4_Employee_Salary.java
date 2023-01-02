import java.util.*;

public class Task4_Employee_Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of hours of employee per week: ");
        int hrs = in.nextInt();
        System.out.print("\nEnter money the employee makes per hour: ");
        int money = in.nextInt();
        System.out.print("\nEnter vacation days: ");
        int vacation = in.nextInt();
        vacation *= 8;
        int weeklySalary = hrs * money;

        System.out.println("Weekly Salary is : " + weeklySalary);
        System.out.println("Gross Yearly Salary is: " + ((weeklySalary * 52.143) - (vacation * money)));

    }

}