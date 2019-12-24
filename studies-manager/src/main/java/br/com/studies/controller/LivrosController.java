package br.com.studies.controller;

import java.util.List;
import java.util.Optional;


import br.com.studies.model.Livro;
import br.com.studies.service.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@SuppressWarnings("unused")
@RestController
@RequestMapping("/livros")
public class LivrosController {

	@Autowired
	private LivrosService service;

//	@GetMapping("/listar")
//	public List<Livro> listar() {
//		return service.buscarTodos();
//	}

//	@GetMapping("/produto={id}")
//	public ResponseEntity<ComicBook> buscar(@PathVariable Long id) {
//		Optional<ComicBook> comicBook = service.buscarPorId(id);
//
//		if (comicBook.empty() != null) {
//			return ResponseEntity.ok(comicBook.get());
//		}
//		return ResponseEntity.notFound().build();
//	}

	@PostMapping("/cadastrar")
	public Livro cadastrar(Livro livro) {
		return service.save(livro);
	}

//	@PostMapping("/excluir={id}")
//	public List<ComicBook> excluir(@PathVariable Long id) {
//		service.excluir(id);
//		return service.buscarTodos();
//	}

//	@PostMapping("/vender={id}")
//	public ComicBook vender (@PathVariable Long id){
//		return service.darBaixa(id);
//	}
//
//
//	@PostMapping("/editar={id}")
//	public ComicBook editar (@PathVariable Long id){
//		return service.editar(id);
//	}


}
