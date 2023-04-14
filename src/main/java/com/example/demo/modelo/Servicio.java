package com.example.demo.modelo;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre_servicio;
    private String descripcion;
    private double costo;

    @JsonIgnore
    @OneToMany(mappedBy = "servicio")
    private List<Cita> citas;


    public void agregar_servicio() {
    }

    public void actualizar_info() {
    }

    public void mostrar_info() {
    }

    public Servicio(String nombre_servicio, String descripcion, double costo, List<Cita> citas) {
        this.nombre_servicio = nombre_servicio;
        this.descripcion = descripcion;
        this.costo = costo;
        this.citas = citas;
    }

    public Servicio() {
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
}

