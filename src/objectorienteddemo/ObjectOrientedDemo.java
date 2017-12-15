
package objectorienteddemo;

/**
 *
 * @author ngardner3
 */
public class ObjectOrientedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Staff staff1 = new Staff ("Nicole");
        staff1.setHourWorked(160);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);
    }
    
}
