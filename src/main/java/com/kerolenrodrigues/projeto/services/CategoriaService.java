package com.kerolenrodrigues.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.kerolenrodrigues.projeto.domain.Categoria;
import com.kerolenrodrigues.projeto.repositories.CategoriaRepository;
import com.kerolenrodrigues.projeto.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional <Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null); //Se o objeto tiver vazio vai atualizar
		return repo.save(obj);
	}
	
	public Categoria update (Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
		repo.deleteById(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new com.kerolenrodrigues.projeto.services.exceptions.DataIntegrityViolationException("Não é possível excluir uma categoria que possui produto");
			
		}
	}
	
	public List<Categoria> findAll(){
		return repo.findAll();
	}
}
