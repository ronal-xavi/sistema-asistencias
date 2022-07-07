package com.asistencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.asistencia.model.Estudiante;
import com.asistencia.service.IEstudianteService;


@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Estudiante>> listaEstudiante() {
		List<Estudiante> lista = service.listaEstudiantes();
		return ResponseEntity.ok(lista);
	}

}
