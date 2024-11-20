package com.example.Servidorsura5.CONTROLADORES;

import com.example.Servidorsura5.MODELOS.Enfermedad;
import com.example.Servidorsura5.SERVICIOS.ServicioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/enfermedad")
public class ControladorEnfermedad {
    @Autowired
    ServicioEnfermedad servicioEnfermedad;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Enfermedad datos){
       try{
           return ResponseEntity
                   .status(HttpStatus.OK)
                   .body(servicioEnfermedad.guardarEnfermedad(datos));
       }catch (Exception e){
           return ResponseEntity
                   .status(HttpStatus.BAD_REQUEST)
                   .body(e.getMessage());
       }
    }

    @GetMapping
    public ResponseEntity<?> obtener(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioEnfermedad.buscarEnfermedad());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
