package br.edu.unifei.ecot12.projetofinal;

public class Organico extends Preparo{

	public void atualiza(int vn, int vd) {
		this.valorNutritivo = vn*4;
		if(getValidadeDias()<=0) {
		this.validadeDias = vd - 1;
		}
		
	}
}
