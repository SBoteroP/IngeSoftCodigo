package com.example.demo.rest;


import com.example.demo.modelo.Cita;
import com.example.demo.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cita/")
public class CitaRest {

    @Autowired
    private CitaService citaService;

    @GetMapping
    private ResponseEntity<List<Cita>> getAllCitas(){
        return ResponseEntity.ok(citaService.findAll());
    }

    @GetMapping ("clientes/{id}")
    private ResponseEntity<List<Cita>> getAllClientesByCita (@PathVariable("id") Long idCliente){
        return ResponseEntity.ok(citaService.findAllByCliente(idCliente));
    }

    @GetMapping ("prestadores/{id}")
    private ResponseEntity<List<Cita>> getAllPrestadoresByCita (@PathVariable("id") Long idPrestador){
        return ResponseEntity.ok(citaService.findAllByPrestador(idPrestador));
    }
}
