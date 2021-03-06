package com.asistencia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.asistencia.model.Aula;

@Repository
public interface IAulaRepository extends JpaRepository<Aula, Integer>{

}
