package com.asistencia.service;

import java.util.Optional;
import com.asistencia.model.Asistencia;

public interface IAsistenciaService {
	Optional<Asistencia> buscarAsistenciaPorCodigoDeEstudiante(String codigo);
	void registrarAsistencia(Asistencia a);
	void actualizarAsistencia(Asistencia a);

}
