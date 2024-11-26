package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	 @GetMapping("/bsm")
	    public List<String> listarBSMs() {
	        return List.of(
	            "Orientação ao Detalhe", 
	            "Mentalidade de Crescimento", 
	            "Orientação ao Futuro", 
	            "Persistência", 
	            "Trabalho em Equipe", 
	            "Responsabilidade Pessoal", 
	            "Comunicação", 
	            "Proatividade"
	        );
	    }

	    @GetMapping("/objetivos")
	    public List<String> listarObjetivos() {
	        return List.of(
	            "Estudar mais sobre a linguagem SQL", 
	            "Praticar a ferramenta MySQL", 
	            "Desenvolver testes e colocar em pratica o aprendizado da semana"
	        );
	    }
}