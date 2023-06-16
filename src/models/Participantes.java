package models;

public class Participantes extends Pessoa {

    private String classe;
    public Participantes(String id, String nome, String email, String telefone, String dataNascimento, String classe) {
        super(id, nome, email, telefone, dataNascimento);
        this.classe = classe;
    }

    public Participantes() {
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
