package com.asistencia.serviceImp;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asistencia.model.Aula;
import com.asistencia.repository.IAulaRepository;
import com.asistencia.service.IAulaService;

@Service
public class AulaServiceImp implements IAulaService{

	@Autowired
	private IAulaRepository repository;
	
	@Override
	public Optional<Aula> buscarAulaPorId(int id) {
		return repository.findById(id);
	}

}
