package ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRopa guardaRopa = new GuardaRopa();

        ArrayList<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("Adidas","modelo"));
        prendas.add(new Prenda("Nike","modelo2"));
        prendas.add(new Prenda("Levis","modelo3"));

        ArrayList<Prenda> prendas2 = new ArrayList<>();
        prendas2.add(new Prenda("Lacoste","modelo"));
        prendas2.add(new Prenda("New Balance","modelo2"));

        int codigoPrendasGuardadas = guardaRopa.guardarPrendas(prendas);
        int codigoPrendasGuardadas2 = guardaRopa.guardarPrendas(prendas2);


        guardaRopa.mostrarPrendas();

        System.out.println("---------");
        List<Prenda> devolucion = guardaRopa.devolverPrendas(codigoPrendasGuardadas2);

        guardaRopa.mostrarPrendas();


    }
}
