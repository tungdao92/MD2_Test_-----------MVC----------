package rikkei.academy.service.Singer;

import rikkei.academy.model.Singer;
import rikkei.academy.service.Singer.ISingerService;
import rikkei.academy.service.Song.SongServiceIMPL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService {
    public static List<Singer> singerList = new ArrayList<>();
    static {
        singerList.add(new Singer(1,"PhuL",22));
        singerList.add(new Singer(2,"BanG", 32));
        singerList.add(new Singer(3,"Quag",20));
        singerList.add(new Singer(4,"Phuk", 24));
        singerList.add(new Singer(5,"BanG",20));

    }


    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public List<Singer> save(Singer singer) {
        singerList.add(singer);
        return singerList;
    }

    @Override
    public List<Singer> deleteById(int id) {
        singerList.remove(id -1);
        updateId();
        return singerList;
    }

    @Override
    public List<Singer> findById(int id) {
        List<Singer> singers = new ArrayList<>();
        for (int i = 0; i < singerList.size(); i++) {
            singers.add(singerList.get(id -1));
            break;
        }
        return singers;
    }

    @Override
    public List<Singer> edit(int id, String name, int age) {
        singerList.get(id -1).setName(name);
        singerList.get(id -1).setAge(age);
        return singerList;
    }

    @Override
    public List<Singer> sort() {
        Collections.sort(singerList);
        updateId();
        return singerList;
    }
    public void updateId() {
        for (int i = 0; i < singerList.size(); i++) {
            singerList.get(i).setId(i + 1);
        }
    }
}
