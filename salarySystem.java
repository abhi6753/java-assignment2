package assignment2;
import assignment2Emp.Emp;
import java.util.Scanner;

public class salarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Category: ");
        String cat = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        // Create object of class from package
        Emp e1 = new Emp(name, id, cat, basic);

        // Call methods
        e1.calculateSalary();
        e1.displaySalarySlip();
        
        sc.close();
    }
}