package com.lista.botanica.controller;

import com.lista.botanica.dto.FloraDTO;
import com.lista.botanica.entity.Flora;
import com.lista.botanica.service.FloraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("flora")
@CrossOrigin(origins = "*")
public class FloraController {

    @Autowired
    private FloraService floraService;

    @PostMapping
    public ResponseEntity<Flora> salvar(@RequestBody FloraDTO floraDTO) {
        System.out.println("Requisição recebida: " + floraDTO);
        Flora flora = floraService.salvar(floraDTO);
        return ResponseEntity.ok(flora);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Flora> atualizarFlora(@PathVariable Long id, @RequestBody FloraDTO floraDTO) {
        Flora floraAtualizada = floraService.atualizar(id, floraDTO);
        return ResponseEntity.ok(floraAtualizada);
    }

    @GetMapping
    public ResponseEntity<List<Flora>> listarTodas() {
        return ResponseEntity.ok(floraService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flora> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(floraService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        floraService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
