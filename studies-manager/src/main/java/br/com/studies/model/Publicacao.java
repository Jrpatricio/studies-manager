package br.com.studies.model;


import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Publicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @NotBlank
    @Column(name = "AUTOR")
    private String autor;

    @NotNull
    @Column(name = "PUBLISHED_AT")
    private LocalDate published;

    @NotNull
    @Column(name = "RELEVANCIA")
    private Integer relevancia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public Integer getRelevancia() {
        return relevancia;
    }

    public void setRelevancia(Integer relevancia) {
        this.relevancia = relevancia;
    }
}
