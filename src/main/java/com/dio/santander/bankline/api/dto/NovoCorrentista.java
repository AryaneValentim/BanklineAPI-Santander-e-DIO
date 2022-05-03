package com.dio.santander.bankline.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NovoCorrentista {
	
	private String nome;
	private String cpf;
	
}
