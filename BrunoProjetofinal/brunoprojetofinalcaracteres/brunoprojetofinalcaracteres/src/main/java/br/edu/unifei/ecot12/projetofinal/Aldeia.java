package br.edu.unifei.ecot12.projetofinal;


import java.util.ArrayList;
import java.util.List;

public class Aldeia {
	
	private String localizacao = "Desconhecido";
	private int numeroMembros = 0;
	private Tribo tribo;
	private List <Cupinzeiro> cabanas = new ArrayList<Cupinzeiro>();
	
	//--------------------------------------------------------Gets and Sets
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public int getNumeroMembros() {
		return numeroMembros;
	}
	public void setNumeroMembros(int numeroMembros) {
		this.numeroMembros = numeroMembros;
	}
	public Tribo getTribo() {
		return tribo;
	}
	public void setTribo(Tribo tribo) {
		this.tribo = tribo;
	}
	public List<Cupinzeiro> getCabanas() {
		return cabanas;
	}
	public void setCabanas(List<Cupinzeiro> cabanas) {
		this.cabanas = cabanas;
	}
}
