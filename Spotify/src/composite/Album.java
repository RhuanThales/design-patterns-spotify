package composite;

/**
 *
 * @author Caio Vicente Rodrigues
 * @author Rhuan Thales de Souza Trajano
 */
public class Album implements Music{
    public Music music_1;
    public Music music_2;
    public Music music_3;

    public Album(Music m1,Music m2, Music m3){
        this.music_1 = m1;
        this.music_2 = m2;
        this.music_3 = m3;
    }

    @Override
    public String getTitle(){
        return this.music_1.getTitle() + "\n" + this.music_2.getTitle() + "\n" + this.music_3.getTitle();
    }

    @Override
    public float getTime(){
        return this.music_1.getTime() + this.music_2.getTime() + this.music_3.getTime();
    };
}
