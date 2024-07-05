package com.technical.support.datasupport.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "registro_hora")
public class RegistroHora{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_registro_hora;

    private Date fecha_hora;

    private double duracion;

    private String descripcion;

    public Long getId_registro_hora() {
        return id_registro_hora;
    }


    @ManyToOne
    @JoinColumn(name = "id_ticket")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "id_especialista")
    private Especialista especialista;

    public void setId_registro_hora(Long id_registro_hora) {
        this.id_registro_hora = id_registro_hora;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }
}
