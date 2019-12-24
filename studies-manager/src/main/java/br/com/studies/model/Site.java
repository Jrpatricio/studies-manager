package br.com.studies.model;

import java.io.Serializable;
import java.util.Objects;

public class Site extends Publicacao implements Serializable {

    private Long id;

    private String nome;

    private String descricao;

    private String link;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return id.equals(site.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
