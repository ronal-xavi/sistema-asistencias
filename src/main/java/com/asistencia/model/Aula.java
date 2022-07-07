package com.asistencia.model;

import java.util.List;

import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@OneToMany
	@JoinColumn(name = "aula_id")
	private List<Estudiante> estudiantes;
}
