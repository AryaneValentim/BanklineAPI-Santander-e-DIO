package com.dio.santander.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovoMovimentacao;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.repositories.MovimentacaoRepository;
import com.dio.santander.bankline.api.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

	@Autowired
	private MovimentacaoRepository movimentacaoRepository;

	@Autowired
	private MovimentacaoService movimentacaoService;

	@GetMapping
	public List<Movimentacao> getAll() {
		return movimentacaoRepository.findAll();
	}

	@PostMapping
	public void save(@RequestBody NovoMovimentacao movimentacao) {
		movimentacaoService.save(movimentacao);
	}

}
