package com.dio.santander.bankline.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Correntista {
	
	@Id
	@GeneratedValue()
	private Integer id;
	private String cpf;
	private String nome;
	
	private Conta conta;
}
