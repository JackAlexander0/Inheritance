import java.util.Calendar;
import java.util.Scanner;

public class Person
{
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;



    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person {" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName() {
        return (firstName + " " + lastName);
    }

    public String formalName() {
        return (title + " " + fullName());
    }

    public String getAge() {
        Calendar cal = Calendar.getInstance();
        return String.valueOf((cal.get(Calendar.YEAR) - YOB));
    }

    public String getAgeYear(int year) {
        return String.valueOf(year - YOB);
    }

    public String toCSVDataRecord() {
        return (ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB);
    }
}
