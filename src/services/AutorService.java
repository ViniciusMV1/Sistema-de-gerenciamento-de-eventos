package services;

import models.Autor;
import repositories.AutorRepository;

public class AutorService {

    private AutorRepository autorRepository;

    public void criar(Autor autor){
        if(autor.getId().length() != 11){
            throw new RuntimeException("id Invalido!");
        }else if(autor.getNome() == null){
            throw new RuntimeException("Nome não preenchido");
        }else{
            autorRepository.criar(autor);
        }
    }

    public Autor buscar(String id){
        Autor aux = null;
        if(id.length() != 11){
            throw new RuntimeException("Id invalido!");
        }else{
            aux = autorRepository.buscar(id);
        }
        if(aux == null){
            throw new RuntimeException("Autor não existe");
        }
        return aux;
    }
}
