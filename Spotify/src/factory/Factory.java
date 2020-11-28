package factory;

import proxy.*;

/**
 *
 * @author Caio Vicente Rodrigues
 * @author Rhuan Thales de Souza Trajano
 */
public class Factory {
    
    public Player createPlayer(String Player){
        if(Player.equalsIgnoreCase("free"))
        {
            return new PlayerFree();
        }
        else if(Player.equalsIgnoreCase("premium"))
        {
            return new PlayerMusic();
        }
        else {
           return null; 
        }
    }
}
