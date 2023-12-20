package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Expedicao {
	private int sonhosBons = 0;
	private int sonhosRuins = 0;
	private int quantidadeCupims = 0;
	private int quantidadeFerrao = 0;
	private Boolean realizaExpedicao = false;
	
	private List <Aleluia> aleluia = new ArrayList<Aleluia>();
	private List <Cupims> cupims = new ArrayList<Cupims>();
	private List <Ferrao> ferrao = new ArrayList<Ferrao>();
	
	
	public int getSonhosBons() {
		return sonhosBons;
	}

	public void setSonhosBons(int sonhosBons) {
		this.sonhosBons = sonhosBons;
	}

	public int getSonhosRuins() {
		return sonhosRuins;
	}

	public void setSonhosRuins(int sonhosRuins) {
		this.sonhosRuins = sonhosRuins;
	}

	public int getQuantidadeCupims() {
		return quantidadeCupims;
	}

	public void setQuantidadeCupims(int quantidadeCupims) {
		this.quantidadeCupims = quantidadeCupims;
	}

	public Boolean getRealizaExpedicao() {
		return realizaExpedicao;
	}
	
	//teoricamente não haveria o setRealizaExpedição
	public void setRealizaExpedicao(Boolean realizaExpedicao) {
		this.realizaExpedicao = realizaExpedicao;		
	}
		
	public List<Aleluia> getAleluia() {
		return aleluia;
	}

	public void setAleluia(List<Aleluia> aleluia) {
		this.aleluia = aleluia;
	}

	public List<Cupims> getCupims() {
		return cupims;
	}

	public void setCupims(List<Cupims> cupims) {
		this.cupims = cupims;
	}

	public List<Ferrao> getFerrao() {		
		return ferrao;
	}

	public void setArmas(List<Ferrao> ferrao) {
		this.ferrao = ferrao;
	}
	
	public int getQuantidadeFerrao() {
		return quantidadeFerrao;
	}

	public void setQuantidadeFerrao(int quantidadeFerrao) {
		this.quantidadeFerrao = quantidadeFerrao;
	}

	//Operação confirmar expedição:
	public void confirmarExpedicao() {
		if(getQuantidadeCupims()<= getAleluia().get(0).getCapacidade()) {
			if(getQuantidadeFerrao()>=getQuantidadeCupims()) {
				if(getSonhosBons() > getSonhosRuins()) {
					System.out.println("\nExpedicao realizada com sucesso. Cada participante perdeu 10 de vida pelo desgaste da viagem\n");
					for(Cupims sel: getCupims()){
						sel.setVida(sel.getVida()-10);
						}
					realizaExpedicao = true;
				}else {
					System.out.println("Expedicao cancelada pois  não saiaram a tempo");		
				}	
				
			}else {
				System.out.println("Expedicao cancelada pois nao tem ferrao para todos");
			}
		}else {
			System.out.println("Expedicao cancelada pois não tem cupims com aleluia suficiente para viajar");
		}	
	}
}
