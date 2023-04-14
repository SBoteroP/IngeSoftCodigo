package com.example.demo.rest;

import com.example.demo.modelo.Servicio;
import com.example.demo.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/servicio/")
@RestController
public class ServicioRest {

    @Autowired
    private ServicioService servicioService;

    @GetMapping
    private ResponseEntity<List<Servicio>> getAllServicios(){
        return ResponseEntity.ok(servicioService.findAll());
    }
}
