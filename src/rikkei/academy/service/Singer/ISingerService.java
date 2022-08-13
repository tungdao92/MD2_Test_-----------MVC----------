package rikkei.academy.service.Singer;
import rikkei.academy.model.Singer;
import rikkei.academy.service.IGeneric;

import java.util.List;

public interface ISingerService extends IGeneric<Singer> {
    List<Singer>edit(int a, String b, int c);


}
