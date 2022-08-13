package rikkei.academy.service.Song;
import rikkei.academy.model.Song;
import java.util.ArrayList;
import java.util.List;

public class SongServiceIMPL implements ISongService{
    public static List<Song> songList = new ArrayList<>();
    static {
       songList.add(new Song(1,"Love",0,0));
       songList.add(new Song(2,"You",0,0));
       songList.add(new Song(3,"Like",0,0));
       songList.add(new Song(4,"Me",0,0));
    }


    @Override
    public List<Song> findAll() {
        return songList;
    }

    @Override
    public List<Song> save(Song song) {
        songList.add(song);
        return songList;
    }

    @Override
    public List<Song> deleteById(int id) {
        return null;
    }

    @Override
    public List<Song> findById(int id) {
        return null;
    }


    @Override
    public List<Song> edit(int id, String name) {
        songList.get(id -1).setName(name);
        return songList;
    }

    @Override
    public List<Song> sort() {
        return null;
    }
    public void updateId() {
        for (int i = 0; i < songList.size(); i++) {
            songList.get(i).setId(i + 1);
        }
    }
}
