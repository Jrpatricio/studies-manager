package br.com.studies.service;

import br.com.studies.model.Artigo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ArtigoService {
    
    public Artigo save(Artigo artigo){
        artigo.setNome("artigo de Java");
        artigo.setDescricao("artigo maneiro de Java");
        artigo.setAutor("Fulano de Tal");
        artigo.setRelevancia(9);
        artigo.setPublished(LocalDate.now());
        return artigo;
    }
}
