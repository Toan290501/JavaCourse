public class CD extends Item {
    private String artist;

    public CD(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
}
