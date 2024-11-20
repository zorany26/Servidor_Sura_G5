package com.example.Servidorsura5.CONTROLADORES;

import com.example.Servidorsura5.MODELOS.Medico;
import com.example.Servidorsura5.MODELOS.Paciente;
import com.example.Servidorsura5.SERVICIOS.ServicioMedico;
import com.example.Servidorsura5.SERVICIOS.ServicioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medico")
public class ControladorMedico {
    @Autowired
    ServicioMedico servicioMedico;

    //post=guardar
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Medico datos) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioMedico.guardarMedico(datos));
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
                    .body(servicioMedico.buscarMedico());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

}
