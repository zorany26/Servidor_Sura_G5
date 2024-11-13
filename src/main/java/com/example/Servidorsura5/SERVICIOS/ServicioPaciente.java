package com.example.Servidorsura5.SERVICIOS;

import com.example.Servidorsura5.MODELOS.Paciente;
import com.example.Servidorsura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPaciente {
//1.para activar al servicio: llamar al repositorio respectivo
@Autowired
IRepositorioPaciente iRepositorioPaciente ;

//2.se programa las funciones para las distintas operaciones en la BD
// funcion para guardar DATOS
    //throws Exception:permite controlar las excepciones
    public Paciente guardarPaciente(Paciente datosPaciente)throws Exception{
        try {
          return iRepositorioPaciente.save(datosPaciente);

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
