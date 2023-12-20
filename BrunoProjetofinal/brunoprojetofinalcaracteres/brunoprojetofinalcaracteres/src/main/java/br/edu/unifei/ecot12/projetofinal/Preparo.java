package br.edu.unifei.ecot12.projetofinal;

public abstract class Preparo {

	protected int valorNutritivo;
	protected int validadeDias;
	
	public abstract void atualiza(int vn, int vd);

	public int getValorNutritivo() {
		return valorNutritivo;
	}

	public void setValorNutritivo(int valorNutritivo) {
		this.valorNutritivo = valorNutritivo;
	}

	public int getValidadeDias() {
		return validadeDias;
	}

	public void setValidadeDias(int validadeDias) {
		this.validadeDias = validadeDias;
	}
}
