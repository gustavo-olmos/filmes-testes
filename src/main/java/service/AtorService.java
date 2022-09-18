package service;

import domain.Ator;
import lombok.AllArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.annotations.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import repository.AtorRepository;

@Service
@AllArgsConstructor
public class AtorService {
    private AtorRepository atorRepository;

    public Ator addAtor(Ator ator){
        validaAtor(ator);
        return atorRepository.save(ator);
    }

    private void validaAtor(Ator ator){
        if (ator.getNome() == null || ator.getNome().equals("")){
            throw new ObjectNotFoundException(HttpStatus.NOT_FOUND, "Autor não encontrado") ;
        }
    }
}
