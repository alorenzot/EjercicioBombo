package example;

public class Main {
    public static void main(String[] args) {
        Bombo bombo = new Bombo();
        Soporte soporte = new Soporte();
        bombo.rellenar();
        bombo.remover();

        System.out.println(bombo);

        for (int i=0;i<10;i++){
            soporte.add(bombo.sacarBola());
        }
        System.out.println(soporte.getList());
        System.out.println(soporte.getSortedList());
        System.out.println(soporte.getTreeSortedList());

    }
}