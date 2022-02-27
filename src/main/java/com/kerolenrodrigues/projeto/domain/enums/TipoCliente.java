package com.kerolenrodrigues.projeto.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	//Construtor enumerodo é private
	private TipoCliente(int cod, String descricao) {
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
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		} 
		//Percorre todos os valores possiveis de clientes
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido " +cod);
	}
}
