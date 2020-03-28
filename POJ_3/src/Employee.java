/** EMPLOYEE CLASS EXAMPLE
 * Author: Wojtek Turek
 */

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNameName() {
        return lastName;
    }

    public String getName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    public String toString() {
        return "Employee[id=" + this.getID() + ", name=" + this.getFirstName() +
                " " + this.getLastNameName() + ", salary=" + this.getSalary() + "]";
    }




    /************************************************************************************/

    public static void main(String[] args) {
        var sample = new Employee(1,"Wojtek","Turek",4000);

        System.out.println(sample.getName(sample.firstName, sample.lastName));
        System.out.println(sample.getFirstName());
        System.out.println("przed podwyzka: " + sample.getSalary());
        System.out.println(sample.getAnnualSalary());
        System.out.println(sample.raiseSalary(20));
        System.out.println(sample.getAnnualSalary());
        System.out.println("po podwyzce: " + sample.getSalary());
        System.out.println(sample.toString());
    }




}
