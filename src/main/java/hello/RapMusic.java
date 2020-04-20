package hello;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{
    List<String> listMusic = new ArrayList<>();
    {
        listMusic.add("rap1");
        listMusic.add("rap2");
        listMusic.add("rap3");
    }

    @Override
    public List<String> getSongs() {
        return listMusic;
    }
}
