package com.dio.santander.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repositories.CorrentistaRepository;






@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	@GetMapping
	public List<Correntista> getAll(){ 
		return correntistaRepository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody Correntista correntista) {
		
		return;
	}
	
}
