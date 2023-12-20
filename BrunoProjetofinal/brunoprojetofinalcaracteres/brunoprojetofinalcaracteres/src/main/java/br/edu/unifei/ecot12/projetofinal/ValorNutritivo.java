package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public abstract class ValorNutritivo {
	
	private List <Preparo> preparos = new ArrayList<Preparo>();
	
	protected void notifica(int vn, int vd) {
		for(Preparo p: preparos){
			p.atualiza(vn, vd);
		}
	}

	public List<Preparo> getPreparos() {
		return preparos;
	}

	public void setPreparos(List<Preparo> preparos) {
		this.preparos = preparos;
	}
}
