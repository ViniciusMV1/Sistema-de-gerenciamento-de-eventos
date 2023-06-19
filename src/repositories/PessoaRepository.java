package repositories;

import models.Pessoa;

public class PessoaRepository {
    private Pessoa [] pessoas;
    public PessoaRepository() {
        this.pessoas = new Pessoa[100];
    }
    public void criar(Pessoa pessoa) {
        for (int i = 0; i < this.pessoas.length; i++){
            if (this.pessoas[i] == null){
                this.pessoas[i] = pessoa;
                break;
            }
        }
    }
}
