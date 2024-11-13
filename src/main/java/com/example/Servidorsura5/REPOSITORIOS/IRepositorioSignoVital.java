package com.example.Servidorsura5.REPOSITORIOS;

import com.example.Servidorsura5.MODELOS.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioSignoVital extends JpaRepository<SignoVital, Long> {
}
