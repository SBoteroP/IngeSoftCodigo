package com.example.demo.repositorio;

import com.example.demo.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoCliente extends JpaRepository<Cliente, Long> {
}
