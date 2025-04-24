package com.lista.botanica.dto;

import org.springframework.web.multipart.MultipartFile;

public class FloraDTO {

    private Long id;
    private String nomePopular;
    private String nomeCientifico;
    private String historiaPlanta;
    private String luz;
    private String rega;
    private String bioma;
    private String imagemBase64;

    // Getters and Setters
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
