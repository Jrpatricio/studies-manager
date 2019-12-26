package br.com.studies.service;

import br.com.studies.model.Livro;
import br.com.studies.model.Site;
import br.com.studies.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SiteService {

    @Autowired
    SiteRepository repository;
    
    public Site save(Site site){
        return repository.save(site);
    }

    public void delete(Long id) { repository.delete(findById(id).get());}

    public List<Site> findAll() {
        return repository.findAll();
    }

    public Optional<Site> findById(Long id) {
        return repository.findById(id);
    }
}
