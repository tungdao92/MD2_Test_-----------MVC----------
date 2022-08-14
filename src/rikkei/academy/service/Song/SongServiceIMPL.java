package rikkei.academy.service.Song;
import rikkei.academy.model.Song;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongServiceIMPL implements ISongService{
    public static List<Song> songList = new ArrayList<>();
    static {
       songList.add(new Song(1,"Love"));
       songList.add(new Song(2,"Youu"));
       songList.add(new Song(3,"Like"));
       songList.add(new Song(4,"Meee"));
        for (Song song: songList) {
            song.setListen((int) (Math.random()*1000)+500);;
            song.setLike((int) (Math.random()*song.getListen()));
        }

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
        songList.remove(id -1);
        updateId();
        return songList;
    }




    @Override
    public List<Song> findById(int id) {
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < songList.size(); i++) {
            songs.add(songList.get(id -1));
            break;
        }
        return songs;
    }

    @Override
    public List<Song> sort() {
        return null;
    }


    @Override
    public List<Song> edit(int id, String name) {
        songList.get(id -1).setName(name);
        return songList;
    }

    @Override
    public List<Song> listenRank() {
        Collections.sort(songList);
        updateId();
        return songList;
    }

    @Override
    public List<Song> likeRank() {
        Collections.sort(songList);
        updateId();
        return songList;
    }



    public void updateId() {
        for (int i = 0; i < songList.size(); i++) {
            songList.get(i).setId(i + 1);
        }
    }








}
