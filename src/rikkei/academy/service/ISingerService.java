package rikkei.academy.service;

import rikkei.academy.model.Singer;

import java.util.List;

public interface ISingerService {
    List<Singer>sortName();
    List<Singer>findAll();
    List<Singer>save(Singer singer);
    List<Singer>deleteById(int id);
    List<Singer>findById(int id);
    List<Singer>edit(int id, String name, int age);
    List<Singer>sort();

}
