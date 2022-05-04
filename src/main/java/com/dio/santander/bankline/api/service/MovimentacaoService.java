package com.dio.santander.bankline.api.service;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovoMovimentacao;

import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.model.MovimentacaoTipo;
import com.dio.santander.bankline.api.repositories.CorrentistaRepository;
import com.dio.santander.bankline.api.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	public void save(NovoMovimentacao novoMovimentacao) {
		Movimentacao movimentacao = new Movimentacao();
		
		Double valor = novoMovimentacao.getTipo() == MovimentacaoTipo.RECEITA ? novoMovimentacao.getValor() : novoMovimentacao.getValor() * -1;
		
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setIdConta(novoMovimentacao.getIdConta());
		movimentacao.setDescricao(novoMovimentacao.getDescricao());
		movimentacao.setValor(valor);
		movimentacao.setTipo(novoMovimentacao.getTipo());
				
		
		Correntista correntista = correntistaRepository.findById(novoMovimentacao.getIdConta()).orElse(null);
		if (correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		
		movimentacaoRepository.save(movimentacao);
	}
}
