package collection;

import iterator.BidirectionalIterator;
import iterator.SongIterator;
import model.Song;
import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist {
    private List<Song> songs = new ArrayList<>();

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public BidirectionalIterator<Song> createIterator() {
        return new SongIterator(songs);
    }
}
