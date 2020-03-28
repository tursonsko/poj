/** INVOICE CLASS TEST EXAMPLE
 * Author: Wojtek Turek
 */

public class InvoiceItemTest {

    public static void main(String[] args) {

        var sample = new InvoiceItem("1","Buty", 5,4000);

        System.out.println(sample.getId());
        System.out.println(sample.getTotal());
        System.out.println(sample);

    }

}
