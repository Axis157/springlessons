package hello;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> listMusic = new ArrayList<>();
    {
        listMusic.add("classical1");
        listMusic.add("classical2");
        listMusic.add("classical3");
    }
    @Override
    public List<String> getSongs() {
        return listMusic;
    }
}
