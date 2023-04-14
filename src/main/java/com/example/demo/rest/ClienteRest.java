package com.example.demo.rest;


import com.example.demo.modelo.Cliente;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cliente/")
public class ClienteRest {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    private ResponseEntity<List<Cliente>> getAllClientes() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @PostMapping
    private ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente) {
        try {
            Cliente clienteGuardado = clienteService.save(cliente);

            return ResponseEntity.created(new URI("/cliente/" + clienteGuardado.getId())).body(clienteGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
                    ;
        }
    }
}