package br.com.studies.controller;

import br.com.studies.model.Artigo;
import br.com.studies.model.Artigo;
import br.com.studies.service.ArtigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("artigos")
public class ArtigoController {

    @Autowired
    private ArtigoService service;

    @PostMapping("cadastrar")
    public Artigo cadastrar(@RequestBody Artigo artigo){
        return service.save(artigo);
    }

    @GetMapping
    public List<Artigo> buscarTodos() {
        return service.findAll();
    }

    @GetMapping("/{id}/artigo")
    public ResponseEntity<Artigo> buscar(@PathVariable Long id) {
        Optional<Artigo> artigo = service.findById(id);
        if (!artigo.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(artigo.get());
    }

    // DA PARA FAZER DELETE USANDO GET
    @GetMapping("/{id}/excluir")
    public List<Artigo> excluir(@PathVariable Long id) {
        service.delete(id);
        return service.findAll();
    }

}
