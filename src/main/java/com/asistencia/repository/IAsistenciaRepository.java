package com.asistencia.repository;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.asistencia.model.Asistencia;

@Repository
public interface IAsistenciaRepository extends JpaRepository<Asistencia, Integer>{

	public Optional<Asistencia> findByEstudiante_CodigoAndFechaIngreso(String codigo, LocalDate fechaIngreso);
}
