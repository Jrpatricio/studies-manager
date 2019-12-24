package br.com.studies.service;

import br.com.studies.model.Livro;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {

//    @Autowired
//    LivroRepository repository;


 /*   public List<Livro> buscarTodos (){
        return repository.findAll();
    }

    public Optional<Livro> buscarPorId(Long id){
        return repository.findById(id);
    }*/

    public Livro save(Livro livro) {
        livro.setNome("Livro de Java");
        livro.setDescricao("Livro maneiro de Java");
        livro.setAutor("Fulano de Tal");
        livro.setRelevancia(9);
        livro.setPublished(LocalDate.now());
        return livro;
    }
}
