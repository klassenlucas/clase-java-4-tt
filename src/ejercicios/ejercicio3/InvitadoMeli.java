package ejercicios.ejercicio3;

public class InvitadoMeli extends Invitado {
    public InvitadoMeli(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo.\nViva La Chiqui!");
    }
}
