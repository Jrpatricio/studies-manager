package br.com.studies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Artigo extends Publicacao implements Serializable {

    @NotBlank
    @Column(name = "NOME")
    private String nome;

    @NotBlank
    @Column(name = "DESCRICAO")
    private String descricao;

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
        return Objects.equals(nome, artigo.nome) &&
                Objects.equals(descricao, artigo.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao);
    }
}
