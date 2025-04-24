package com.lista.botanica.service;

import com.lista.botanica.dto.FloraDTO;
import com.lista.botanica.entity.Flora;
import com.lista.botanica.repository.FloraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.util.List;

@Service
public class FloraService {

    @Autowired
    private FloraRepository repository;

    public Flora salvar(FloraDTO floraDTO) {
        Flora flora = new Flora();
        flora.setNomePopular(floraDTO.getNomePopular());
        flora.setNomeCientifico(floraDTO.getNomeCientifico());
        flora.setHistoriaPlanta(floraDTO.getHistoriaPlanta());
        flora.setRega(floraDTO.getRega());
        flora.setLuz(floraDTO.getLuz());
        flora.setBioma(floraDTO.getBioma());

        // Salvando a imagem como base64
        flora.setImagemBase64(floraDTO.getImagemBase64());

        return repository.save(flora);
    }

    public Flora atualizar(Long id, FloraDTO floraDTO) {
        Flora floraExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Planta não encontrada"));

        floraExistente.setNomePopular(floraDTO.getNomePopular());
        floraExistente.setNomeCientifico(floraDTO.getNomeCientifico());
        floraExistente.setHistoriaPlanta(floraDTO.getHistoriaPlanta());
        floraExistente.setRega(floraDTO.getRega());
        floraExistente.setLuz(floraDTO.getLuz());
        floraExistente.setBioma(floraDTO.getBioma());

        if (floraDTO.getImagemBase64() != null) {
            floraExistente.setImagemBase64(floraDTO.getImagemBase64());
        }

        return repository.save(floraExistente);
    }

    public List<Flora> listarTodas() {
        return repository.findAll();
    }

    public Flora buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Planta não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}