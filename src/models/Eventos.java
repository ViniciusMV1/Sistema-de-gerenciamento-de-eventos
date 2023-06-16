package models;

import java.time.LocalDate;
import java.util.List;

public class Eventos {
    private String descricao;
    private LocalDate data;
    private String  hora;
    private String local;
    private Autor organizador;
    private List<Participantes> particpantes;

    public Eventos(String descricao, LocalDate data, String hora, String local, Autor organizador, List particpantes) {
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.organizador = organizador;
        this.particpantes = particpantes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Autor getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Autor organizador) {
        this.organizador = organizador;
    }

    public List getParticpantes() {
        return particpantes;
    }

    public void setParticpantes(List particpantes) {
        this.particpantes = particpantes;
    }
}
