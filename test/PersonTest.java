import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person tester = new Person ("000001", "Jack", "Alexander", "Dr.", 2000);

    @BeforeEach
     void setUp() {
        Person tester = new Person ("000001", "Jack", "Alexander", "Dr.", 2000);
    }

    @Test
    void setFirstName() {
        tester.setFirstName("Tommy");
        assertEquals("Tommy", tester.getFirstName());
    }

    @Test
    void setLastName() {
        tester.setLastName("Wiseau");
        assertEquals("Wiseau", tester.getLastName());
    }

    @Test
    void setTitle() {
        tester.setTitle("Mr.");
        assertEquals("Mr.", tester.getTitle());
    }

    @Test
    void setYOB() {
        tester.setYOB(1950);
        assertEquals(1950, tester.getYOB());
    }

    @Test
    void fullName() {
        assertEquals("Jack Alexander", tester.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Dr. Jack Alexander", tester.formalName());
    }

    @Test
    void getAge() {
        assertEquals("22", tester.getAge());
    }

    @Test
    void getAgeYear() {
        assertEquals("15", tester.getAgeYear(2015));
    }

    @Test
    void toCSVDataRecord() {
        assertEquals("000001, Jack, Alexander, Dr., 2000", tester.toCSVDataRecord());
    }
}