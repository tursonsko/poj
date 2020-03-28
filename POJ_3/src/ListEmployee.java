import java.time.LocalDate;
import java.util.ArrayList;

/** LIST OF 8 EMPLOYEES CLASS EXAMPLE
 * Author: Wojtek Turek
 */

public class ListEmployee {

    private String name;
    private int salary;
    private LocalDate hireDay;

    public ListEmployee(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public String toString() {
        return "[Name: " + this.getName() + ", Salary: " + this.getSalary() + ", Hire day: " + this.getHireDay() + "]";
    }

    public static void employeeData(ArrayList<ListEmployee> list) {
        for (ListEmployee e : list) {
            System.out.println(e);
        }
    }

}
