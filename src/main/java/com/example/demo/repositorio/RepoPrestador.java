package com.example.demo.repositorio;

import com.example.demo.modelo.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPrestador extends JpaRepository<Prestador, Long> {
}
