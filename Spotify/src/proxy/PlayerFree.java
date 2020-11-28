package proxy;

import composite.*;

/**
 *
 * @author Caio Vicente Rodrigues
 * @author Rhuan Thales de Souza Trajano
 */
public class PlayerFree implements Player {
    PlayerMusic musicPlayer = new PlayerMusic();
    
    @Override
    public void playMusic(Playlist p){
        System.out.println("With Spotify Premium your can hear any music what you want whitout any ad"
                + " and in offline mode just for $9.69. Upgrate to premium now and obtain all the bonuses.");
        
        musicPlayer.playMusic(p);
    }
}
