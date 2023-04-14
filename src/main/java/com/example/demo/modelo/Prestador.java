package com.example.demo.modelo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "prestador")

public class Prestador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "prestador")
    private List<Cita> citas;

    public void registro_empleado() {
    }

    ;

    public void servicios_ofrecidos() {
    }

    ;

    public Prestador(String nombre, String apellido, String email, List<Cita> citas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.citas = citas;
    }

    public Prestador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
}
