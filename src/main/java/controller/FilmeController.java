package controller;

import domain.Filme;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.FilmeService;

@RestController
@RequestMapping("/filme")
@AllArgsConstructor
public class FilmeController {
    private FilmeService filmesService;

    @PostMapping
    public ResponseEntity <Filme> addFilme(@RequestBody Filme filme){
        Filme retorno = filmesService.addFilme(filme);
        return new ResponseEntity<>(retorno, HttpStatus.CREATED);
    }

}
