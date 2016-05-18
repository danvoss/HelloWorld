/**
 * Created by Dan on 5/16/16.
 */
public class Country {
    String name;
    String capital;
    double sqKm;
    int population;
    Country[] topTradingPartners = new Country[5];

    public Country(String name, String capital, double sqKm, int population) {
        this.name = name;
        this.capital = capital;
        this.sqKm = sqKm;
        this.population = population;
    }

    public String getName() {

        return name;
    }

    public void setName(String newName) {
        if (newName.contains("S")) {
            name = newName;
        }
    }

    public String getCapital() {

        return capital;
    }

    public void setCapital(String newCapital) {

        capital = newCapital;
    }

    public double getSqKm() {

        return sqKm;
    }

    public void setSqKm(double newSqKm) {

        sqKm = newSqKm;
    }

    public int getPopulation() {

        return population;
    }

    public void setPopulation(int newPopulation) {

        population = newPopulation;
    }

}
