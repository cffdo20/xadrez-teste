package br.com.afsj.model;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import br.com.afsj.control.Xadrez;
import br.com.afsj.view.IBispo;
import br.com.afsj.view.ICavalo;
import br.com.afsj.view.IPeao;
import br.com.afsj.view.IPeca;
import br.com.afsj.view.IRainha;
import br.com.afsj.view.IRei;
import br.com.afsj.view.ITabuleiro;
import br.com.afsj.view.ITorre;

public class Tabuleiro {

	protected static JFrame TELA;
	
	public static ArrayPecas listaBrancas;
	public static ArrayPecas listaPretas;

	protected static int corJogadorAtual;
	protected static Peca pecaMarcada;
	protected static IPeca iPecaMarcada;
	
	protected static ITabuleiro iTabuleiro;

/*
	protected static Torre torreBranca = new Torre();
	protected static ITorre iTorreBranca = new ITorre(torreBranca);
	
	protected static Torre torrePreta = new Torre();
	protected static ITorre iTorrePreta = new ITorre(torrePreta);

	protected static Rei reiBranco = new Rei();
	protected static IRei iReiBranco = new IRei(reiBranco);
	
	protected static Rei reiPreto = new Rei();
	protected static IRei iReiPreto = new IRei(reiPreto);

	protected static Cavalo cavaloPreto1 = new Cavalo();
	protected static ICavalo iCavaloPreto1 = new ICavalo(cavaloPreto1);

	protected static Cavalo cavaloBranco1 = new Cavalo();
	protected static ICavalo iCavaloBranco1 = new ICavalo(cavaloBranco1);
	
	
	protected static Bispo bispoBranco = new Bispo();
	protected static IBispo iBispoBranco = new IBispo(bispoBranco);
	
	protected static Bispo bispoPreto = new Bispo();
	protected static IBispo iBispoPreto = new IBispo(bispoPreto);

	protected static Rainha rainhaBranca = new Rainha();
	protected static IRainha iRainhaBranca = new IRainha(rainhaBranca);
	
	protected static Rainha rainhaPreta = new Rainha();
	protected static IRainha iRainhaPreta = new IRainha(rainhaPreta);
*/	
//	public static Peao peaoBranco1 = new Peao();
//	public static IPeao iPeaoBranco1= new IPeao(peaoBranco1);
//
//	public static Peao peaoPreto1 = new Peao();
//	public static IPeao iPeaoPreto1 = new IPeao(peaoPreto1);
	
	// Declaração para 8 Peões Brancos
		public static Peao peaoBranco1 = new Peao();
		public static IPeao iPeaoBranco1 = new IPeao(peaoBranco1);

		public static Peao peaoBranco2 = new Peao();
		public static IPeao iPeaoBranco2 = new IPeao(peaoBranco2);

		public static Peao peaoBranco3 = new Peao();
		public static IPeao iPeaoBranco3 = new IPeao(peaoBranco3);

		public static Peao peaoBranco4 = new Peao();
		public static IPeao iPeaoBranco4 = new IPeao(peaoBranco4);

//		public static Peao peaoBranco5 = new Peao();
//		public static IPeao iPeaoBranco5 = new IPeao(peaoBranco5);

		public static Peao peaoBranco6 = new Peao();
		public static IPeao iPeaoBranco6 = new IPeao(peaoBranco6);

//		public static Peao peaoBranco7 = new Peao();
//		public static IPeao iPeaoBranco7 = new IPeao(peaoBranco7);
//
//		public static Peao peaoBranco8 = new Peao();
//		public static IPeao iPeaoBranco8 = new IPeao(peaoBranco8);

		// Declaração para 8 Peões Pretos
		public static Peao peaoPreto1 = new Peao();
		public static IPeao iPeaoPreto1 = new IPeao(peaoPreto1);

		public static Peao peaoPreto2 = new Peao();
		public static IPeao iPeaoPreto2 = new IPeao(peaoPreto2);

		public static Peao peaoPreto3 = new Peao();
		public static IPeao iPeaoPreto3 = new IPeao(peaoPreto3);

		public static Peao peaoPreto4 = new Peao();
		public static IPeao iPeaoPreto4 = new IPeao(peaoPreto4);

//		public static Peao peaoPreto5 = new Peao();
//		public static IPeao iPeaoPreto5 = new IPeao(peaoPreto5);

		public static Peao peaoPreto6 = new Peao();
		public static IPeao iPeaoPreto6 = new IPeao(peaoPreto6);

//		public static Peao peaoPreto7 = new Peao();
//		public static IPeao iPeaoPreto7 = new IPeao(peaoPreto7);
//
//		public static Peao peaoPreto8 = new Peao();
//		public static IPeao iPeaoPreto8 = new IPeao(peaoPreto8);
	
//	public static Cavalo cavaloPreto1;
//	public static ICavalo iCavaloPreto1;
//
//	public static Cavalo cavaloBranco1;
//	public static ICavalo iCavaloBranco1;

