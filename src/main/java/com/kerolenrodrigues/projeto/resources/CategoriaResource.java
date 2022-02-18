package com.kerolenrodrigues.projeto.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST esta funcionado!";
	}
}
