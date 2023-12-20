package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Vila {
	private String nome = "Desconhecido";
	private int numeroHabitantes = 0;
	
	private Coroa comando;
	private List <Formigas> habitantes = new ArrayList<Formigas>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Coroa getComando() {
		return comando;
	}
	public void setComando(Coroa comando) {
		this.comando = comando;
	}
	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}
	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	public List<Formigas> getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(ArrayList<Formigas> habitantes) {
		this.habitantes = habitantes;
		this.setNumeroHabitantes(getNumeroHabitantes()+1);
		// relacionar a vila com o habitante da vila
	}
	
	


}
