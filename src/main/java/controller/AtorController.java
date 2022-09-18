package controller;

import domain.Ator;
import domain.Filme;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AtorService;

@RestController
@RequestMapping("/ator")
@AllArgsConstructor
public class AtorController {
    private AtorService atorService;

    @PostMapping
    public ResponseEntity<Ator> addAtor(@RequestBody Ator ator){
        Ator retorno = atorService.addAtor(ator);
        return new ResponseEntity<>(retorno, HttpStatus.CREATED);
    }
}
