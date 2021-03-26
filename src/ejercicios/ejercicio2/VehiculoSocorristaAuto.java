package ejercicios.ejercicio2;

import org.w3c.dom.ls.LSOutput;

public class VehiculoSocorristaAuto implements VehiculoSocorrista {

    @Override
    public void socorrer(Vehiculo unAuto){
        if (unAuto instanceof Auto) {
            System.out.println("Socorriendo auto: " + unAuto.getPatente());
        } else {
            System.out.println("No se puede socorrer");
        }

    }
}
