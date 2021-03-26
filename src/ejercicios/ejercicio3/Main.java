package ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){
        List<Invitado> invitados = new ArrayList<Invitado>();
        List<FuegoArtificial> fuegosArtificiales = new ArrayList<FuegoArtificial>();
        invitados.add(new InvitadoMeli("Carlos"));
        invitados.add(new InvitadoMeli("Lucas"));
        invitados.add(new InvitadoMeli("Marcelo"));
        invitados.add(new InvitadoEstandar("Sebastian"));

        fuegosArtificiales.add(new FuegoArtificialIndiviual("Puuum"));

        List<FuegoArtificialIndiviual> pack = new ArrayList<FuegoArtificialIndiviual>();
        pack.add(new FuegoArtificialIndiviual("Cabum!"));
        pack.add(new FuegoArtificialIndiviual("Boom!"));
        pack.add(new FuegoArtificialIndiviual("ksjdfh!"));

        fuegosArtificiales.add(new FuegoArtificialPack(pack));

        Evento evento = new Evento(invitados,fuegosArtificiales,"Dia de la memoria");
        evento.apagarVelas();
    }
}
