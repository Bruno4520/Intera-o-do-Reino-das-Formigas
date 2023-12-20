package br.edu.unifei.ecot12.projetofinal;

import java.util.Random;

public class Lutar implements MediadorLutar {

	private Cupims selvagem;
	private Formigas naoSelvagem;
	
	//--------------------------------------------------------Gets and Sets
	public Cupims getSelvagem() {
		return selvagem;
	}

	public void setSelvagem(Cupims selvagem) {
		this.selvagem = selvagem;
	}

	public Formigas getNaoSelvagem() {
		return naoSelvagem;
	}

	public void setNaoSelvagem(Formigas naoSelvagem) {
		this.naoSelvagem = naoSelvagem;
	}

	//Operação matar:
	public void matar() {
		if(naoSelvagem.getAliadoTCupimss() == false) {
			if(naoSelvagem.getVida() <=25) {
				naoSelvagem.setMuitoFerido(true);
			}
			Random descontaVida = new Random();
			selvagem.setVida(selvagem.getVida() - descontaVida.nextInt(selvagem.getVida()-5));
			naoSelvagem.setVida(naoSelvagem.getVida() - descontaVida.nextInt(naoSelvagem.getVida()));
			if(selvagem.getVida()<naoSelvagem.getVida()) {
				System.out.println("O " + naoSelvagem.getNome()+ " ganhou a luta e nao foi morto");
			}else {
				selvagem.setQuantidadeNomes(selvagem.getQuantidadeNomes()+1);
				naoSelvagem.setFoiDevorado(true);
				naoSelvagem.setEhPrisioneiro(false);
				naoSelvagem.setVida(0);
				System.out.println("\n O selvagem devorou o seu inimigo\n");
			}
		}
		else {
			System.out.println("\nNada ocorreu pois ambos são aliados\n");
		}

	}
	
	//Operação capturar:
	public void capturar() {
		if(naoSelvagem.getAliadoTCupimss() == false) {
			if(naoSelvagem.getVida() <=25) {
				naoSelvagem.setMuitoFerido(true);
			}
				Random descontaVida = new Random();
				selvagem.setVida(selvagem.getVida() - descontaVida.nextInt(selvagem.getVida()-5));
				naoSelvagem.setVida(naoSelvagem.getVida() - descontaVida.nextInt(naoSelvagem.getVida()));
				if(selvagem.getVida()<naoSelvagem.getVida()) {
					System.out.println("O " + naoSelvagem.getNome()+ " ganhou a luta e nao foi capturado");
				}
				else {
					selvagem.setNumeroPrisioneiros(selvagem.getNumeroPrisioneiros()+1);
					naoSelvagem.setEhPrisioneiro(true);
					System.out.println("\n O "+selvagem.getNome()+" capturou o seu inimigo\n");	
				}
			
		} else {
			System.out.println("\nNada ocorreu pois ambos sao aliados\n");	
		}
	}
	
}
