package com.Petprojeto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "pet")
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String datadenacimento;
	
	private String numDocumento;
	
	private String raca;
	
	private String cor;
	
	@ManyToOne
	@JoinColumn(name = "id_consulta")
	private Consulta consulta;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private Tipo tipo;
}
