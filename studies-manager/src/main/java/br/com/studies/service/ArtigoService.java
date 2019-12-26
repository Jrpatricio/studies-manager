package br.com.studies.service;

import br.com.studies.model.Artigo;
import br.com.studies.model.Livro;
import br.com.studies.repository.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ArtigoService {

    @Autowired
    ArtigoRepository repository;

    public Artigo save(Artigo artigo){
        return repository.save(artigo);
    }

    public void delete(Long id) { repository.delete(findById(id).get());}

    public List<Artigo> findAll() {
        return repository.findAll();
    }

    public Optional<Artigo> findById(Long id) {
        return repository.findById(id);
    }
}
