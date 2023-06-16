package models;

public class Funcionarios extends Pessoa {
    private String cargo;

    public Funcionarios(String id, String nome, String email, String telefone, String dataNascimento, String cargo) {
        super(id, nome, email, telefone, dataNascimento);
        this.cargo = cargo;
    }

    public Funcionarios() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
