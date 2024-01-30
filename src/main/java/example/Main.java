package example;

public class Main {
    public static void main(String[] args) {
        Bombo bombo = new Bombo();
        bombo.rellenar();
        bombo.remover();
        System.out.println(bombo);
        bombo.sacarBola();
        System.out.println(bombo);


        //visualizar bolas que han salido
        //lista bolas que han salido en orden de salida
        //lista bolas que han salido en orden de valor
    }
}