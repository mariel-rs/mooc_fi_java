
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    /*  Add to that class the equals method so that the similarity of songs can 
    be examined. */

    public boolean equals(Object compared) {
        
        // If the variables are located in the same position, it's the same obj
        if (this == compared) {
            return true;
        }

        // If the compared Object is not of the type Song, they can't the same
        if (!(compared instanceof Song)) {
            return false;
        }

        // Convert the compared object to Song type
        Song comparedSong = (Song) compared;

        if (this.artist.equals(comparedSong.artist) &&
            this.name.equals(comparedSong.name) &&
            this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        // If nothing worked out, then they aren't the same...
        return false;
    }



    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
