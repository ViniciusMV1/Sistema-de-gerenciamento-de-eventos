package repositories;

import models.Eventos;

public class EventosRepository {
    private Eventos [] eventos;
    public EventosRepository() {
        this.eventos = new Eventos[100];
    }
    public void criar ( Eventos eventos) {
        for (int i = 0; i < this.eventos.length; i++){
            if (this.eventos[i] == null){
                this.eventos[i] = eventos;
                break;
            }
        }
    }
}
