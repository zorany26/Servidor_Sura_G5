package com.example.Servidorsura5.SERVICIOS;

import com.example.Servidorsura5.MODELOS.Medicamento;
import com.example.Servidorsura5.MODELOS.Paciente;
import com.example.Servidorsura5.REPOSITORIOS.IRepositorioMedicamento;
import com.example.Servidorsura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedicamento {
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento ;

    //2.se programa las funciones para las distintas operaciones en la BD
// funcion para guardar DATOS
    //throws Exception:permite controlar las excepciones
    public Medicamento guardarMedicamento(Medicamento datosMedicamento)throws Exception{
        try {
            return iRepositorioMedicamento.save(datosMedicamento);

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
