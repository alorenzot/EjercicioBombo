package example;

import java.util.*;

public class Bombo {
    private Set<Bola> bolas;

    public Bombo() {
        bolas = new LinkedHashSet<>();
    }
    public Bombo(Collection<Bola> bolas){
        this();
        this.bolas.addAll(bolas);
    }

    public void addBall(Bola ball){
        bolas.add(ball);
    }
    public void addBalls(Collection<Bola> balls){
        bolas.addAll(balls);
    }
    public void rellenar(){
        for (int i = 1;i<100;i++){
            bolas.add(new Bola(i));
        }
    }
    public void remover(){
        List<Bola> aux = new ArrayList<>(bolas);
        Collections.shuffle(aux);
        bolas.clear();
        bolas.addAll(aux);
    }
    public Bola sacarBola(){
        List<Bola> balls = new LinkedList<>(bolas);
        Bola aux = balls.get(0);
        bolas.remove(aux);
        return aux;
    }

    @Override
    public String toString() {
        return bolas.toString();
    }
}

