package collection;

import iterator.BidirectionalIterator;
import model.Song;

public interface Playlist {
    void addSong(Song song);
    BidirectionalIterator<Song> createIterator();
}
