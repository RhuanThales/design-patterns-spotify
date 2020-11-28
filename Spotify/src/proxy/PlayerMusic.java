package proxy;

import composite.*;

/**
 *
 * @author Caio Vicente Rodrigues
 * @author Rhuan Thales de Souza Trajano
 */
public class PlayerMusic implements Player{
    @Override
    public void playMusic(Playlist p){
        System.out.println("Playing now!: ");
        p.play();
    }
}
