package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class BuscarAlimento {

	private String metodo = "Nao Especificado";
	private int quantidadeAlimento = 0;
	private float QuantidadeMordidas = 0;
	private List<Alimento> peixes = new ArrayList <Alimento>();
	
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public int getQuantidadeAlimento() {
		return quantidadeAlimento;
	}
	public void setQuantidadeAlimento(int quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;
	}
	public float getQuantidadeMordidas() {
		return QuantidadeMordidas;
	}
	public void setQuantidadeMordidas(float quantidadeMordidas) {
		this.QuantidadeMordidas = quantidadeMordidas;
	}
	public List<Alimento> getPeixes() {
		return peixes;
	}
	public void setPeixes(List<Alimento> peixes) {
		this.peixes = peixes;
	}
	
	
}
