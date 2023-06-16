package services;

import models.Autor;
import repositories.AutorRepository;

public class AutorService {

    private AutorRepository autorRepository;

    public void criar(Autor autor){
        if(autor.getId().length() != 11){

        }else if(autor.getNome() == null){

        }else{
            autorRepository.criar(autor);
        }
    }
}
