import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    double hours;
    double regularHours;
    double overtimeHours;
    SalaryWorker tester = new SalaryWorker ("000001", "Jack", "Alexander", "Dr.", 2000, 18, 40000);

    @BeforeEach
    void setUp() {
        SalaryWorker tester = new SalaryWorker ("000001", "Jack", "Alexander", "Dr.", 2000, 18, 40000);
    }

    @Test
    void calculateWeeklyPay() {
        hours = 10;
        assertEquals(769.2307692307693,tester.calculateWeeklyPay(hours));
    }

    @Test
    void displayWeeklyPay() {
        hours = 10;
        regularHours = 10;
        overtimeHours = 0;
        assertEquals("Regular Hours = " + regularHours + ", Overtime Hours = " + overtimeHours + ", Total Hours = " + hours + ", Total Pay (Calculated as 1/52 of Annual Salary) = " + tester.calculateWeeklyPay(hours), tester.displayWeeklyPay(hours));
    }

    @Test
    void setAnnualSalary() {
        tester.setAnnualSalary(50000);
        assertEquals(50000, tester.getAnnualSalary());
    }
}