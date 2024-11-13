/*package com.example.Servidorsura5.HELPERS;

import com.example.Servidorsura5.MODELOS.Paciente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente {
    //1.inyectar un objeto de la clase MODELO
    //inyevtar=traer una clase y usuarla dentro de otra

    //creacion de objeto de la clase paciente.
    private Paciente paciente=new Paciente();

    //2.crear metodo para cada campo que quiero validar.
    public boolean validarNombres(String nombres){
        //1. Se conculta una expresión regular
        //almacenandola es una variable de tipo String
        String expresionRegular="^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        //2. Activar el patrón
        Pattern patron=Pattern.compile(expresionRegular);
        //3.Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia=patron.matcher(nombres);
        //4. Indico si hubo o no coincidencia
        if (coincidencia.find()) {
          return true;
        }else {
           return false;
        }
    }

    //public  boolean validarFechaNacimiento(LocalDate fecha){}

    public boolean validarCiudad(String ciudad){
        //1. Se conculta una expresión regular
        //almacenandola es una variable de tipo String
        String expresionRegular="^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        //2. Activar el patrón
        Pattern patron=Pattern.compile(expresionRegular);
        //3.Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia=patron.matcher(ciudad);
        //4. Indico si hubo o no coincidencia
        if (coincidencia.find()) {
            return true;
        }else {
            return false;
        }
    }
    public boolean validarCorreo(String correo){
        //1. Se conculta una expresión regular
        //almacenandola es una variable de tipo String
        String expresionRegular="^[a-zA-Z0-9._%+-]+@sura\\.com$";
        //2. Activar el patrón
        Pattern patron=Pattern.compile(expresionRegular);
        //3.Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia=patron.matcher(correo);
        //4. Indico si hubo o no coincidencia
        if (coincidencia.find()) {
            return true;
        }else {
            return false;
        }
    }
    public boolean validarTelefono(String telefono){

        //1. Se conculta una expresión regular
        //almacenandola es una variable de tipo String
        String expresionRegular="^[0-9]{7,15}$";
        //2. Activar el patrón
        Pattern patron=Pattern.compile(expresionRegular);
        //3.Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia=patron.matcher(telefono);
        //4. Indico si hubo o no coincidencia
        if (coincidencia.find()) {
            return true;
        }else {
            return false;
        }
    }
    public boolean validarIps(String ips){
        //1. Se conculta una expresión regular
        //almacenandola es una variable de tipo String
        String expresionRegular="^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        //2. Activar el patrón
        Pattern patron=Pattern.compile(expresionRegular);
        //3.Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia=patron.matcher(ips);
        //4. Indico si hubo o no coincidencia
        if (coincidencia.find()) {
            return true;
        }else {
            return false;
        }
    }
    public boolean validarGrupoIngreso(String grupoIngreso){
        //1. Se conculta una expresión regular
        //almacenandola es una variable de tipo String
        String expresionRegular="^[ABC]$";
        //2. Activar el patrón
        Pattern patron=Pattern.compile(expresionRegular);
        //3.Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia=patron.matcher(grupoIngreso);
        //4. Indico si hubo o no coincidencia
        if (coincidencia.find()) {
            return true;
        }else {
            return false;
        }
    }

    //public boolean validarFechaAfiliacion(LocalDate fechaAfiliacion){}


}
*/