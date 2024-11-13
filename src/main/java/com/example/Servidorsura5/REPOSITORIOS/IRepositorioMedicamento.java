package com.example.Servidorsura5.REPOSITORIOS;
import com.example.Servidorsura5.MODELOS.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IRepositorioMedicamento extends JpaRepository<Medicamento,Long> {
}
