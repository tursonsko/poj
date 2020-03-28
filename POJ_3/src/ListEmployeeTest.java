import java.util.ArrayList;

/** LIST OF 8 EMPLOYEES TEST CLASS EXAMPLE
 * Author: Wojtek Turek
 */

public class ListEmployeeTest {

    public static void main(String[] args) {
        ArrayList<ListEmployee> list = new ArrayList<>();

        list.add(new ListEmployee("Wojtek", 1200, 2012, 12, 31));
        list.add(new ListEmployee("Jasiek", 3000, 1982, 9, 26));
        list.add(new ListEmployee("Witold", 5500, 2009, 3, 11));
        list.add(new ListEmployee("Edmund", 8000, 2002, 1, 3));
        list.add(new ListEmployee("Zenek", 9000, 2000, 2, 22));
        list.add(new ListEmployee("Mariolka", 4800, 1997, 6, 1));
        list.add(new ListEmployee("Kunegunda", 15000, 1966, 7, 22));
        list.add(new ListEmployee("Jessica", 1600, 1999, 2, 14));

        ListEmployee.employeeData(list);

    }

}
