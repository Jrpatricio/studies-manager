package br.com.studies.service;

import br.com.studies.model.Site;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SiteService {
    
    public Site save(Site site){
        site.setNome("site de Java");
        site.setLink("http://localhost:8080/site-maneiro-de-java-spring");
        site.setDescricao("site maneiro de Java");
        site.setAutor("Fulano de Tal");
        site.setRelevancia(9);
        site.setPublished(LocalDate.now());
        return site;
    }
}
