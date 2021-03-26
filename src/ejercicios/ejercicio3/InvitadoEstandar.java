package ejercicios.ejercicio3;

public class InvitadoEstandar extends Invitado {
    public InvitadoEstandar(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo");

    }
}
