package rikkei.academy.service;
import java.util.List;

public interface IGeneric <E>{
    List<E> findAll();
    List<E>save(E e);
    List<E>deleteById(int id);
    List<E>findById(int id);
//    List<E>edit(int a, String b, int c);
    List<E>sort();

}

