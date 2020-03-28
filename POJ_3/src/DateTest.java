/** DATE CLASS TEST EXAMPLE
 * Author: Wojtek Turek
 */

public class DateTest {

    public static void main(String[] args) {

        var sampleDate1 = new Date(1,1,1999);
        System.out.println(sampleDate1.toString());
        var sampleDate2 = new Date(32,13,1899);
        System.out.println(sampleDate2.toString());
        var sampleDate3 = new Date(9,2,2020);
        System.out.println(sampleDate3.toString());

    }

}
