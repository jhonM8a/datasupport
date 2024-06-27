package com.technical.support.datasupport.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contrato;
    private Date fecha_inicio;

    private Date fecha_fin;

    private Integer horas_contratadas;

    @ManyToOne
    @JoinColumn(name ="id_cliente")
    private Cliente cliente;


    public Long getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(Long id_contrato) {
        this.id_contrato = id_contrato;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Integer getHoras_contratadas() {
        return horas_contratadas;
    }

    public void setHoras_contratadas(Integer horas_contratadas) {
        this.horas_contratadas = horas_contratadas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
