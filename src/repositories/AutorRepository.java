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
}
