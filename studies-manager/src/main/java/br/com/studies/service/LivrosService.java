package br.com.studies.service;

import br.com.studies.model.Livro;

import br.com.studies.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {

    @Autowired
    LivroRepository repository;

    public Livro save(Livro livro) {
        return repository.save(livro);
    }

    public void delete(Long id) { repository.delete(findById(id).get());}

    public List<Livro> findAll() { return repository.findAll();}

    public Optional<Livro> findById(Long id) { return repository.findById(id);}
}
