package ejercicios.ejercicio3;

public class FuegoArtificialIndiviual extends FuegoArtificial {

    public FuegoArtificialIndiviual(String ruido) {
        this.ruido = ruido;
    }

    @Override
    public void explotar() {
        System.out.println(this.ruido);
    }
}
