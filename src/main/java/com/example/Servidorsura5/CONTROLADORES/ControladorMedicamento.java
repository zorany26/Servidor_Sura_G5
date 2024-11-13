package com.example.Servidorsura5.CONTROLADORES;

import com.example.Servidorsura5.MODELOS.Medicamento;
import com.example.Servidorsura5.MODELOS.Paciente;
import com.example.Servidorsura5.SERVICIOS.ServicioMedicamento;
import com.example.Servidorsura5.SERVICIOS.ServicioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicamento")
public class ControladorMedicamento {
    @Autowired
    ServicioMedicamento servicioMedicamento;
    //post=guardar
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Medicamento datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioMedicamento.guardarMedicamento(datos));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
