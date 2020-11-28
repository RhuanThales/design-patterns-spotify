package factory;

import proxy.*;
import composite.*;

/**
 *
 * @author Caio Vicente Rodrigues
 * @author Rhuan Thales de Souza Trajano
 */
public class Spotify {
    
    public static void main(String[] args) {
        // System.out.println("Iniciando o spotify...");
        
        // Criando singles
        Music mA = new Single("Back From The Dead by Skillet", 3.06f);
        Music mB = new Single("It's All Over by Three Days Grace", 4.06f);
        Music mC = new Single("Courtesy Call by Thousand Foot Krutch", 5.47f);
        
        // Criando um album a partir dos Singles
        Music mD = new Album(mA, mB, mC);
        
        // Gerando Players
        Factory factory = new Factory();
        Player free = factory.createPlayer("free");
        Player premium = factory.createPlayer("premium");
        
        // Criando Playlists e adicionando músicas
        Playlist p = new Playlist();
        Playlist alb = new Playlist();
        alb.addMusica(mD);
        p.addMusica(mA);
        
        // Tocando Singles e Albuns
        free.playMusic(p);
        premium.playMusic(alb);
    }
}