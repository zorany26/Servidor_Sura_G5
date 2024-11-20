package com.example.Servidorsura5.CONTROLADORES;

import com.example.Servidorsura5.MODELOS.Paciente;
import com.example.Servidorsura5.SERVICIOS.ServicioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/paciente")//yo decido como llamo el requestMapping
public class ControladorPaciente {
    @Autowired
    ServicioPaciente servicioPaciente;

    //post=guardar
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Paciente datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioPaciente.guardarPaciente(datos));
        } catch (Exception e) {
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
                    .body(servicioPaciente.buscarPaciente());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
