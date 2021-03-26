package ejercicios.ejercicio3;

import java.util.List;

public class Evento {
    List<Invitado> invitados;
    List<FuegoArtificial> fuegos;
    private String evento;

    public Evento(List<Invitado> invitados, List<FuegoArtificial> fuegos, String evento) {
        this.invitados = invitados;
        this.fuegos = fuegos;
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    private void repartirPastel(){
        for (Invitado invitado: invitados) {
            invitado.comer();
        }
    }
    private void explotarFuegos(){
        for (FuegoArtificial fuego: fuegos) {
            fuego.explotar();
        }
    }
    public void apagarVelas(){
        explotarFuegos();
        repartirPastel();
    }
}
