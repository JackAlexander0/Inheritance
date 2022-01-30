import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class InheritanceDemo {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        int i = 0;
        int x = 0;

        double hours;
        ArrayList<Worker> workers = new ArrayList<>();

	    Worker w1 = new Worker ("000001", "Jack", "Alexander ", "Dr.", 2000, 18);
        Worker w2 = new Worker ("000002", "Zoe", "Peterson   ", "Mrs.", 2001, 10.5);
        Worker w3 = new Worker ("000003", "Sam", "Merkel     ", "Mr.", 2002, 13);
        SalaryWorker sw1 = new SalaryWorker("000004", "Chas", "Figuroea  ", "Dr.", 1996, 100, 40000);
        SalaryWorker sw2 = new SalaryWorker("000005", "Andi", "Alexander ", "Mrs.", 1964, 100, 50000);
        SalaryWorker sw3 = new SalaryWorker("000006", "Trinity", "Donahue", "Ms.", 2002, 100, 20000);

        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        workers.add(sw1);
        workers.add(sw2);
        workers.add(sw3);

        while (i < 3) {
            x = 0;
            System.out.println();
            System.out.println("Worker Name               Pay for Week " + (i + 1));
            System.out.println("======================================");
            if (i == 0 || i == 2) {
                hours = 40.0;
                while (x < 6) {
                    System.out.printf("%-2s %17s", workers.get(x).fullName(), "$"+ df.format(workers.get(x).calculateWeeklyPay(hours)));
                    System.out.println();
                    x++;
                }
            }
            else {
                hours = 50.0;
                while (x < 6) {
                    System.out.printf("%-2s %17s", workers.get(x).fullName(), "$"+ df.format(workers.get(x).calculateWeeklyPay(hours)));
                    System.out.println();
                    x++;
                }
            }
            i++;
        }

    }
}
