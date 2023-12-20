package br.edu.unifei.ecot12.projetofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	private static Scanner scan;

	public static void main(String[] args) {
		String testee;
		
//-------------------------------FERRAMENTA-------------------------------
		ArrayList<Classificacao> Classificacao = new ArrayList<Classificacao>();
		Classificacao f1 = new Classificacao();
		Classificacao f2 = new Classificacao();
		
		f1.setNome("Cupim");
		f1.setEhRei(false);
		Classificacao.add(f1);
		
		f2.setNome("Cupim Rei");
		f2.setEhRei(true);
		Classificacao.add(f2);
		
		System.out.println("\nClassificação:\n");
		
		for(Classificacao ferra:Classificacao) {
			System.out.println("  Nova Classificação:");
			System.out.println("    - Nome: "+ ferra.getNome() +"");
			System.out.println("    - rei:" + ferra.getEhRei() + "\n");
		}
		System.out.println("----------------------------------------------------");
		
//-------------------------------ARMAS-------------------------------
		ArrayList<Ferrao> ferrao = new ArrayList<Ferrao>();
		Ferrao ar1 = new Ferrao();
		Ferrao ar2 = new Ferrao();
		Ferrao ar3 = new Ferrao();
		
		ar1.setNome("ferrao marrom");
		ar1.setDano(35);
		ar1.setMaterial("quitina");
		ar1.setAlcance(20);
		ferrao.add(ar1);
		
		ar2.setNome("ferrao preto");
		ar2.setDano(2);
		ar2.setMaterial("Quitosana");
		ar2.setAlcance(12);
		ferrao.add(ar2);
		
		ar3.setNome("ferrao metalico");
		ar3.setDano(110);
		ar3.setMaterial("ferro");
		ar3.setAlcance(1);
		ferrao.add(ar3);
			
		System.out.println("\nFerrao:\n");
		
		for(Ferrao ar:ferrao) {
			System.out.println("  Novo Ferrao:");
			System.out.println("    - Nome: "+ ar.getNome() +"");
			System.out.println("    - Material: " + ar.getMaterial() + "");
			System.out.println("    - Dano: " + ar.getDano()+ "");
			System.out.println("    - Alcance: " + ar.getAlcance() + " metros\n");
		}
		System.out.println("----------------------------------------------------");
		
	//-------------------------------ORNAMENTOS-------------------------------
			ArrayList<Ornamento> ornamentos = new ArrayList<Ornamento>();
			Ornamento or1 = new Ornamento();
			Ornamento or2 = new Ornamento();
			Ornamento or3 = new Ornamento();
			
			or1.setTipo("aleluias");
			or1.setCor("amarelo marrom");
			or1.setLocal("Costas");
			ornamentos.add(or1);
			
			or2.setTipo("antena");
			or2.setCor("Marron");
			or2.setLocal("cabeça");
			ornamentos.add(or2);
			
			or3.setTipo("abdomen volumoso");
			or3.setCor("marron claro");
			or3.setLocal("torax");
			ornamentos.add(or3);
			
				
			System.out.println("\nORNAMENTOS:\n");
			
			for(Ornamento or:ornamentos) {
				System.out.println("  Novo Ornamento:");
				System.out.println("    - Nome: "+ or.getTipo() +" " + or.getCor());
				System.out.println("    - Local de uso: " + or.getLocal() + "\n");
			}
			System.out.println("----------------------------------------------------");
		
//-------------------------------CANOAS-------------------------------
		ArrayList<Aleluia> aleluia = new ArrayList<Aleluia>();
		Aleluia ca1 = new Aleluia();
		Aleluia ca2 = new Aleluia();

		ca1.setCapacidade(10);
		ca1.setDistanciaPercorridas(8);
		aleluia.add(ca1);
		
		ca2.setCapacidade(2);
		ca2.setDistanciaPercorridas(3);
		aleluia.add(ca2);
		
	
		
		System.out.println("\nALELUIA:\n");
		
		for(Aleluia ca:aleluia) {
			System.out.println("  Nova aleluia:");
			System.out.println("    - Quantidade: " + ca.getCapacidade()+ " cupims");
			System.out.println("    - distanciaPercorridas: " + ca.getMilhasPercorridas() + " distancia\n");
		}
		System.out.println("----------------------------------------------------");
		
	//-------------------------------Buscar alimento-------------------------------
			ArrayList<BuscarAlimento> pescas = new ArrayList<BuscarAlimento>();
			BuscarAlimento pes1 = new BuscarAlimento();
			BuscarAlimento pes2 = new BuscarAlimento();
			Alimento a2 = new Alimento();
			Alimento a3 = new Alimento();
			a2.setNome("Madeira");
			a3.setNome("plantas");
			
			
			pes1.setMetodo("PernasCurtas");
			pes1.setQuantidadeMordidas(8);
			pes1.setQuantidadeAlimento(2);
			pes1.getPeixes().add(a2);
			pes1.getPeixes().add(a2);
			pescas.add(pes1);
			
			pes2.setMetodo("PernasLargas");
			pes2.setQuantidadeMordidas(5);
			pes2.setQuantidadeAlimento(3);
			pes2.getPeixes().add(a3);
			pes2.getPeixes().add(a2);
			pes2.getPeixes().add(a3);
			pescas.add(pes2);
			
			
			System.out.println("\nALIMENTO:\n");
			
			for(BuscarAlimento pes:pescas) {
				System.out.println("  Nova Perna:");
				System.out.println("    - Metodo: " + pes.getMetodo()+ "");
				System.out.println("    - distancia pecorrida: " + pes.getQuantidadeMordidas()+ " distancia");
				System.out.println("    - Quantidade de alimento obtido: " + pes.getQuantidadeAlimento()+ " alimentos");
				System.out.println("    - Alimento Capturado: ");
				for(Alimento peixe:pes.getPeixes()) {
					System.out.println("      -  " + peixe.getNome());
				}
			}
			System.out.println("----------------------------------------------------");
			
		//-------------------------------ALIMENTO------------------------------------------------------------------------------------
		
		System.out.println("\n ALIMENTO:\n");
		ArrayList<Alimento> alimento = new ArrayList<Alimento>();
		
		Alimento a1 = new Alimento();
		
		a1.getPreparos().add(new Celulose());
		a1.getPreparos().add(new Organico());
		a1.getPreparos().add(new Fibras());
		
		a2.getPreparos().add(new Celulose());
		a2.getPreparos().add(new Organico());
		a2.getPreparos().add(new Fibras());
		
		
		a3.getPreparos().add(new Celulose());
		a3.getPreparos().add(new Organico());
		a3.getPreparos().add(new Fibras());
		
		
		a1.setNome("Celulose");
		a1.setEpoca("Abril");
		a1.setValidadeDias(2);
		a1.setValorNutritivo(4);
		alimento.add(a1);
		
		a2.setNome("Celulose");
		a2.setEpoca("Agosto");
		a2.setValidadeDias(1);
		a2.setValorNutritivo(6);
		alimento.add(a2);
		
		a3.setNome("Celulose");
		a3.setEpoca("Marco");
		a3.setValidadeDias(2);
		a3.setValorNutritivo(5);
		alimento.add(a3);
		
		for(Alimento a:alimento) {
			System.out.println(" *NOVO ALIMENTO:*\n");
			System.out.println("Nome: " + a.getNome());
			System.out.println("Epoca: " + a.getEpoca()+ "\n");
			
			System.out.println("Metodos de Preparo: ");
			for(Preparo p: a.getPreparos()) {
				System.out.println(" "+ p.getClass().getSimpleName() + ":\n  Valor Nutricional = " + p.getValorNutritivo()+"\n  Validade em dias = " + p.getValidadeDias()+"\n");
			}
			System.out.println("\nQual Metodo de preparo deseja utilizar?");
			scan = new Scanner(System.in);
			a.setPreparo(scan.nextLine());
			
			System.out.println("\n*** Atualizando Dados: ***\n");
			System.out.println("Nome: " + a.getNome());
			System.out.println("Epoca: " + a.getEpoca()+ "");
			System.out.println("Modo de preparo: " + a.getPreparo() + "");
			System.out.println("Valor Nutritivo: " + a.getValorNutritivo() + "");
			System.out.println("Validade em dias: " + a.getValidadeDias() +"\n");		
		}
		System.out.println("----------------------------------------------------\n");
		
//-------------------
		//--BEBIDAS---------------------------------------------------------------------
		ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
		Bebida be1 = new Bebida();
		
		be1.setNome("Cauim");
		be1.getIngredientes().add(a1);
		bebidas.add(be1);
		
		System.out.println("BEBIDAS:\n");
		
		for(Bebida beb:bebidas) {
			System.out.println("  Nova Bebida:");
			System.out.println("    - Nome: " + beb.getNome());
			System.out.println("    - Ingredientes: ");
			for(Alimento ing : beb.getIngredientes()) {
				System.out.println("      - " + ing.getNome());
			}
		}
		System.out.println("----------------------------------------------------");
		
		
		//--SELVAGENS---------------------------------------------------------------------
		
		ArrayList<Cupims> s = new ArrayList<Cupims>();
		Cupims s1 = new Cupims();
		Cupims s2 = new Cupims();
		Cupims s3 = new Cupims();
		Cupims s4 = new Cupims();
		Cupims s5 = new Cupims();
		Cupims s6 = new Cupims();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		
		s1.setNome("Kalotermitidae");
		s1.setFuncao("Chefe");
		s1.getOrnamentos().add(or1);
		s1.getOrnamentos().add(or1);
		s1.getOrnamentos().add(or1);
		s1.getOrnamentos().add(or2);
		
		s2.setNome("Rhinotermididae");
		s2.getOrnamentos().add(or1);
		s2.getOrnamentos().add(or2);
		
		s3.setNome("Termitidae");
		s3.setFuncao("Chefe");
		s3.getOrnamentos().add(or1);
		s3.getOrnamentos().add(or1);
		s3.getOrnamentos().add(or3);
		s3.getOrnamentos().add(or3);
		
		
		s4.setNome("Smilinguido");
		s4.getOrnamentos().add(or2);
		
		s5.setNome("Forfo");
		s5.getOrnamentos().add(or2);
		
		s6.setNome("Formisã");
		
		System.out.println("\nCUPIMS\n");
		
		for(Cupims selvagem:s) {
			System.out.println(selvagem.getFuncao() + " " + selvagem.getNome());
			System.out.println("Vida: " + s1.getVida());
			System.out.println("Quantidade de nomes: " + selvagem.getQuantidadeNomes());
			System.out.println("Numero de prisioneiros: " + selvagem.getNumeroPrisioneiros());
			System.out.println("Ornamentos: ");
			for(Ornamento or:selvagem.getOrnamentos()) {
				System.out.println("   -" + or.getTipo() + " " + or.getCor() + " --> " + or.getLocal());
			}
			System.out.println("\n");
		}
		System.out.println("----------------------------------------------------");

	//-------------------------------EXPEDIÇÕES-------------------------------
			ArrayList<Expedicao> expedicoes = new ArrayList<Expedicao>();
			Expedicao ex1 = new Expedicao();
			Expedicao ex2 = new Expedicao();
			Expedicao ex3 = new Expedicao();
			Expedicao ex4 = new Expedicao();

			ex1.getFerrao().add(ar1);
			ex1.getFerrao().add(ar1);
			ex1.getFerrao().add(ar1);
			ex1.getFerrao().add(ar3);
			ex1.setQuantidadeFerrao(4);
			ex1.getAleluia().add(ca2);
			ex1.getCupims().add(s1);
			ex1.getCupims().add(s2);
			ex1.getCupims().add(s3);
			ex1.setQuantidadeCupims(3);
			ex1.setSonhosBons(3);
			ex1.setSonhosRuins(0);
			expedicoes.add(ex1);
			
			ex2.getFerrao().add(ar1);
			ex2.getFerrao().add(ar1);
			ex2.setQuantidadeFerrao(2);
			ex2.getAleluia().add(ca1);
			ex2.getCupims().add(s1);
			ex2.getCupims().add(s2);
			ex2.getCupims().add(s3);
			ex2.setQuantidadeCupims(3);
			ex2.setSonhosBons(3);
			ex2.setSonhosRuins(0);
			expedicoes.add(ex2);
			
			ex3.getFerrao().add(ar1);
			ex3.getFerrao().add(ar1);
			ex3.getFerrao().add(ar3);
			ex3.setQuantidadeFerrao(3);
			ex3.getAleluia().add(ca1);
			ex3.getCupims().add(s1);
			ex3.getCupims().add(s2);
			ex3.getCupims().add(s3);
			ex3.setQuantidadeCupims(3);
			ex3.setSonhosBons(1);
			ex3.setSonhosRuins(2);
			expedicoes.add(ex3);
			
			ex4.getFerrao().add(ar1);
			ex4.getFerrao().add(ar1);
			ex4.getFerrao().add(ar3);
			ex4.setQuantidadeFerrao(3);
			ex4.getAleluia().add(ca1);
			ex4.getCupims().add(s1);
			ex4.getCupims().add(s2);
			ex4.getCupims().add(s3);
			ex4.setQuantidadeCupims(3);
			ex4.setSonhosBons(3);
			ex4.setSonhosRuins(0);
			expedicoes.add(ex4);
			
			
			System.out.println("\nEXPEDIÇÕES:\n");
			
			for(Expedicao ex:expedicoes) {
				System.out.println("  Nova Expedicao:");
				System.out.println("\n    - Quantidade de armas: " + ex.getQuantidadeFerrao());
				System.out.println("    - Armas:");
				for(Ferrao ar:ex.getFerrao()) {
					System.out.println("        - "+ ar.getNome());	
				}
				System.out.print("    - cupimns com aleluia: ");
				for(Aleluia can:ex.getAleluia()) {
					System.out.print(""+ can.getCapacidade()+" ");	
				}
				System.out.println("\n    - Quantidade de cupims ociosos: " + ex.getQuantidadeCupims());
				System.out.println("    - Cupims:");
				for(Cupims gue:ex.getCupims()) {
					System.out.println("        - "+ gue.getNome());	
				}
				System.out.println("    - Sairam a tempo: "+ ex.getSonhosBons());
				System.out.println("    - Não sairam a tempo: "+ ex.getSonhosRuins()+"\n");
				ex.confirmarExpedicao();
				System.out.println("\n"); 
			}
			System.out.println("----------------------------------------------------");
//----------------------------------------------------------COROA

		ArrayList<Coroa> coroa = new ArrayList<Coroa>();
		Coroa coroalavape = new Coroa();
		Coroa coroacabeçuda = new Coroa();
		Coroa coroaquenquem = new Coroa();
		
		coroa.add(coroacabeçuda);
		coroa.add(coroalavape);
		coroa.add(coroaquenquem);
		
		coroacabeçuda.setNome("Coroa Cabeçuda");		
		coroalavape.setNome("Coroa Lavape");
		coroaquenquem.setNome("Coroa Quenquem");
		
		System.out.println("\nCOROAS:\n");
		
		for(Coroa c:coroa) {
			System.out.println("Nome: " + c.getNome() + "");
		}	
		System.out.println("----------------------------------------------------");

//-----------------------------------------------------------NÃO SELVAGEM

		ArrayList<Formigas> ns = new ArrayList<Formigas>();
		Formigas ns1 = new Formigas();
		Formigas ns2 = new Formigas();
		Formigas ns3 = new Formigas();
		Formigas ns4 = new Formigas();
		Formigas ns5 = new Formigas();
		ns.add(ns1);
		ns.add(ns2);
		ns.add(ns3);
		ns.add(ns4);
		ns.add(ns5);
		
		ns1.setNome("Po");
		ns1.setRaca("lavape");
		ns1.setFuncao("soldado");
		ns1.setFiliacao(coroalavape);
		ns1.setAliadoCupimss(false);
		
		ns2.setNome("Scrat");
		ns2.setRaca("lavape");
		ns2.setFuncao("soldado");
		ns2.setFiliacao(coroalavape);
		ns2.setAliadoCupimss(false);
		
		ns3.setNome("Perry'");
		ns3.setRaca("lavape");
		ns3.setFuncao("operaria");
		ns3.setFiliacao(coroalavape);
		ns3.setAliadoCupimss(false);
		ns3.setEhPrisioneiro(true);
		
		ns4.setNome("Mordecai");
		ns4.setRaca("cabeçuda");
		ns4.setFuncao("operaria");
		ns4.setFiliacao(coroacabeçuda);
		
		ns5.setNome("Aladdin");
		ns5.setRaca("cabeçuda");
		ns5.setFuncao("soldado");
		ns5.setFiliacao(coroacabeçuda);
		
		System.out.println("\n Formigas\n");
		
		// colocar NaoSelvagens dentro do for para imprimir todos os indices da lista
				for(Formigas naoS: ns) {
					System.out.println(naoS.getFuncao() + " " + naoS.getNome());
					System.out.println("Raca: " + naoS.getRaca());
					System.out.println("Vida: " + naoS.getVida());
					System.out.println("Filiacao: " + naoS.getFiliacao().getNome());
					System.out.println("Eh aliado Cupimss: "+ naoS.getAliadoTCupimss());
					System.out.println("Eh prisioneiro: " + naoS.getEhPrisioneiro()+ "\n");
					// Colocar mais informações caso necessário					
				}
				System.out.println("----------------------------------------------------");

//-----------------------------------------------------------------------------------------Lutar
		
		ArrayList<Lutar> batalha = new ArrayList<Lutar>();
		Lutar batalha1 = new Lutar();
		Lutar batalha2 = new Lutar();
		Lutar batalha3 = new Lutar();
				
		s1.setLutar(batalha1);
		batalha1.setSelvagem(s1);
		batalha1.setNaoSelvagem(ns5);	
		batalha.add(batalha1);
		
		s3.setLutar(batalha2);
		batalha2.setSelvagem(s5);
		batalha2.setNaoSelvagem(ns1);
		batalha.add(batalha2);	
		
		s4.setLutar(batalha3);
		batalha3.setSelvagem(s4);
		batalha3.setNaoSelvagem(ns1);
		batalha.add(batalha3);	
		
		
		System.out.println("\n BATALHAS:\n");
		//for(Lutar b: batalha) {
			//batalha1
			System.out.println("BATALHA 1:");
			System.out.println("Selvagem: "+batalha1.getSelvagem().getNome()+" - Vida: ["+batalha1.getSelvagem().getVida()+"]");
			System.out.println("Nao Selvagem:"+batalha1.getNaoSelvagem().getNome()+" - Vida: ["+batalha1.getNaoSelvagem().getVida()+"]");
			
			System.out.println("Escolha uma acao: (capturar ou matar)");
			scan = new Scanner(System.in);
			testee = scan.nextLine();
			if(testee.equals("capturar")) {
				s1.captura();
			}else if(testee.equals("matar")) {
				s1.matar();
			}
			else {
				System.out.println("Opcao nao existente");
			}
			System.out.println("Selvagem: "+batalha1.getSelvagem().getNome()+" - Vida: ["+batalha1.getSelvagem().getVida()+"]" + " - Quantidade de Nomes:" + batalha1.getSelvagem().getQuantidadeNomes());
			System.out.println("Nao Selvagem:"+batalha1.getNaoSelvagem().getNome()+" - Vida: ["+batalha1.getNaoSelvagem().getVida()+"]" + " - Foi capturado: "+ batalha1.getNaoSelvagem().getEhPrisioneiro() + " - Foi devorado : " + batalha1.getNaoSelvagem().getFoiDevorado() + " \n");				

			
			//batalha2
			System.out.println("BATALHA 2:");
			System.out.println("Selvagem: "+batalha2.getSelvagem().getNome()+" - Vida: ["+batalha2.getSelvagem().getVida()+"]");
			System.out.println("Nao Selvagem:"+batalha2.getNaoSelvagem().getNome()+" - Vida: ["+batalha2.getNaoSelvagem().getVida()+"]");
			
			System.out.println("Escolha uma acao: (capturar ou matar)");
			scan = new Scanner(System.in);
			testee = scan.nextLine();
			if(testee.equals("capturar")) {
				s3.captura();
			}else if(testee.equals("matar")) {
				s3.matar();
			}
			else {
				System.out.println("Opcao nao existente");
			}
			System.out.println("Selvagem: "+batalha2.getSelvagem().getNome()+" - Vida: ["+batalha2.getSelvagem().getVida()+"]" + " - Quantidade de Nomes:" + batalha2.getSelvagem().getQuantidadeNomes());
			System.out.println("N�o Selvagem:"+batalha2.getNaoSelvagem().getNome()+" - Vida: ["+batalha2.getNaoSelvagem().getVida()+"]" + " - Foi capturado: "+ batalha2.getNaoSelvagem().getEhPrisioneiro() + " - Foi devorado : " + batalha2.getNaoSelvagem().getFoiDevorado() + " \n");				

			
			if((batalha2.getNaoSelvagem().getFoiDevorado() == false) && ((batalha2.getNaoSelvagem().getEhPrisioneiro() == false))){
				//batalha3
				System.out.println("BATALHA 3:");
				System.out.println("Selvagem: "+batalha3.getSelvagem().getNome()+" - Vida: ["+batalha3.getSelvagem().getVida()+"]");
				System.out.println("Nao Selvagem:"+batalha3.getNaoSelvagem().getNome()+" - Vida: ["+batalha3.getNaoSelvagem().getVida()+"]");
				
				System.out.println("Escolha uma acao: (capturar ou matar)");
				scan = new Scanner(System.in);
				testee = scan.nextLine();
				if(testee.equals("capturar")) {
					s4.captura();
				}else if(testee.equals("matar")) {
					s4.matar();
				}
				else {
					System.out.println("Opcao nao existente");
				}
				System.out.println("Selvagem: "+batalha3.getSelvagem().getNome()+" - Vida: ["+batalha3.getSelvagem().getVida()+"]" + " - Quantidade de Nomes:" + batalha3.getSelvagem().getQuantidadeNomes());
				System.out.println("N�o Selvagem:"+batalha3.getNaoSelvagem().getNome()+" - Vida: ["+batalha3.getNaoSelvagem().getVida()+"]" + " - Foi capturado: "+ batalha3.getNaoSelvagem().getEhPrisioneiro() + " - Foi devorado : " + batalha3.getNaoSelvagem().getFoiDevorado() + " \n");				
			}
			
//--------------------------------------------------------------------CABANAS
		System.out.println("-------------------------------------------------------------------------------------\n");	
		
		ArrayList<Cupinzeiro> cab = new ArrayList<Cupinzeiro>();
		Cupinzeiro cab1 = new Cupinzeiro();
		Cupinzeiro cab2 = new Cupinzeiro();
		Cupinzeiro cab3 = new Cupinzeiro();
		cab.add(cab1);
		cab.add(cab2);
		cab.add(cab3);
		
		cab1.setChefe(s1);
		cab1.getMoradores().add(s1);
		cab1.getMoradores().add(s2);
		cab1.setTamanho(4);
		
		cab2.setChefe(s3);
		cab2.getMoradores().add(s3);
		cab2.getMoradores().add(s4);
		cab2.getMoradores().add(s5);
		cab2.setTamanho(8);
		
		cab3.setChefe(s6);
		cab3.getMoradores().add(s6);
		cab3.setTamanho(3);
		
		System.out.println("\n  Cupinzeiro\n");
		
		for(Cupinzeiro cabana:cab) {
			System.out.println("Novo cupinzeiro:");
			System.out.println("  Tamanho do cupinzeiro: "+ cabana.getTamanho()+"");
			System.out.println("  Chefe: " + cabana.getChefe().getNome()+ "");
			System.out.println("  Moradores:");
			for(Cupims morador: cabana.getMoradores()){
				System.out.println("    - " + morador.getNome());
			}
			System.out.println("\n");
		}

//-----------------------------------------------------------------ALDEIAS E TRIBOS

		ArrayList<Tribo> tribos = new ArrayList<Tribo>();
		Tribo t1 = new Tribo();
		Tribo t2 = new Tribo();
		
		ArrayList<Aldeia> aldeia = new ArrayList<Aldeia>();
		Aldeia al1 = new Aldeia();
		Aldeia al2 = new Aldeia();
		Aldeia al3 = new Aldeia();
		
		t1.setNome("Tupinamba");
		t1.setCoroaAliada(coroaquenquem);
		t1.getInimigos().add(t2);
		t1.getAldeias().add(al1);
		t1.getAldeias().add(al2);
		t1.setNumeroAldeias(2);
		t1.setNumeroMembros(5);
		tribos.add(t1);
		
		t2.setNome("Tupiniquim");
		t2.setCoroaAliada(coroalavape);
		t2.getInimigos().add(t1);
		t2.getAldeias().add(al3);
		t2.setNumeroAldeias(1);
		t2.setNumeroMembros(1);
		tribos.add(t2);
		

		al1.setLocalizacao("Ubatuba");
		al1.getCabanas().add(cab1);
		al1.setNumeroMembros(2);
		al1.setTribo(t1);
		
		aldeia.add(al1);
		
		al2.setLocalizacao("Arira");
		al2.getCabanas().add(cab2);
		al2.setNumeroMembros(3);
		al2.setTribo(t1);
		aldeia.add(al2);
		
		al3.setLocalizacao("Cotia");
		al3.getCabanas().add(cab3);
		al3.setNumeroMembros(1);
		al3.setTribo(t2);
		aldeia.add(al3);
		
		
		
	System.out.println("-------------------------------------------------------------------------------------\n");
	System.out.println("ALDEIAS: \n");
	
	for(Aldeia al:aldeia) {
		System.out.println("\nNOVA ALDEIA: \n");
		System.out.println(" - Nome: " + al.getLocalizacao() + "");
		System.out.println(" - Tribo: " + al.getTribo().getNome() + "");
		System.out.println(" - Numero de Membros: " + al.getNumeroMembros() + "");
		System.out.println(" - Membros: ");
		for(Cupinzeiro caba:al.getCabanas()) {
			for(Cupims morador:caba.getMoradores()) {
				System.out.println("      - "+ morador.getNome());
			}
		}
		
	
	}		
	System.out.println("-------------------------------------------------------------------------------------\n");
	
		
	System.out.println("TRIBOS: \n");
		
		for(Tribo tr:tribos) {
			System.out.println("\nNOVA TRIBO: \n");
			System.out.println(" - Nome: " + tr.getNome() + "");
			System.out.println(" - Coroa Aliada: " + tr.getCoroaAliada().getNome() + "");
			System.out.println(" - Aldeias: " +"");
			for(Aldeia al:tr.getAldeias()) {
				System.out.println("    - " + al.getLocalizacao());
			}
			System.out.println(" - Numero de Membros: " + tr.getNumeroMembros() + "");
			System.out.println(" - Membros: ");
			for(Aldeia al:tr.getAldeias()) {
				for(Cupinzeiro caba:al.getCabanas()) {
					for(Cupims morador:caba.getMoradores()) {
						System.out.println("      - "+ morador.getNome());
					}
				}				
			}
			System.out.println(" - Tribos inimigas: ");
			for(Tribo t: tr.getInimigos()) {
				System.out.println("      - "+ t.getNome());
				
			}
			
		}
	
//-----------------------------------------------------------------VILAS

		ArrayList<Vila> vila = new ArrayList<Vila>();
		Vila vila1 = new Vila();
		Vila vila2 = new Vila();

		vila1.setNome("Sao Vicente");
		vila1.setComando(coroalavape);
		vila1.getHabitantes().add(ns1);
		vila1.getHabitantes().add(ns2);
		vila1.getHabitantes().add(ns3);
		vila1.setNumeroHabitantes(3);
		vila.add(vila1);
			
		vila2.setNome("Enguaguacu");
		vila2.setComando(coroacabeçuda);
		vila2.getHabitantes().add(ns4);
		vila2.getHabitantes().add(ns5);
		vila2.setNumeroHabitantes(2);
		vila.add(vila2);
				
		System.out.println("-------------------------------------------------------------------------------------\n");
		System.out.println("VILAS: \n");
		
		for(Vila v:vila) {
			System.out.println("\nNOVA VILA: \n");
			System.out.println(" - Nome: " + v.getNome() + "");
			System.out.println(" - Comando: " + v.getComando().getNome() + "");
			System.out.println(" - Numero de Habitantes: " + v.getNumeroHabitantes() + "");
			System.out.println(" - Habitantes: ");
			for(Formigas vi: v.getHabitantes()) {
				System.out.println("    - "+ vi.getNome()+"");
			}
		}		
		System.out.println("-------------------------------------------------------------------------------------\n");
		
//------------------------------------------------------------------------
		
//----------------------------- ABATE -----------------------------------------------------------------------
		
		Ritual ritual1 = new Ritual();
		System.out.println("\n\n  RITUAL DE ABATE  \n\n");
		ritual1.getParticipantes().add(s1);
		ritual1.getParticipantes().add(s2);
		ritual1.getParticipantes().add(s3);
		
		s1.setAlimento(a1);
		s2.setAlimento(a2);
		s3.setAlimento(a3);
		s1.setFerramenta(f2);
		s2.setFerramenta(f1);
		s3.setFerramenta(f2);
		
		System.out.println("Escolha um prisioneiro para o abate: \n");
		scan = new Scanner(System.in); 
		testee = scan.nextLine();
		for(Formigas naoS: ns) {
			if(naoS.getNome().equals(testee)) {
			ritual1.setPrisioneiro(naoS);
			}
		}
			
		Classificacao corda = new Classificacao();
		corda.setNome("corda");
		
		s1.setFerramenta(corda);
		
		System.out.println("Participantes: ");
		for(Cupims participante:ritual1.getParticipantes()){
			System.out.println(" - "+ participante.getNome());
		}
		

		System.out.println("\n**EXECUTANDO OS PROCEDIMENTOS**\n");
		
		ritual1.alimentarPrisioneiro();
		ritual1.entreterPrisioneiro();
		ritual1.matar();
		
		System.out.println("\nCondicoes do ritual:\n");
		System.out.println("Alimentou prisioneiro:" + ritual1.getAlimentouPrisioneiro());
		System.out.println("Entreteu prisioneiro:" + ritual1.getEntreteuPrisioneiro());
		System.out.println("Termitidae se tornou rei \n Rhinotermididae se tornou rei \n Kalotermitidae se tornou rei");
	}

}





