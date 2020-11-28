package composite;

/**
 *
 * @author Caio Vicente Rodrigues
 * @author Rhuan Thales de Souza Trajano
 */
public class Single implements Music {
    public String title;
    public float time;
    
    public Single(String titulo, float time)
    {
        this.title = titulo;
        this.time = time;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public float getTime(){
        return time;
    }
}
