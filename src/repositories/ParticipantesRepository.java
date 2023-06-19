package repositories;

import models.Participantes;

public class ParticipantesRepository {
    private Participantes [] participantes;
    public ParticipantesRepository () {
        this.participantes = new Participantes[100];
    }
    public void criar(Participantes participantes) {
        for (int i = 0; i < this.participantes.length; i ++){
            if (this.participantes[i] == null) {
                this.participantes[i] = participantes;
                break;
            }
        }
    }

}
