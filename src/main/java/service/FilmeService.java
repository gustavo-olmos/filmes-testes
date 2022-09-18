package service;

import domain.Filme;
import lombok.AllArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import repository.FilmeRepository;

@Service
@AllArgsConstructor
public class FilmeService {
    private FilmeRepository filmeRepository;

    public Filme addFilme(Filme filme){
        validaFilme(filme);
        return filmeRepository.save(filme);
    }

    private void validaFilme(Filme filme ){
        if (filme.getNome() == null || filme.getNome().equals("")){
            throw new ObjectNotFoundException(HttpStatus.NOT_FOUND, "Autor não encontrado") ;
        }
        if (filme.getGenero() == null || filme.getGenero().equals("")){
            throw new ObjectNotFoundException(HttpStatus.NOT_FOUND, "Autor não encontrado") ;
        }
    }
}
