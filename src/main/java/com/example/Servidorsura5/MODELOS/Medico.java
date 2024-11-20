package com.example.Servidorsura5.MODELOS;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="medicos")

public class Medico {

    //ANOTACIÓN
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;//35 caracteres y solo letras
    private String matriculaProfesional;//max 20 caracteres
    private String especialidad;//max 20 caracteres
    private String salario;//solo positivo, no admite menos 10mill y max 20mill
    private Integer ips;//max 50 caracteres
    private String correo;//debe: @sura.com.co
    private String telefono;//max 12 caracteres solo numeros
    private String direccion;//max 50 caracte
    private Boolean disponibleFinSemana;

    //Creando una relacion con la clase paciente
    //me relaciono con muchos pacientes
    //@OneToMany(mappedBy = "medico" )
    //@JsonManagedReference
    //private List<Paciente> pacientes;

    public Medico() {
    }

    public Medico(Long id, String nombres, String matriculaProfesional, String especialidad, String salario, Integer ips, String correo, String telefono, String direccion, Boolean disponibleFinSemana) {
        this.id = id;
        this.nombres = nombres;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.disponibleFinSemana = disponibleFinSemana;
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

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Integer getIps() {
        return ips;
    }

    public void setIps(Integer ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponibleFinSemana() {
        return disponibleFinSemana;
    }

    public void setDisponibleFinSemana(Boolean disponibleFinSemana) {
        this.disponibleFinSemana = disponibleFinSemana;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", matriculaProfesional='" + matriculaProfesional + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", salario='" + salario + '\'' +
                ", ips=" + ips +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", disponibleFinSemana=" + disponibleFinSemana +
                '}';
    }
}
