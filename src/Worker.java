public class Worker extends Person {
    private double hourlyPayRate;
    private double weeklyPay;
    private double regularHours;
    private double overtimeHours;
    private double totalPay;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            weeklyPay = hoursWorked * hourlyPayRate;
        }
        else {
            hoursWorked = hoursWorked - 40;
            weeklyPay = 1.5 * (hoursWorked * hourlyPayRate);
            weeklyPay = weeklyPay + (40 * hourlyPayRate);
        }
        return weeklyPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            overtimeHours = 0.0;
            regularHours = hoursWorked;
        }
        else {
            overtimeHours = hoursWorked - 40;
            regularHours = 40;
        }
        totalPay = calculateWeeklyPay(hoursWorked);
        return ("Regular Hours = " + regularHours + ", Overtime Hours = " + overtimeHours + ", Total Hours = " + hoursWorked + ", Total Pay = " + totalPay);
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", weeklyPay=" + weeklyPay +
                ", regularHours=" + regularHours +
                ", overtimeHours=" + overtimeHours +
                ", totalPay=" + totalPay +
                '}';
    }
}
