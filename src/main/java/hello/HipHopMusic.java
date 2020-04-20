package hello;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HipHopMusic implements Music{
    List<String> listMusic = new ArrayList<>();
    {
        listMusic.add("hiphop1");
        listMusic.add("hiphop2");
        listMusic.add("hiphop3");
    }

    @Override
    public List<String> getSongs() {
        return listMusic;
    }
}
