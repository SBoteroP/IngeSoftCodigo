package com.example.demo.rest;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Prestador;
import com.example.demo.service.PrestadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/prestador/")
public class PrestadorRest {

    @Autowired
    PrestadorService prestadorService;

    @GetMapping
    private ResponseEntity<List<Prestador>> getAllPrestadores() {
        return ResponseEntity.ok(prestadorService.findAll());
    }

    @PostMapping
    private ResponseEntity<Prestador> saveCliente(@RequestBody Prestador prestador) {
        try {
            Prestador prestadorGuardado = prestadorService.save(prestador);

            return ResponseEntity.created(new URI("/prestador/" + prestadorGuardado.getId())).body(prestadorGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
