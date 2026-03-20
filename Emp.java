

package assignment2Emp;

public class Emp {
    // Data Members
    public String name;
    public int empId;
    public String category;
    public double basicPay;
    public double hra;
    public double da;
    public double allowance;
    public double pf;
    public double grossPay;
    public double incomeTax;
    public double netPay;

    public Emp(String name, int id, String cat, double basic) {
        this.name = name;
        this.empId = id;
        this.category = cat;
        this.basicPay = basic;
    }

    public void calculateSalary() {
        // Sample logical percentages for calculation
        hra = 0.15 * basicPay;       // 15% House Rent Allowance
        da = 0.10 * basicPay;        // 10% Dearness Allowance
        allowance = 5000;            // Fixed Allowance
        pf = 0.12 * basicPay;        // 12% Provident Fund contribution

        grossPay = basicPay + hra + da + allowance;
        
        // Simple Income Tax logic (e.g., 5% of gross if it exceeds 50,000)
        if (grossPay > 50000) {
            incomeTax = 0.05 * grossPay;
        } else {
            incomeTax = 0;
        }

        netPay = grossPay - (pf + incomeTax);
    }

    public void displaySalarySlip() {
        System.out.println("------- Salary Slip for " + name + " (ID: " + empId + ") -------");
        System.out.println("Category:    " + category);
        System.out.println("Basic Pay:   " + basicPay);
        System.out.println("HRA:         " + hra);
        System.out.println("DA:          " + da);
        System.out.println("Allowance:   " + allowance);
        System.out.println("--------------------------------------------------");
        System.out.println("Gross Pay:   " + grossPay);
        System.out.println("PF:          " + pf);
        System.out.println("Income Tax:  " + incomeTax);
        System.out.println("--------------------------------------------------");
        System.out.println("NET PAY:     " + netPay);
        System.out.println("--------------------------------------------------");
    }
}
