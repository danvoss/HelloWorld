/**
 * Created by Dan on 5/16/16.
 */
public class Car {
    String name;
    int topSpeed;
    double price;
    boolean automaticTransmission;

    public Car(String name, int topSpeed, double price, boolean automaticTransmission) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.price = price;
        this.automaticTransmission = automaticTransmission;
    }

    public String getName() {

        return name;
    }

    public void setName(String newName) {

        name = newName;
    }

    public int getTopSpeed() {

        return topSpeed;
    }

    public void setTopSpeed(int newTopSpeed) {

        topSpeed = newTopSpeed;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double newPrice) {

        price = newPrice;
    }

    public boolean getAutomaticTransmission() {

        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean newAutomaticTransmission) {
        if (newAutomaticTransmission = true) {
            automaticTransmission = newAutomaticTransmission;
        }
    }

}
