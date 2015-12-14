package Insurance;

import javax.swing.*;

public class UseInsurance {

    public static void main(String args[]) {
        int insuranceType = JOptionPane.showOptionDialog(null, "What type of insurance do you want?", "Select insurance type",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Life Insurance", "Health Insurance"}, null);

        if (insuranceType == 0) {
            insuranceLife();
        } else {
            insuranceHealth();
        }
    }

    public static void insuranceLife() {
        (new LifeInsurance()).display();
    }

    public static void insuranceHealth() {
        (new HealthInsurance()).display();
    }
}
