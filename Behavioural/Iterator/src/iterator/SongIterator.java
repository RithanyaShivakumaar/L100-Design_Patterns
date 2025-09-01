package iterator;

import model.Song;
import java.util.List;

public class SongIterator implements BidirectionalIterator<Song> {
    private List<Song> songs;
    private int position = 0;

    public SongIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }

    @Override
    public boolean hasPrevious() {
        return position > 0;
    }

    @Override
    public Song previous() {
        return songs.get(--position);
    }
}
