package br.com.studies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Site extends Publicacao implements Serializable {

    @NotBlank
    @Column(name = "NOME")
    private String nome;

    @NotBlank
    @Column(name = "DESCRICAO")
    private String descricao;

    @NotBlank
    @Column(name = "LINK")
    private String link;

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
        return Objects.equals(nome, site.nome) &&
                Objects.equals(descricao, site.descricao) &&
                Objects.equals(link, site.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, link);
    }
}
