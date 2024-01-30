package example;

import java.util.*;

public class Soporte {
    private Comparator<Bola> BALL_COMPARATOR = new Comparator<Bola>() {
        @Override
        public int compare(Bola o1, Bola o2) {
            return o1.getNumero()-o2.getNumero();
        }
    };
    private Set<Bola> bolasSacadas;

    public Soporte(){
        bolasSacadas = new LinkedHashSet<>();
    }
    public void add(Bola ball){
        bolasSacadas.add(ball);
    }
    public boolean comprobarBola(Bola ball){
        return bolasSacadas.contains(ball);
    }
    public boolean comprobarBolas(Collection<Bola> balls){
        return bolasSacadas.containsAll(balls);
    }
    public List<Bola> getList(){
        return new ArrayList<>(bolasSacadas);
    }
    public List<Bola> getSortedList(){
        List<Bola> list = new ArrayList<>(bolasSacadas);
        list.sort(BALL_COMPARATOR);
        return list;
    }
    public List<Bola> getTreeSortedList(){
//        Set<Bola> aux = new TreeSet<>(bolasSacadas);
//        List<Bola> aux2 = new ArrayList<>(aux);
//        return aux2;
        return new ArrayList<>(new TreeSet<>(bolasSacadas));
    }
    

}
