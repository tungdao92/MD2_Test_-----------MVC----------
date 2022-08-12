package rikkei.academy.service;

import rikkei.academy.model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService {
    public static List<Singer> singerList = new ArrayList<>();
    static {
        singerList.add(new Singer(1,"Phu Le",22));
        singerList.add(new Singer(2,"BangG", 32));
        singerList.add(new Singer(3,"Quag Ha",20));
        singerList.add(new Singer(4,"Phuc Duc", 24));
        singerList.add(new Singer(5,"BangG",20));

    }


    @Override
    public List<Singer> sortName() {
        Collections.sort(singerList);
        return singerList;
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
