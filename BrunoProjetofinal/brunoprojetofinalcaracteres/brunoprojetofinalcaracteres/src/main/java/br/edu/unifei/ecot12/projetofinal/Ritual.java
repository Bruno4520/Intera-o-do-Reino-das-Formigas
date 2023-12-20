package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Ritual {
	
	private Boolean alimentouPrisioneiro = false;
	private Boolean entreteuPrisioneiro = false;
	private int quantidadeBebida = 0; 
	private	int quatidadeSelvagens = 0;
	private Boolean enfeitouIbiraPema = false;
	private Boolean fezCorda = false;
	private Boolean pendurouIbiraPema = false;
	private Boolean acendeuFogueira = false;
	
	private List<Cupims> participantes = new ArrayList <Cupims>();
	private Formigas prisioneiro;
	private List<Bebida> copos = new ArrayList <Bebida>();
	private Ferrao ibiraPema;
	private Classificacao corda;
	
	public Boolean getAlimentouPrisioneiro() {
		return alimentouPrisioneiro;
	}

	public Boolean getEntreteuPrisioneiro() {
		return entreteuPrisioneiro;
	}

	public int getQuantidadeBebida() {
		return quantidadeBebida;
	}

	public void setQuantidadeBebida(int quantidadeBebida) {
		this.quantidadeBebida = quantidadeBebida;
	}

	public int getQuatidadeSelvagens() {
		return quatidadeSelvagens;
	}

	public void setQuatidadeSelvagens(int quatidadeSelvagens) {
		this.quatidadeSelvagens = quatidadeSelvagens;
	}

	public Boolean getEnfeitouIbiraPema() {
		return enfeitouIbiraPema;
	}

	public Boolean getFezCorda() {
		return fezCorda;
	}

	public void setFezCorda(Boolean fezCorda) {
		this.fezCorda = fezCorda;
	}

	public Boolean getPendurouIbiraPema() {
		return pendurouIbiraPema;
	}

	public Boolean getAcendeuFogueira() {
		return acendeuFogueira;
	}
	
	public List<Cupims> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Cupims> participantes) {
		this.participantes = participantes;	
	}

	public Formigas getPrisioneiro() {
		return prisioneiro;
	}

	public void setPrisioneiro(Formigas prisioneiro) {
		if(prisioneiro.getEhPrisioneiro() == true) {
			this.prisioneiro = prisioneiro;	
		}
		else {
			System.out.println("\nERRO - O Nao Selvagem escolhido nao eh prisioneiro\n");
		}
	}

	public List<Bebida> getCopos() {
		return copos;
	}

	public void setCopos(List<Bebida> copos) {
		this.copos = copos;
	}

	public Ferrao getIbiraPema() {
		return ibiraPema;
	}

	public void setIbiraPema(Ferrao ibiraPema) {
		this.ibiraPema = ibiraPema;
	}

	public Classificacao getCorda() {
		return corda;
	}

	public void setCorda(Classificacao corda) {
		this.corda = corda;
	}

	public void alimentarPrisioneiro() {
		boolean xx = false;
		
		for(Cupims s: getParticipantes()) {
			if(!s.getAlimento().equals(null)) {
				xx = true;
				System.out.println(""+ s.getNome() + " tem alimento: " + s.getAlimento().getNome() + "");
			}
			else {
				System.out.println("\n"+ s.getNome() + " nao tem alimento \n");
			}
		}
		if(xx == true) {
			prisioneiro.setVida(prisioneiro.getVida()+10);
			alimentouPrisioneiro =true;
			System.out.println("\n * O prisioneiro foi alimentado. *\n");
		}
		else {
			System.out.println("\nPrisioneiro nao foi alimentado pois ninguem tinha comida para lhe dar\n");
		}
	}
	
	public void entreterPrisioneiro() {
		if(getAlimentouPrisioneiro()== true) {
			entreteuPrisioneiro = true;	
			System.out.println("\n * O prisioneiro foi entretido. *\n");
		}else {
			System.out.println("\nPrisioneiro nao foi entretido pois nao foi alimentado\n");
		}
	}
	
	public void enfeitarIbiraPema() {
		if(getEntreteuPrisioneiro()== true) {
			enfeitouIbiraPema = true;
			System.out.println("\n * O Ibira Pema foi enfeitado * \n");
		}else {
			System.out.println("\nIbira Pema nao foi enfeitado pois prisioneiro nao foi entretido\n");
		}
	}
	
	public void pendurarIbiraPema() {
		if(getEnfeitouIbiraPema()== true) {
			pendurouIbiraPema = true;	
			System.out.println("\n * O Ibira Pema foi pendurado e esta pronto para ser contemplado * \n");
		}else {
			System.out.println("\nIbira Pema nao foi pendurado pois nao foi enfeitado\n");
		}
	}
	
	public void amarrarPrisioneiro() {
		if(getEntreteuPrisioneiro()== true) {
			for(Cupims sel: getParticipantes() ) {
				if(sel.getFerramenta().getNome().equals("Corda")) {
					fezCorda = true;
					System.out.println(sel.getNome()+ " tinha uma corda");
					break;
				}
			}
			if(fezCorda == true) {
				System.out.println("\n *" + getPrisioneiro().getNome() + " foi amarrado *");
			}else {
				System.out.println("\n O prisioneiro nao sera amarrado pois nao ha corda\n");
			}
		}else {
			System.out.println("\nO prisioneiro nao sera amarrado pois nao foi entretido\n");
		}
	}

	public void acenderFogueira() {
		if(getFezCorda()==true) {
			if(getPendurouIbiraPema()==true) {
				System.out.println(" * A fogueira foi acesa *");
				acendeuFogueira = true;
			}else {
				System.out.println("\nFogueira nao foi acesa pois o Ibira Pema ainda nao foi pendurado para contemplacao\n");
			}
			
		}else {
			System.out.println("\nFogueira nao foi acesa pois o prisioneiro ainda estao solto\n");
		}
	}
	
	public void matar() {
			prisioneiro.setFoiDevorado(true);
			prisioneiro.setEhPrisioneiro(false);			
		System.out.println("\n O prisioneiro foi devorado por todos presentes.");
	}
	
}
