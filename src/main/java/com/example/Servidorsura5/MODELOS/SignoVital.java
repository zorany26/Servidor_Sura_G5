package com.example.Servidorsura5.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="signosvitales")

public class SignoVital {

    //ANOTACIÓN
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String valor;
    private LocalDate fechaMedida;

    public SignoVital() {
    }

    public SignoVital(Long id, String nombres, String valor, LocalDate fechaMedida) {
        this.id = id;
        this.nombres = nombres;
        this.valor = valor;
        this.fechaMedida = fechaMedida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDate getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(LocalDate fechaMedida) {
        this.fechaMedida = fechaMedida;
    }

    @Override
    public String toString() {
        return "SignoVital{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", valor='" + valor + '\'' +
                ", fechaMedida=" + fechaMedida +
                '}';
    }
}
