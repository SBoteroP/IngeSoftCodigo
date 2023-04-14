package com.example.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_prestador")
    private Prestador prestador;

    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicio servicio;

    private String fecha;
    private String hora;


    public void agregar_cita() {
    }

    public void estado_cita() {
    }

    public void cancelar_cita() {
    }

    public void info_cita() {
    }

    public Cita(Cliente cliente, Prestador prestador, Servicio servicio, String fecha, String hora) {
        this.cliente = cliente;
        this.prestador = prestador;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Cita() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
