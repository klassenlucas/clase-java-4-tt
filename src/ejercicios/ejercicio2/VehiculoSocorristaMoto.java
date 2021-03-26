package ejercicios.ejercicio2;

public class VehiculoSocorristaMoto implements VehiculoSocorrista {
    @Override
    public void socorrer(Vehiculo unaMoto){
        if(unaMoto instanceof Moto){
            System.out.println("Socorriendo moto: "+unaMoto.getPatente());

        }  else {
            System.out.println("no se puede socorrer");
        }
    }

}
