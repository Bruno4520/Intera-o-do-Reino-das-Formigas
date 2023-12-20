package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Cupinzeiro {

	private int tamanho = 1;
	private int numeroMoradores = 0;
	private Cupims chefe;
	private  List <Cupims> moradores = new ArrayList<Cupims>();
	
	//--------------------------------------------------------Gets and Sets
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getNumeroMoradores() {
		return numeroMoradores;
	}
	public void setNumeroMoradores(int numeroMoradores) {
		this.numeroMoradores = numeroMoradores;
	}
	public Cupims getChefe() {
		return chefe;
	}
	public void setChefe(Cupims chefe) {
		this.chefe = chefe;
	}
	public List<Cupims> getMoradores() {
		return moradores;
	}
	public void setMoradores(List<Cupims> moradores) {
		this.moradores = moradores;
	}
}
