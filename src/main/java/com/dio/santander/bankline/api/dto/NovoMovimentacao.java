package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.model.MovimentacaoTipo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class NovoMovimentacao {
	
	private String descricao;
		
	private Double valor;
	
	private MovimentacaoTipo tipo;
	
	private Integer idConta;
	
}
