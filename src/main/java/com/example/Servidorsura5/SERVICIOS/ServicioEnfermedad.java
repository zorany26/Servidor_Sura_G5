package com.example.Servidorsura5.SERVICIOS;

import com.example.Servidorsura5.MODELOS.Enfermedad;
import com.example.Servidorsura5.REPOSITORIOS.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEnfermedad {
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    public Enfermedad guardarEnfermedad(Enfermedad datosEnfermedad) throws Exception{
        try{
            return iRepositorioEnfermedad.save(datosEnfermedad);

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
