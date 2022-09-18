package com.ada.filmestestes.testes;

import domain.Ator;
import domain.Filme;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import service.AtorService;
import service.FilmeService;

import java.util.List;

@SpringBootTest
public class ServicesTestes {

    @Autowired
    AtorService atorService;
    @Autowired
    FilmeService filmeService;

    @Test
    public void testeAdiciona(){
        Ator ator1 = Ator.builder()
                .nome("Gustavinho")
                .build();
        Ator ator2 = Ator.builder()
                .nome("Marthina")
                .build();

        atorService.addAtor(ator1);
        atorService.addAtor(ator2);

        Filme filme = Filme.builder()
                .nome("A espera de um milagre")
                .anoLanc(2004)
                .atorList(List.of(ator1,ator2))
                .genero("Drama")
                .build();

        Filme filmeRetorno = filmeService.addFilme(filme);

        Assertions.assertEquals(filme,filmeRetorno);
    }
}
