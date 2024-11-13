package com.example.Servidorsura5.CONTROLADORES;

import com.example.Servidorsura5.MODELOS.Paciente;
import com.example.Servidorsura5.MODELOS.SignoVital;
import com.example.Servidorsura5.SERVICIOS.ServicioPaciente;
import com.example.Servidorsura5.SERVICIOS.ServicioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signovital")
public class ControladorSignoVital {
    @Autowired
    ServicioSignoVital servicioSignoVital;

    //post=guardar
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioSignoVital.guardarSignoVital(datos));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
