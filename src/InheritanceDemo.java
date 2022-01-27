import com.sun.corba.se.spi.orbutil.threadpool.Work;
import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        double hours;
        ArrayList<Worker> workers = new ArrayList<>();

	    Worker w1 = new Worker ("000001", "Jack", "Alexander", "Dr.", 2000, 21);
        Worker w2 = new Worker ("000002", "Zoe", "Peterson", "Mrs.", 2001, 10.5);
        Worker w3 = new Worker ("000003", "Sam", "Merkel", "Mr.", 2002, 13);
        SalaryWorker sw1 = new SalaryWorker("000004", "Chas", "Figuroea", "Dr.", 1996, 100, 40000);
        SalaryWorker sw2 = new SalaryWorker("000005", "Andi", "Alexander", "Mrs.", 1964, 100, 50000);
        SalaryWorker sw3 = new SalaryWorker("000006", "Trinity", "Donahue", "Ms.", 2002, 100, 20000);

        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        workers.add(sw1);
        workers.add(sw2);
        workers.add(sw3);

        while (i < 3) {
            switch(i) {
                case 0:
                case 2:
                    hours = 40.0;
                    while (x < 6) {
                        //this needs to change
                        System.out.println(workers.get(x).calculateWeeklyPay(hours));
                        x++;
                    }
                    break;
                case 1:
                    hours = 50.0;
                    break;
            }

            i++;
        }

    }
}
