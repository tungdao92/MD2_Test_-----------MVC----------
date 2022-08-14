package rikkei.academy.controller;
import rikkei.academy.model.Singer;
import rikkei.academy.service.Singer.ISingerService;
import rikkei.academy.service.Singer.SingerServiceIMPL;
import java.util.List;

public class SingerController {
    private ISingerService iSingerService = new SingerServiceIMPL();
    public List<Singer> showSinger(){
        return iSingerService.findAll();
    }

    public List<Singer> creatSinger(String name, int age){
        return iSingerService.save(new Singer(showSinger().size()+1, name, age));
    }

    public List<Singer> removeSinger(int id){
        return iSingerService.deleteById(id);
    }
    public List<Singer> editSinger(int id, String name, int age){
        return iSingerService.edit(id, name, age);
    }

    public List<Singer>detailSinger(int id){
        return iSingerService.findById(id);
    }
    public List<Singer> sortSinger(){
        return iSingerService.sort();
    }
}
