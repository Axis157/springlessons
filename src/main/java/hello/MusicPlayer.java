package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    private ClassicalMusic classicalMusic;
    @Autowired
    private RapMusic rapMusic;

    public void playSong(MusicGenre e){
        Random random = new Random();
        int randomInt = random.nextInt(3);
        if(e.equals(MusicGenre.CLASSICAL)){
            System.out.println(classicalMusic.getSongs().get(randomInt));
        }
        else System.out.println(rapMusic.getSongs().get(randomInt));
    }


}
