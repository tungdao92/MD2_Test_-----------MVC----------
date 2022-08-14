package rikkei.academy.controller;

import rikkei.academy.model.Song;
import rikkei.academy.service.Song.ISongService;
import rikkei.academy.service.Song.SongServiceIMPL;

import java.util.List;

public class SongController {
    private ISongService iSongService = new SongServiceIMPL();
    public List<Song> showSong(){
        return iSongService.findAll();
    }



    public List<Song> creatSong(String name){
        return iSongService.save(new Song(showSong().size()+1,name,0,0));
    }



    public List<Song> editSong(int id, String name){
        return iSongService.edit(id, name);
    }


    public List<Song> deleteSong(int id){
        return iSongService.deleteById(id);
    }
    public List<Song> detailSong(int id){
        return iSongService.findById(id);
    }


}
