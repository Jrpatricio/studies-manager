package br.com.studies.controller;

import br.com.studies.model.Artigo;
import br.com.studies.service.ArtigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("artigos")
public class ArtigoController {

    @Autowired
    private ArtigoService service;

    @PostMapping("cadastrar")
    public Artigo cadastrar(Artigo artigo){
        return service.save(artigo);
    }

}
