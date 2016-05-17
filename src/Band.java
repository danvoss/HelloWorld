/**
 * Created by Dan on 5/16/16.
 */
public class Band {
    String name;
    int yearFounded;
    int numberOfMembers;
    Band[] influences = new Band[3];
    boolean hasAGrammy;
    Song[] hitSongs = new Song[5];
    Person[] members = new Person[6];

    public Band(String name, int yearFounded, int numberOfMembers, boolean hasAGrammy) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.numberOfMembers = numberOfMembers;
        this.hasAGrammy = hasAGrammy;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int newYearFounded) {
        yearFounded = newYearFounded;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

//     here was my original "if" constraint:
//
//    public void setNumberOfMembers(int newNumberOfMembers) {
//        if (newNumberOfMembers > 1) {
//            numberOfMembers = newNumberOfMembers;
//        }
//    }


    public void setNumberOfMembers(int newNumberOfMembers) {
        if (isGreaterThanOne(newNumberOfMembers)) {
            numberOfMembers = newNumberOfMembers;
        }
    }

    public boolean getHasAGrammy() {
        return hasAGrammy;
    }

    public void setHasAGrammy(boolean newHasAGrammy) {
        hasAGrammy = newHasAGrammy;
    }

    public static boolean isGreaterThanOne(int newNumberOfMembers) {
        return (newNumberOfMembers > 1);
    }


}