	public void iniciar(Tradutor t) {

		
		listaBrancas = new ArrayPecas();
		listaPretas = new ArrayPecas();

		corJogadorAtual = Xadrez.corBRANCA;
		pecaMarcada = null;
		iPecaMarcada = null;
		ITabuleiro iTabuleiro = new ITabuleiro();

		TELA = new JFrame(t.traduzir("Xadrez"));
/*
		//Torres
		
		torreBranca.setCor(Xadrez.corBRANCA);
		torreBranca.mover(0, 7);
		iTorreBranca.setIconeBranco(new ImageIcon("imagens/Torre-Brancas-Branco.png"));
		iTorreBranca.setIconeMarrom(new ImageIcon("imagens/Torre-Brancas-Marrom.png"));
		iTorreBranca.mover(0, 7);
		TELA.getContentPane().add(iTorreBranca.getImagem());
		listaBrancas.add(torreBranca);

		torrePreta.setCor(Xadrez.corPRETA);
		torrePreta.mover(0, 0);
		iTorrePreta.setIconeBranco(new ImageIcon("imagens/Torre-Pretas-Branco.png"));
		iTorrePreta.setIconeMarrom(new ImageIcon("imagens/Torre-Pretas-Marrom.png"));
		iTorrePreta.mover(0, 0);
		TELA.getContentPane().add(iTorrePreta.getImagem());
		listaPretas.add(torrePreta);



		
		// Reis

		reiBranco.setCor(Xadrez.corBRANCA);
		reiBranco.mover(4, 7);
		iReiBranco.setIconeBranco(new ImageIcon("imagens/Rei-Brancas-Branco.png"));
		iReiBranco.setIconeMarrom(new ImageIcon("imagens/Rei-Brancas-Marrom.png"));
		iReiBranco.mover(4, 7);
		TELA.getContentPane().add(iReiBranco.getImagem());
		listaBrancas.add(reiBranco);

		reiPreto.setCor(Xadrez.corPRETA);
		reiPreto.mover(4, 0);
		iReiPreto.setIconeBranco(new ImageIcon("imagens/Rei-Pretas-Branco.png"));
		iReiPreto.setIconeMarrom(new ImageIcon("imagens/Rei-Pretas-Marrom.png"));
		iReiPreto.mover(4, 0);
		TELA.getContentPane().add(iReiPreto.getImagem());
		listaPretas.add(reiPreto);


		// Bispos

		bispoBranco.setCor(Xadrez.corBRANCA);
		bispoBranco.mover(2, 7);
		iBispoBranco.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
		iBispoBranco.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
		iBispoBranco.mover(2, 7);
		TELA.getContentPane().add(iBispoBranco.getImagem());
		listaBrancas.add(bispoBranco);

		bispoPreto.setCor(Xadrez.corPRETA);
		bispoPreto.mover(2, 0);
		iBispoPreto.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
		iBispoPreto.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
		iBispoPreto.mover(2, 0);
		TELA.getContentPane().add(iBispoPreto.getImagem());
		listaPretas.add(bispoPreto);
		
 		// Rainhas

		rainhaBranca.setCor(Xadrez.corBRANCA);
		rainhaBranca.mover(3, 4);
		iRainhaBranca.setIconeBranco(new ImageIcon("imagens/Rainha-Brancas-Branco.png"));
		iRainhaBranca.setIconeMarrom(new ImageIcon("imagens/Rainha-Brancas-Marrom.png"));
		iRainhaBranca.mover(3, 4);
		TELA.getContentPane().add(iRainhaBranca.getImagem());
		listaBrancas.add(rainhaBranca);

		rainhaPreta.setCor(Xadrez.corPRETA);
		rainhaPreta.mover(6, 3);
		iRainhaPreta.setIconeBranco(new ImageIcon("imagens/Rainha-Pretas-Branco.png"));
		iRainhaPreta.setIconeMarrom(new ImageIcon("imagens/Rainha-Pretas-Marrom.png"));
		iRainhaPreta.mover(6, 3);
		TELA.getContentPane().add(iRainhaPreta.getImagem());
		listaPretas.add(rainhaPreta);

*/		
		// Pe�es

		

		peaoBranco1.setCor(Xadrez.corBRANCA);
		peaoBranco1.mover(0, 6);
		iPeaoBranco1.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco1.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco1.mover(0, 6);
		TELA.getContentPane().add(iPeaoBranco1.getImagem());
		listaBrancas.add(peaoBranco1);
		
		peaoBranco2.setCor(Xadrez.corBRANCA);
		peaoBranco2.mover(1, 6);
		iPeaoBranco2.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco2.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco2.mover(1, 6);
		TELA.getContentPane().add(iPeaoBranco2.getImagem());
		listaBrancas.add(peaoBranco2);
		
		peaoBranco3.setCor(Xadrez.corBRANCA);
		peaoBranco3.mover(2, 6);
		iPeaoBranco3.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco3.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco3.mover(2, 6);
		TELA.getContentPane().add(iPeaoBranco3.getImagem());
		listaBrancas.add(peaoBranco3);
		
		
		peaoBranco4.setCor(Xadrez.corBRANCA);
		peaoBranco4.mover(3, 6);
		iPeaoBranco4.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco4.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco4.mover(3, 6);
		TELA.getContentPane().add(iPeaoBranco4.getImagem());
		listaBrancas.add(peaoBranco4);
		
		peaoBranco6.setCor(Xadrez.corBRANCA);
		peaoBranco6.mover(5, 6);
		iPeaoBranco6.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco6.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco6.mover(5, 6);
		TELA.getContentPane().add(iPeaoBranco6.getImagem());
		listaBrancas.add(peaoBranco6);

		peaoPreto1.setCor(Xadrez.corPRETA);
		peaoPreto1.mover(0, 1);
		iPeaoPreto1.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto1.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto1.mover(0, 1);
		TELA.getContentPane().add(iPeaoPreto1.getImagem());
		listaPretas.add(peaoPreto1);

		peaoPreto2.setCor(Xadrez.corPRETA);
		peaoPreto2.mover(1, 1);
		iPeaoPreto2.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto2.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto2.mover(1, 1);
		TELA.getContentPane().add(iPeaoPreto2.getImagem());
		listaPretas.add(peaoPreto2);

		peaoPreto3.setCor(Xadrez.corPRETA);
		peaoPreto3.mover(2, 1);
		iPeaoPreto3.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto3.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto3.mover(2, 1);
		TELA.getContentPane().add(iPeaoPreto3.getImagem());
		listaPretas.add(peaoPreto3);

		peaoPreto4.setCor(Xadrez.corPRETA);
		peaoPreto4.mover(3, 1);
		iPeaoPreto4.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto4.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto4.mover(3, 1);
		TELA.getContentPane().add(iPeaoPreto4.getImagem());
		listaPretas.add(peaoPreto4);

		peaoPreto6.setCor(Xadrez.corPRETA);
		peaoPreto6.mover(5, 1);
		iPeaoPreto6.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto6.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto6.mover(5, 1);
		TELA.getContentPane().add(iPeaoPreto6.getImagem());
		listaPretas.add(peaoPreto6);

		// Cavalos
//		cavaloPreto1 = new Cavalo();
//		iCavaloPreto1 = new ICavalo(cavaloPreto1);
//
//		cavaloBranco1 = new Cavalo();
//		iCavaloBranco1 = new ICavalo(cavaloBranco1);
//		
//		cavaloBranco1.setCor(Xadrez.corBRANCA);
//		cavaloBranco1.mover(2, 5);
//		iCavaloBranco1.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
//		iCavaloBranco1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
//		iCavaloBranco1.mover(2, 5);
//		TELA.getContentPane().add(iCavaloBranco1.getImagem());
//		listaBrancas.add(cavaloBranco1);
//
//		cavaloPreto1.setCor(Xadrez.corPRETA);
//		cavaloPreto1.mover(4, 1);
//		iCavaloPreto1.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
//		iCavaloPreto1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
//		iCavaloPreto1.mover(4, 1);
//		TELA.getContentPane().add(iCavaloPreto1.getImagem());
//		listaPretas.add(cavaloPreto1);

		
		TELA.getContentPane().add(iTabuleiro.getImagem());
		TELA.setSize(400, 400);
		TELA.setVisible(true);
		TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void avaliarEventoPeca(Peca p, IPeca ip) {
		if (p.getCor() == corJogadorAtual) 
			marcarPeca(p, ip);
		else if (pecaMarcada != null)
			capturarPeca(p, ip);		
	}
	
	public static void avaliarEventoTabuleiro(int x, int y) {
		if ( (pecaMarcada != null) && (x >= 0) && (x <= 7) && (y >=0) && (y <= 7) ) {
			moverPecaMarcada(x, y);
		}
	}

	public static void marcarPeca(Peca p, IPeca ip) {
		if (iPecaMarcada != null)
			iPecaMarcada.desmarcar();
		pecaMarcada = p;
		iPecaMarcada = ip;
		iPecaMarcada.marcar();
	}

	public static void capturarPeca(Peca p, IPeca ip) {
		if (pecaMarcada.capturar(p.getPosX(), p.getPosY())) {
			ip.remover();
			TELA.getContentPane().remove(ip.getImagem());
			iPecaMarcada.desmarcar();
			iPecaMarcada.mover(p.getPosX(), p.getPosY());
			p.remover();
			pecaMarcada = null;
			iPecaMarcada = null;
			if (corJogadorAtual == Xadrez.corBRANCA)
				corJogadorAtual = Xadrez.corPRETA;
			else
				corJogadorAtual = Xadrez.corBRANCA;			
		}
	}
	
	public static void moverPecaMarcada(int x, int y) {
		if (pecaMarcada.mover(x, y)) {
			iPecaMarcada.desmarcar();
			iPecaMarcada.mover(x, y);
			pecaMarcada = null;
			iPecaMarcada = null;
			if (corJogadorAtual == Xadrez.corBRANCA)
				corJogadorAtual = Xadrez.corPRETA;
			else
				corJogadorAtual = Xadrez.corBRANCA;
		}
	}
}
