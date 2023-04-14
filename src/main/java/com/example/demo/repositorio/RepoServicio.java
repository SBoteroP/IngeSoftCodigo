package com.example.demo.repositorio;

import com.example.demo.modelo.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoServicio extends JpaRepository<Servicio, Long> {
}
