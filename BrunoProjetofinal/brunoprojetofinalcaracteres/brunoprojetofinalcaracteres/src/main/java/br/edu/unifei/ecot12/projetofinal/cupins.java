package br.edu.unifei.ecot12.projetofinal;

public abstract class cupins {
	private String nome = "Desconhecido";
	private String raca = "Desconhecido";
	private String funcao = "";
	private Boolean muitoFerido = false;
	private Boolean aliadoCupimss = true;
	private int vida = 100;
	
	private MediadorLutar batalha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Boolean getMuitoFerido() {
		return muitoFerido;
	}
	public void setMuitoFerido(Boolean muitoFerido) {
		this.muitoFerido = muitoFerido;
	}
	public Boolean getAliadoTCupimss() {
		return aliadoCupimss;
	}
	public void setAliadoCupimss(Boolean aliadoTupinamba) {
		this.aliadoCupimss = aliadoTupinamba;
	}
	
	public MediadorLutar getLutar() {
		return batalha;
	}
	public void setLutar(Lutar lutar) {
		this.batalha = lutar;
	}
	
	public MediadorLutar getBatalha() {
		return batalha;
	}
	public void setBatalha(MediadorLutar batalha) {
		this.batalha = batalha;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	//Operação chamarCapturar:
	protected void chamarCapturar() {
		batalha.capturar();
	}
	
	//Operação chamarMatar:
	protected void chamarMatar() {
		batalha.matar();
	}	
}
