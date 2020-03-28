/** EMPLOYEE CLASS TEST EXAMPLE
 * Author: Wojtek Turek
 */

public class EmployeeTest {

    public static void main(String[] args) {

        var sampleEmployee = new Employee(1,"Wojtek","Turek",4000);
        System.out.println(sampleEmployee.getName(sampleEmployee.getFirstName(), sampleEmployee.getLastNameName()));
        System.out.println(sampleEmployee.getFirstName());
        System.out.println("przed podwyzka: " + sampleEmployee.getSalary());
        System.out.println("roczna wyplata przed podwyzka: " + sampleEmployee.getAnnualSalary());
        sampleEmployee.raiseSalary(20);
        System.out.println("roczna wyplata po podwyzce: "+ sampleEmployee.getAnnualSalary());
        System.out.println("po podwyzce: " + sampleEmployee.getSalary());
        System.out.println(sampleEmployee.toString());

    }

}
