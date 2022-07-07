package com.asistencia.serviceImp;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asistencia.model.Asistencia;
import com.asistencia.repository.IAsistenciaRepository;
import com.asistencia.service.IAsistenciaService;


@Service
public class AsistenciaServiceImp implements IAsistenciaService{

	@Autowired
	private IAsistenciaRepository repository;

	@Override
	public Optional<Asistencia> buscarAsistenciaPorCodigoDeEstudiante(String codigo) {
		LocalDate fechaActual = LocalDate.now();
		return repository.findByEstudiante_CodigoAndFechaIngreso(codigo, fechaActual);
	}

	@Override
	public void registrarAsistencia(Asistencia a) {
		LocalDate fechaActual = LocalDate.now();
		a.setFechaIngreso(fechaActual);
		a.setIngresoConfirmado(true);
		a.setSalidaConfirmado(false);
		repository.save(a);
	}

	@Override
	public void actualizarAsistencia(Asistencia a) {
		a.setSalidaConfirmado(true);
		repository.save(a);
		
	}

}
