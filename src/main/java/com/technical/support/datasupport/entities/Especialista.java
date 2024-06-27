package com.technical.support.datasupport.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "especialista")
public class Especialista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_especialista;

    private String nombre;

    private String apellido;

    private double tasa_hora;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;


    public Long getId_especialista() {
        return id_especialista;
    }

    public void setId_especialista(Long id_especialista) {
        this.id_especialista = id_especialista;
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

    public double getTasa_hora() {
        return tasa_hora;
    }

    public void setTasa_hora(double tasa_hora) {
        this.tasa_hora = tasa_hora;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
