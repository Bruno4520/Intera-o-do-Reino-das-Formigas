package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Cupims extends cupins {
	private int quantidadeNomes = 1;
	private int numeroPrisioneiros = 0;
	
	private Classificacao ferramenta = null;
	private Alimento alimento = null;
	private List <Ornamento> ornamentos = new ArrayList<Ornamento>();

	public int getQuantidadeNomes() {
		return quantidadeNomes;
	}

	public void setQuantidadeNomes(int quantidadeNomes) {
		this.quantidadeNomes = quantidadeNomes;
	}

	public int getNumeroPrisioneiros() {
		return numeroPrisioneiros;
	}

	public void setNumeroPrisioneiros(int numeroPrisioneiros) {
		this.numeroPrisioneiros = numeroPrisioneiros;
	}

	public Classificacao getFerramenta() {
		return ferramenta;
	}

	public void setFerramenta(Classificacao ferramenta) {
		this.ferramenta = ferramenta;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

	public List<Ornamento> getOrnamentos() {
		return ornamentos;
	}

	public void setOrnamentos(List<Ornamento> ornamentos) {
		this.ornamentos = ornamentos;
	}

	//Operação captura:
	public void captura() {
		chamarCapturar();
	}
	
	//Operação matar():
	public void matar() {
		chamarMatar();
	}


}
