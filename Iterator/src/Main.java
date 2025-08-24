import collection.Playlist;
import collection.PlaylistImpl;
import iterator.BidirectionalIterator;
import model.Song;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new PlaylistImpl();
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));
        playlist.addSong(new Song("Believer", "Imagine Dragons"));

        BidirectionalIterator<Song> songIterator = playlist.createIterator();

        System.out.println("Forward Play:");
        while (songIterator.hasNext()) {
            System.out.println("Playing: " + songIterator.next());
        }

        System.out.println("\nBackward Play:");
        while (songIterator.hasPrevious()) {
            System.out.println("Replaying: " + songIterator.previous());
        }
    }
}
