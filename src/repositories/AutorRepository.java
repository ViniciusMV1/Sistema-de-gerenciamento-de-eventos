package repositories;

import models.Autor;

public class AutorRepository {

    private Autor[] autores;

    public AutorRepository() {
        this.autores = new Autor[100];
    }

    public void criar(Autor autor) {
        for(int i = 0; i < autores.length; i++){
            if(this.autores[i] == null){
                this.autores[i] = autor;
                break;
            }
        }
    }

    //buscar
    public Autor buscar(String id){
        for(int i = 0; i < autores.length; i++){
            if(this.autores[i] == null){
                throw new RuntimeException("Banco vazio");
            }else{
                if(this.autores[i].getId().equals(id)){
                    return autores[i];
                }
            }
        }
        return null;
    }
    //deletar

    //atualizar

    //buscarTodos
}
