/**
 * Uses speed and time to calculate distance traveled
 */
public class Distance {
    private double speed;
    private int hours;

    Distance(double speed, int hours) {
        this.speed = speed;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return the product of speed and hours
     */
    public double getDistance() {
        return speed * hours;
    }
}
