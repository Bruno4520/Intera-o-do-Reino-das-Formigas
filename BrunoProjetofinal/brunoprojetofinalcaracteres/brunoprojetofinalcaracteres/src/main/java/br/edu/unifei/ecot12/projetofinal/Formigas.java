package br.edu.unifei.ecot12.projetofinal;

public class Formigas extends cupins {
	private Boolean ehPrisioneiro = false;
	private Boolean foiDevorado = false;
	private Coroa filiacao;
	
	public Boolean getEhPrisioneiro() {
		return ehPrisioneiro;
	}
	public void setEhPrisioneiro(Boolean ehPrisioneiro) {
		this.ehPrisioneiro = ehPrisioneiro;
	}
	public Boolean getFoiDevorado() {
		return foiDevorado;
	}
	public void setFoiDevorado(Boolean foiDevorado) {
		this.foiDevorado = foiDevorado;
	}

	public Coroa getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(Coroa filiacao) {
		this.filiacao = filiacao;
	}
	
	// Operação captura:
	public void captura() {
		chamarCapturar();
	}
	
	// Operação matar:
	public void matar() {
		chamarMatar();
	}
}
