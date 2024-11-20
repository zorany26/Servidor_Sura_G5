package com.example.Servidorsura5.SERVICIOS;

import com.example.Servidorsura5.MODELOS.Paciente;
import com.example.Servidorsura5.MODELOS.SignoVital;
import com.example.Servidorsura5.REPOSITORIOS.IRepositorioPaciente;
import com.example.Servidorsura5.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioSignoVital {
    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital ;

    //2.se programa las funciones para las distintas operaciones en la BD
// funcion para guardar DATOS
    //throws Exception:permite controlar las excepciones
    public SignoVital guardarSignoVital(SignoVital datosSignoVital)throws Exception{
        try {
            return iRepositorioSignoVital.save(datosSignoVital);

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public List<SignoVital> buscarSignoVital() throws Exception {
        try {
            return iRepositorioSignoVital.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
