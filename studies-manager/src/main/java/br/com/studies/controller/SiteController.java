package br.com.studies.controller;

import br.com.studies.model.Site;
import br.com.studies.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("sites")
public class SiteController {

    @Autowired
    private SiteService service;

    @PostMapping
    public Site cadastrar(@RequestBody Site site) {return service.save(site);}

    @GetMapping
    public List<Site> buscarTodos() {
        return service.findAll();
    }

    @GetMapping("/{id}/site")
    public ResponseEntity<Site> buscar(@PathVariable Long id) {
        Optional<Site> site = service.findById(id);
        if (!site.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(site.get());
    }

    // DA PARA FAZER DELETE USANDO GET
    @GetMapping("/{id}/excluir")
    public List<Site> excluir(@PathVariable Long id) {
        service.delete(id);
        return service.findAll();
    }
}
