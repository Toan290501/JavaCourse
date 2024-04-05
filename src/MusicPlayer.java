import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MusicPlayer {

    public static class Song {
        private String title;
        private String artist;

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "title='" + title + '\'' +
                    ", artist='" + artist + '\'' +
                    '}';
        }
    }

    public class Playlist {
        private List<Song> songs;

        public Playlist() {
            this.songs = new ArrayList<>();
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        public void removeSong(Song song) {
            songs.remove(song);
        }

        public Song findSong(String title) {
            class SongSearcher {
                Song search() {
                    for (Song song : songs) {
                        if (song.getTitle().equals(title)) {
                            return song;
                        }
                    }
                    return null;
                }
            }
            SongSearcher searcher = new SongSearcher();
            return searcher.search();
        }

        public void sortByArtist() {
            Collections.sort(songs, new Comparator<Song>() {
                @Override
                public int compare(Song o1, Song o2) {
                    return o1.getArtist().compareTo(o2.getArtist());
                }
            });
        }

        public void printPlaylist() {
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }

    // main method
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Playlist playlist = musicPlayer.new Playlist();

        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Believer", "Imagine Dragons"));

        System.out.println("Playlist before sorting:");
        playlist.printPlaylist();

        playlist.sortByArtist();
        System.out.println("\nPlaylist after sorting by artist:");
        playlist.printPlaylist();

        Song song = playlist.findSong("Believer");
        if (song != null) {
            System.out.println("\nFound song: " + song);
        }
    }
}
