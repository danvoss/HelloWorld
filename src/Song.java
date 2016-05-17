/**
 * Created by Dan on 5/16/16.
 */
public class Song {
    String name;
    double lengthInMinutes;
    int tempo; //in beats per minute
    boolean keyIsMajor;
    Song[] soundsLike = new Song[4];

    public Song(String name, double lengthInMinutes, int tempo, boolean keyIsMajor) {
        this.name = name;
        this.lengthInMinutes = lengthInMinutes;
        this.tempo = tempo;
        this.keyIsMajor = keyIsMajor;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

//    public void setLengthInMinutes(double newLengthInMinutes) {
//        if (lengthInMinutes < 30) {
//            lengthInMinutes = newLengthInMinutes;
//        }
//    }

    public void setLengthInMinutes(double newLengthInMinutes) {
        if (isNotTooLong(newLengthInMinutes)) {
            lengthInMinutes = newLengthInMinutes;
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int newTempo) {
        tempo = newTempo;
    }

    public boolean getKeyIsMajor() {
        return keyIsMajor;
    }

    public void setKeyIsMajor(boolean newKeyIsMajor) {
        keyIsMajor = newKeyIsMajor;
    }

    public static boolean isNotTooLong(double newLengthInMinutes){
        return (newLengthInMinutes < 30);
    }

}
