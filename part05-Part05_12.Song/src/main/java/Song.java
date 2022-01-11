
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }


	public boolean equals(Song compared) {
		if (this == compared) {
			return true;
		}
		if (!(compared instanceof Song)) {
			return false;
		}
		if (this.artist.equals(compared.artist)
				&& this.name.equals(compared.name)
				&& this.durationInSeconds == compared.durationInSeconds) {
			return true;
		}

		return false;
	}
	
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
