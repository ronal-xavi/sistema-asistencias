package com.asistencia.model;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Asistencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fechaIngreso;
	private boolean ingresoConfirmado;
	private boolean salidaConfirmado;
	@ManyToOne
	@JoinColumn(name = "estudiante_id")
	@JsonIgnoreProperties({"estudiante","hibernateLazyInitializer","handler"})
	private Estudiante estudiante;
	
	

}
