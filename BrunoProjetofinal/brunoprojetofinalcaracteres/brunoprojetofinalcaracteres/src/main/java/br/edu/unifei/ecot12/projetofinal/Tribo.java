package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Tribo {
	private String nome = "Desconhecido";
	private int numeroAldeias = 1;
	private int numeroMembros = 1;
	
	private List <Tribo> inimigos = new ArrayList <Tribo>();

	private List <Aldeia> aldeias = new ArrayList<Aldeia>();
	private Coroa coroaAliada;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroAldeias() {
		return numeroAldeias;
	}
	public void setNumeroAldeias(int numeroAldeias) {
		this.numeroAldeias = numeroAldeias;
	}
	public int getNumeroMembros() {
		return numeroMembros;
	}
	public void setNumeroMembros(int numeroMembros) {
		this.numeroMembros = numeroMembros;
	}

	public List<Tribo> getInimigos() {
		return inimigos;
	}
	public void setInimigos(List<Tribo> inimigos) {
		this.inimigos = inimigos;
	}
	public Coroa getCoroaAliada() {
		return coroaAliada;
	}
	public void setCoroaAliada(Coroa coroaAliada) {
		this.coroaAliada = coroaAliada;
	}
	public List<Aldeia> getAldeias() {
		return aldeias;
	}
	public void setAldeias(List<Aldeia> aldeias) {
		this.aldeias = aldeias;
	}
	
	
}
