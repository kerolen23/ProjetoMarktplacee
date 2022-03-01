package com.kerolenrodrigues.projeto.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	//Construtor enumerodo é private
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	//No enumerado somente o GET
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}

	//Static roda mesmo sem ter objeto instanciado
		public static EstadoPagamento toEnum(Integer cod) {
			if (cod == null) {
				return null;
			} 
			//Percorre todos os valores possiveis de clientes
			for(EstadoPagamento x : EstadoPagamento.values()) {
				if(cod.equals(x.getCod())) {
					return x;
				}
			}
			throw new IllegalArgumentException("Id invalido " +cod);
		}
}
