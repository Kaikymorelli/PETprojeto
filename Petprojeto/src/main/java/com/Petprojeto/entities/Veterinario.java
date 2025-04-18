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
@Table (name = "veterinario")
public class Veterinario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String rg;
	
	private String cidade;
	
	private String crmv;
	
	private String telefone1;
	
	private String telefone2;
	
	private String rua;
	
	private String bairro;
	
	private String cep;
	

	@ManyToOne
	@JoinColumn(name = "id_especialidade")
	private especialidade especialidade;
}
