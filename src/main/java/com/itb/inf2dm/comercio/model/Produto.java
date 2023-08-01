package com.itb.inf2dm.comercio.model;

public class Produto {
	private Long id;
	private String descricao;
	private String codigoBarras;
	private String aceitar;
	private String nome;
	private double preco;
	
	//public : Modificador de acesso livre para todas as classes.
	//private : Modificador de acesso rstrito apenas para membros da
	//própria classe. Entende-se por "membros" (atributos e /ou métodos)
	
	//Métodos setter's e Getter's : Adicionar e recurar dados do atributo "RESPECTIVAMENTE"
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId(){
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
