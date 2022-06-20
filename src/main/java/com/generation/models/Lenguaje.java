package com.generation.models;

import javax.persistence.*;

@Entity
@Table(name="lenguajes")
public class Lenguaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //atributos
    private String idioma;
    private String paisLengua;
    private String ejemplo;

    //constructores

    public Lenguaje() {
    }

    public Lenguaje(Long id, String idioma, String paisLengua, String ejemplo) {
        this.idioma = idioma;
        this.paisLengua = paisLengua;
        this.ejemplo = ejemplo;
        this.id = id;
    }

    //Getter and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getpaisLenguaa() {
        return paisLengua;
    }

    public void setpaisLengua(String paisLengua) {
        this.paisLengua = paisLengua;
    }

    public String getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(String ejemplo) {
        this.ejemplo = ejemplo;
    }
}
