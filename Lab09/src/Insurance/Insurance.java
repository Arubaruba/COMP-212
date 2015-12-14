package Insurance;

import javax.swing.*;

public abstract class Insurance {
    protected String type;
    protected double cost;

    public Insurance(String type) {
        this.type = type;
    }

    public void display() {
        JOptionPane.showMessageDialog(null, " " + type + " insurance costs $" + cost + " per month");
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
