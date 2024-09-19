package es.iescastillodeluna;

public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado(6);

        for(int i=0; i<10; i++) {
            dado.lanzar();
            System.out.printf("El dado devuelve %s.\n", dado);
        }
    }
}
