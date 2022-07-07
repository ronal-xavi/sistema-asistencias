package com.asistencia.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asistencia.model.Estudiante;
import com.asistencia.repository.IEstudianteRepository;
import com.asistencia.service.IEstudianteService;

@Service
public class EstudianteServiceImp implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepository repo;

	@Override
	public List<Estudiante> listaEstudiantes() {
		return repo.findAll();
	}

}
