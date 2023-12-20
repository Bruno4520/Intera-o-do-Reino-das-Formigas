package br.edu.unifei.ecot12.projetofinal;

public class Alimento extends ValorNutritivo{
	
	private String nome = "Não especificado";
	private String epoca = "Não especificado";
	private int valorNutritivo = 0;
	private int validadeDias = 0;
	private String preparo = "";
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEpoca() {
		return epoca;
	}
	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}
	public int getValorNutritivo() {
		return valorNutritivo;
	}
	public void setValorNutritivo(int valorNutritivo) {
		if(getValidadeDias()>0) {
			notifica(valorNutritivo, validadeDias);
		}
		this.valorNutritivo = valorNutritivo;
	}
	public int getValidadeDias() {
		return validadeDias;
	}
	public void setValidadeDias(int validadeDias) {
		if(getValorNutritivo()>0) {
			notifica(valorNutritivo, validadeDias);
		}
		this.validadeDias = validadeDias;
	}
	public String getPreparo() {
		return preparo;
	}
	public void setPreparo(String preparo) {
		this.preparo = preparo;
		if(preparo.equals(" Celulose")) {
			this.valorNutritivo = valorNutritivo*4;
			if(getValidadeDias()>0) {
			this.validadeDias = validadeDias - 1;
		}}else if(preparo.equals("Farinha")) {
			this.valorNutritivo = valorNutritivo*2;
			this.validadeDias = validadeDias*5;
		}
			
		
	}	
	
}
