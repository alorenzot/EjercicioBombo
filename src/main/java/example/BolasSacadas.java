package example;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BolasSacadas{
    private List<Bola> bolas;

    public void setBolas(List<Bola> bolas) {
        this.bolas = bolas;
    }

    public void add(Bola bola){
        bolas.add(bola);
    }
    public void showBallsInInputOrder(){
        Set<Bola> bolas = new LinkedHashSet<>(this.bolas);
        Iterator<Bola> iterator = bolas.iterator();
        while (iterator.hasNext()){
            Bola b = iterator.next();
            System.out.print(b + ", ");
        }
    }
    public void showBallsInValueOrder(){

    }

}
