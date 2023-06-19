package repositories;

import models.Funcionarios;

public class FuncionariosRepository {
    private Funcionarios [] funcionarios;
    public FuncionariosRepository() {
        this.funcionarios = new Funcionarios[100];
    }
    public void criar(Funcionarios funcionarios) {
        for (int i = 0; i < this.funcionarios.length; i++){
            if (this.funcionarios[i] == null){
                this.funcionarios[i] = funcionarios;
                break;
            }
        }
    }
}
