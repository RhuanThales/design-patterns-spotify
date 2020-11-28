package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caio Vicente Rodrigues
 * @author Rhuan Thales de Souza Trajano
 */
public class Playlist {
    List<Music> musics = new ArrayList<>();

    public void play(){
        musics.forEach((music) -> {
            System.out.println(music.getTitle() + " - " + music.getTime());
        });
    }

    public void addMusica(Music music){
        this.musics.add(music);
    }
}
