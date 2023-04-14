package com.example.demo.repositorio;

import com.example.demo.modelo.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoCita extends JpaRepository<Cita, Long> {
}
