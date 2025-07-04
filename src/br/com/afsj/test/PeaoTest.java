package br.com.afsj.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.afsj.model.Peao;
import br.com.afsj.model.Tabuleiro;
import br.com.afsj.model.TradutorEspanhol;
import br.com.afsj.view.IPeao;

public class PeaoTest {

	//TADSXD-3
	@Test
	@DisplayName("Movimento peao branco uma casa para frente")
	void movimentoNormalPeao() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());

		//Pe�as no tabuleiro
		Peao pb = Tabuleiro.peaoBranco1;
		IPeao ipb = Tabuleiro.iPeaoBranco1;
		
		Peao pp = Tabuleiro.peaoPreto1;
		IPeao ipp = Tabuleiro.iPeaoPreto1;

		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(4, 5);
		assertAll("Mover Pe�o branco uma casa",
				() -> assertEquals(4, pb.getPosX()),
				() -> assertEquals(5, pb.getPosY())
				);
		
		
		Tabuleiro.avaliarEventoPeca(pp, ipp);
		Tabuleiro.avaliarEventoTabuleiro(3, 2);
		assertAll("Mover Pe�o preto uma casa",
				() -> assertEquals(3, pp.getPosX()),
				() -> assertEquals(2, pp.getPosY())
				);
		
	}
	
	//TADSXD-2
	@Test
	@DisplayName("Movimento peao branco duas casas para frente")
	void movimentoDuploPeao() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}
	
	//TADSXD-6
	@Test
	@DisplayName("Movimento peao preto e branco captura")
	void movimentoCapturaPeao() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}
	
	//TADSXD-9
	@Test
	@DisplayName("Movimento peao preto e branco promocao para Rainha")
	void promocaoPeaoRainha() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}
	
	//TADSXD-10
		@Test
		@DisplayName("Movimento peao preto e branco promocao para Torre")
		void promocaoPeaoTorre() {
			Tabuleiro tabuleiro = new Tabuleiro();
			tabuleiro.iniciar(new TradutorEspanhol());
		}
		
	//TADSXD-28
	@Test
	@DisplayName("Movimento peao preto e branco promocao para Bispo")
	void promocaoPeaoBispo() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}
	
	//TADSXD-36
	@Test
	@DisplayName("Movimento peao preto e branco promocao para Cavalo")
	void promocaoPeaoCavalo() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}
	
	//TADSXD-39
	@Test
	@DisplayName("Movimento peao preto e branco captura en passant")
	void movimentoCapturaEnPassant() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}
	
	//TADSXD-43
	@Test
	@DisplayName("Verificação de movimento peao preto e branco para não sobrepor um peão da mesma cor verticalmente")
	void movimentoRestricaodeSobreposicaoPeaoAliadoHorizontal() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}

	//TADSXD-44
	@Test
	@DisplayName("Verificação de movimento peao preto e branco para não sobrepor um peão adversário verticalmente")
	void movimentoRestricaodeSobreposicaoPeaoAdversario() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}
	
	//TADSXD-44
		@Test
		@DisplayName("Verificação de movimento peao preto e branco para não sobrepor um peão da mesma cor diagonalmente")
		void movimentoRestricaodeSobreposicaoPeaoAliadoDiagonal() {
			Tabuleiro tabuleiro = new Tabuleiro();
			tabuleiro.iniciar(new TradutorEspanhol());
		}
		

}
