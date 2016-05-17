/**
 * Created by Dan on 5/16/16.
 */
public class Restaurant {
    String name;
    int numberOfEmployees;
    boolean takesReservations;
    Country[] cuisine = new Country[3];
    double avgPrice;

    public Restaurant(String name, int numberOfEmployees, boolean takesReservations, double avgPrice){
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.takesReservations = takesReservations;
        this.avgPrice = avgPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int newNumberOfEmployees) {
        numberOfEmployees = newNumberOfEmployees;
    }

    public boolean getTakesReservations() {
        return takesReservations;
    }

    public void setTakesReservations(boolean newTakesReservations) {
        takesReservations = newTakesReservations;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double newAvgPrice) {
        if (newAvgPrice >= 15) {
            avgPrice = newAvgPrice;
        }
    }

}
