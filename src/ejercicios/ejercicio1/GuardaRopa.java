package ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class GuardaRopa {
    private HashMap<Integer, List<Prenda>> prendasGuardadas = new HashMap<>();
    private int contador = 0;

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
        prendasGuardadas.put(contador++,listaDePrendas);
        return contador-1;
    }

    public void mostrarPrendas() {
        Set<Integer> keys = prendasGuardadas.keySet();
        keys.forEach( (Integer n) -> {
            for (Prenda p: prendasGuardadas.get(n)) {
                System.out.println(n + " -- " + p);
            }
        });
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        List<Prenda> prendasADevolver = this.prendasGuardadas.get(numero);
        this.prendasGuardadas.remove(numero);
        return prendasADevolver;
    }
}
