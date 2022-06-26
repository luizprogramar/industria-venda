package com.industriavenda.vendaindustria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.industriavenda.vendaindustria.entity.Trabalhador;

@RestController
@RequestMapping(value = "/trabalhador")
public class TrabalhadorController {
	
	@Autowired
	private JpaRepository reposit;
	
	@GetMapping
	public List<Trabalhador> findAll(){
		List<Trabalhador> res = reposit.findAll();
		 return res;	
		
	}
	
}
