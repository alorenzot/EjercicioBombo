package example;

public class Bola implements Comparable<Bola>{
    private int numero;

    public Bola(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    @Override
    public int hashCode() {
        return numero;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Bola)) return false;
        Bola b = (Bola) obj;
        return numero == b.numero;
    }

    @Override
    public String toString() {
        return "Bola nº " + numero;
    }

    @Override
    public int compareTo(Bola b) {
        return numero-b.getNumero();
    }
}