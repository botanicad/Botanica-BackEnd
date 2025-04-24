package com.lista.botanica.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_flora")
public class Flora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePopular;
    private String nomeCientifico;
    private String historiaPlanta;
    private String rega;
    private String luz;
    private String bioma;
    @Lob
    private String imagemBase64; //Porque salvamos apenas o caminho da imagem no banco de dados.

    //Constructors
    public Flora() {

    }
    public Flora(Long id, String nomePopular, String nomeCientifico, String historiaPlanta, String luz, String rega, String bioma, String imagemBase64) {
        this.id = id;
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.historiaPlanta = historiaPlanta;
        this.luz = luz;
        this.rega = rega;
        this.bioma = bioma;
        this.imagemBase64 = imagemBase64;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }
    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getHistoriaPlanta() {
        return historiaPlanta;
    }

    public void setHistoriaPlanta(String historiaPlanta) {
        this.historiaPlanta = historiaPlanta;
    }

    public String getLuz() {
        return luz;
    }

    public void setLuz(String luz) {
        this.luz = luz;
    }

    public String getRega() {
        return rega;
    }

    public void setRega(String rega) {
        this.rega = rega;
    }

    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }
    public String getImagemBase64() {
        return imagemBase64;
    }

    public void setImagemBase64(String imagemBase64) {
        this.imagemBase64 = imagemBase64;
    }
}
