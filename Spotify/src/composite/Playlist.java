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
    for(Music m : musics){
        System.out.println(m.getTitle() + " - " + m.getTime());
    }
    }

    public void addMusica(Music m){
        this.musics.add(m);
    }
}
