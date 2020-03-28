/** ACCOUNT CLASS TEST EXAMPLE
 * Author: Wojtek Turek
 */
public class AccountTest {

    public static void main(String[] args) {

        var sampleAccount1 = new Account("997", "Wojtek", 4500);
        var sampleAccount2 = new Account("1234", "Jasiek", 3000);

        System.out.println(sampleAccount1.getBalance());
        System.out.println(sampleAccount1.credit(90));
        System.out.println(sampleAccount1);
        System.out.println(sampleAccount1.debit(4591));

        System.out.println("Stan konta [" + sampleAccount1.getID() + "]: " + sampleAccount1.getBalance());
        System.out.println("Stan konta [" + sampleAccount2.getID() + "]: " + sampleAccount2.getBalance());
        sampleAccount1.transferTo(sampleAccount2, 700);
        System.out.println("Stan konta [" + sampleAccount1.getID() + "]: " + sampleAccount1.getBalance());
        System.out.println("Stan konta [" + sampleAccount2.getID() + "]: " + sampleAccount2.getBalance());
        System.out.println(sampleAccount1);
        System.out.println(sampleAccount2);

    }

}
