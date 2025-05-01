import java.util.LinkedList;
import java.util.Queue;

public class ClaseHeroe {
    private Queue<String> Heroes = new LinkedList<>();

    public void addHeroe (String Heroe){
        Heroes.add(Heroe);

    }

    public String getNextHeroe  (){
        return Heroes.poll();
    }
    public String

    public boolean hasHeroe(){
        return !Heroes.isEmpty();
    }

}
