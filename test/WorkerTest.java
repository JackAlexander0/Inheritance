import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    double hours;
    double regularHours;
    double overtimeHours;

    Worker tester = new Worker("000001", "Jack", "Alexander", "Dr.", 2000, 18);

    @BeforeEach
    void setUp() {
        Worker tester = new Worker ("000001", "Jack", "Alexander", "Dr.", 2000, 18);
    }

    @Test
    void calculateWeeklyPay() {
        hours = 10;
        assertEquals(180, tester.calculateWeeklyPay(hours));
    }

    @Test
    void displayWeeklyPay() {
        hours = 10;
        regularHours = 10;
        overtimeHours = 0;
        assertEquals("Regular Hours = " + regularHours + ", Overtime Hours = " + overtimeHours + ", Total Hours = " + hours + ", Total Pay = " + tester.calculateWeeklyPay(hours), tester.displayWeeklyPay(hours));
    }

    @Test
    void setHourlyPayRate() {
        tester.setHourlyPayRate(20);
        assertEquals(20,tester.getHourlyPayRate());
    }
}