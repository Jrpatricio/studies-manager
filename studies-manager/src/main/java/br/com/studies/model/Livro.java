package br.com.studies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Livro extends Publicacao implements Serializable {

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
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) &&
                Objects.equals(descricao, livro.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao);
    }
}
