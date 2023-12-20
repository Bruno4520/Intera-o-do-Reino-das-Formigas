package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Bebida extends Produto {
	
	private List<Alimento> ingredientes = new ArrayList<Alimento>();

	public List<Alimento> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Alimento> ingredientes) {
		this.ingredientes = ingredientes;
	}

}
