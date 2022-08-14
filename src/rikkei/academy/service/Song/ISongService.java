package rikkei.academy.service.Song;

import rikkei.academy.model.Song;
import rikkei.academy.service.IGeneric;

import java.util.List;

public interface ISongService extends IGeneric<Song> {
    List<Song> edit(int id, String name);
    List<Song>listen(int like);



}
