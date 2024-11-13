package com.example.Servidorsura5.REPOSITORIOS;

import com.example.Servidorsura5.MODELOS.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedico extends JpaRepository<Medico,Long>{
}
