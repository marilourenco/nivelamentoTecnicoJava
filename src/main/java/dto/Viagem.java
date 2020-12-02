package dto;

import enums.Destinos;

public class Viagem {
    private Destinos destino;
    
    public Viagem(Destinos lugarDeDestino){
        this.destino = lugarDeDestino;
    }

    public Destinos getDestino() {
        return destino;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }
}
