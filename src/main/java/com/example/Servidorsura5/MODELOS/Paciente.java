package com.example.Servidorsura5.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="pacientes")

public class Paciente {

    //ANOTACIÓN
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombres;//35 caracteres y solo letras
    private LocalDate fechaNacimiento; //max 1900
    private String ciudad; //40caracteres y solo letras
    private String correo;// correo vlido:@sura.com.co
    private String telefono;//max 12 numeros
    private String ips;//max 50 caracteres
    private Character grupoIngresos; //solo admite A, B o C, mayuscula
    private Boolean tienePoliza;
    private LocalDate fechaAfiliacion;//no puede ser menor a 2010

    //Creando una relacion con la clase Medico
    //Me relaciono con 1 medico
    //@ManyToOne
    //@JoinColumn(name = "fk_medico", referencedColumnName = "id")
    //@JsonBackReference
    //private Medico medico;

    //@OneToMany(mappedBy = "paciente")
    //@JsonManagedReference
    //private List<SignoVital> signosVitales;

    public Paciente() {

    }

    public Paciente(LocalDate fechaAfiliacion, Boolean tienePoliza, Character grupoIngresos, String ips, String telefono, String correo, String ciudad, LocalDate fechaNacimiento, String nombres, Long id) {
        this.fechaAfiliacion = fechaAfiliacion;
        this.tienePoliza = tienePoliza;
        this.grupoIngresos = grupoIngresos;
        this.ips = ips;
        this.telefono = telefono;
        this.correo = correo;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.nombres = nombres;
        this.id = id;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public Character getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(Character grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", ciudad='" + ciudad + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ips=" + ips +
                ", grupoIngresos=" + grupoIngresos +
                ", tienePoliza=" + tienePoliza +
                ", fechaAfiliacion=" + fechaAfiliacion +
                '}';
    }
}
