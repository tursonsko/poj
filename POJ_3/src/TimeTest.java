/** TIME TEST CLASS EXAMPLE
 * Author: Wojtek Turek
 */

public class TimeTest {

    public static void main(String[] args) {
        var time = new Time(0,0,0);

        System.out.println(time.previousSecond());
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());

//        while(time.getMinute() > 5){
//            System.out.println(time.previousSecond());
//            do{
//                System.out.println(time.previousSecond());
//            } while (time.getSecond() > 45);
//
//        }

    }

}
