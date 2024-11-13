package com.example.Servidorsura5.SERVICIOS;

import com.example.Servidorsura5.MODELOS.Medico;
import com.example.Servidorsura5.MODELOS.Paciente;
import com.example.Servidorsura5.REPOSITORIOS.IRepositorioMedico;
import com.example.Servidorsura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedico {
    @Autowired
    IRepositorioMedico iRepositorioMedico ;

    //2.se programa las funciones para las distintas operaciones en la BD
// funcion para guardar DATOS
    //throws Exception:permite controlar las excepciones
    public Medico guardarMedico(Medico datosMedico)throws Exception{
        try {
            return iRepositorioMedico.save(datosMedico);

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
