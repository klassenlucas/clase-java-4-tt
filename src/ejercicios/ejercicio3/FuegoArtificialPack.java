package ejercicios.ejercicio3;

import java.util.List;

public class FuegoArtificialPack extends FuegoArtificial {
    private List<FuegoArtificialIndiviual> pack;

    public FuegoArtificialPack(List<FuegoArtificialIndiviual> pack){
        this.pack=pack;
    }

    public List<FuegoArtificialIndiviual> getPack() {
        return pack;
    }

    public void setPack(List<FuegoArtificialIndiviual> pack) {
        this.pack = pack;
    }

    @Override
    public void explotar() {
        for (FuegoArtificialIndiviual fuego: pack){
            fuego.explotar();
        }
    }

}
