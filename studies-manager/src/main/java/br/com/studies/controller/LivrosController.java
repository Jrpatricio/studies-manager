package br.com.studies.controller;

import br.com.studies.model.Livro;
import br.com.studies.service.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@SuppressWarnings("unused")
@RestController
@RequestMapping("/livros")
public class LivrosController {

    @Autowired
    private LivrosService service;

	@PostMapping
	public Livro cadastrar(@RequestBody Livro livro) {
		return service.save(livro);
	}

    @GetMapping
    public List<Livro> buscarTodos() {
        return service.findAll();
    }

    @GetMapping("/{id}/livro")
    public ResponseEntity<Livro> buscar(@PathVariable Long id) {
        Optional<Livro> livro = service.findById(id);
        if (!livro.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(livro.get());
    }

    // DA PARA FAZER DELETE USANDO GET
	@GetMapping("/{id}/excluir")
	public List<Livro> excluir(@PathVariable Long id) {
		service.delete(id);
		return service.findAll();
	}
}
