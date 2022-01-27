public class SalaryWorker extends Worker{
    private double annualSalary;
    private double weeklyPay;
    private double regularHours;
    private double overtimeHours;
    private double totalPay;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        weeklyPay = annualSalary/52;
        return weeklyPay;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            overtimeHours = 0.0;
            regularHours = hoursWorked;
            totalPay = annualSalary/52;
        }
        else {
            overtimeHours = hoursWorked - 40;
            regularHours = 40;
            totalPay = annualSalary/52;
        }
        return ("Regular Hours = " + regularHours + ", Overtime Hours = " + overtimeHours + ", Total Hours = " + hoursWorked + ", Total Pay (Calculated as 1/52 of Annual Salary) = " + totalPay);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                "annualSalary=" + annualSalary +
                ", weeklyPay=" + weeklyPay +
                ", regularHours=" + regularHours +
                ", overtimeHours=" + overtimeHours +
                ", totalPay=" + totalPay +
                '}';
    }
}
