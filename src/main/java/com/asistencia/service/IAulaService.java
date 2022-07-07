package com.asistencia.service;

import java.util.Optional;
import com.asistencia.model.Aula;

public interface IAulaService {
	Optional<Aula> buscarAulaPorId(int id);
}
