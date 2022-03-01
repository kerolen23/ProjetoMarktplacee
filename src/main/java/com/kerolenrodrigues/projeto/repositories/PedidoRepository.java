package com.kerolenrodrigues.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kerolenrodrigues.projeto.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	
	

}
