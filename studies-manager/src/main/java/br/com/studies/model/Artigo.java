package br.com.studies.model;

import java.io.Serializable;
import java.util.Objects;

public class Artigo extends Publicacao implements Serializable {

    private Long id;

    private String nome;

    private String descricao;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artigo artigo = (Artigo) o;
        return id.equals(artigo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
