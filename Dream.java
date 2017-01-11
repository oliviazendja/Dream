/*******************************************
 * Dream.java
 * Olivia Zendja
 * 
 * This program prints "I have a dream."
 *******************************************/
package dream;

public class Dream {

    public static void main(String[] args) {
        int salary;
        double money;
        String bonusMessage;
        
        salary = 50000;
        bonusMessage = "Bonus = $" + (0.02 * salary);
        money = (double) salary/36;
        
        System.out.println(bonusMessage);
        System.out.println(money);
        System.out.println("Balance" + '\t' + "Interest" + '\n');
    }
    
}