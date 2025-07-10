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
	@DisplayName("Verificação de movimento peao preto e branco para não se mover para uma posicao ilegal")
	void movimentoRestricaodeSobreposicaoPeaoAliadoHorizontal() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
		
		Peao pb = Tabuleiro.peaoBranco6;
		IPeao ipb = Tabuleiro.iPeaoBranco6;
		
		
		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(6, 6);
		assertAll("Mover Pe�o branco uma casa",
				() -> assertEquals(5, pb.getPosX()),
				() -> assertEquals(6, pb.getPosY())
				);
		
		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(6, 7);
		assertAll("Mover Pe�o branco uma casa",
				() -> assertEquals(5, pb.getPosX()),
				() -> assertEquals(6, pb.getPosY())
				);
		
		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(5, 7);
		assertAll("Mover Pe�o branco uma casa",
				() -> assertEquals(5, pb.getPosX()),
				() -> assertEquals(6, pb.getPosY())
				);
		
		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(6, 5);
		assertAll("Mover Pe�o branco uma casa",
				() -> assertEquals(5, pb.getPosX()),
				() -> assertEquals(6, pb.getPosY())
				);
		
		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(4, 7);
		assertAll("Mover Pe�o branco uma casa",
				() -> assertEquals(5, pb.getPosX()),
				() -> assertEquals(6, pb.getPosY())
				);
		
		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(4, 6);
		assertAll("Mover Pe�o branco uma casa",
				() -> assertEquals(5, pb.getPosX()),
				() -> assertEquals(6, pb.getPosY())
				);
		
		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(4, 5);
		assertAll("Mover Pe�o branco uma casa",
				() -> assertEquals(5, pb.getPosX()),
				() -> assertEquals(6, pb.getPosY())
				);
	
	}

	//TADSXD-44
	@Test
	@DisplayName("Verificação de movimento peao preto e branco para não sobrepor um peão adversário verticalmente")
	void movimentoRestricaodeSobreposicaoPeaoAdversario() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
		
		Peao pb = Tabuleiro.peaoBranco4;
		IPeao ipb = Tabuleiro.iPeaoBranco4;
 		
 		Peao pp = Tabuleiro.peaoPreto4;
 		IPeao ipp = Tabuleiro.iPeaoPreto4;
 		
 		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(3, 4);
		assertAll("Mover Pe�o branco duas casas",
				() -> assertEquals(3, pb.getPosX()),
				() -> assertEquals(4, pb.getPosY())
				);
		
		Tabuleiro.avaliarEventoPeca(pp, ipp);
		Tabuleiro.avaliarEventoTabuleiro(3, 3);
		assertAll("Mover Pe�o preto duas casas",
				() -> assertEquals(3, pp.getPosX()),
				() -> assertEquals(3, pp.getPosY())
				);
		Tabuleiro.avaliarEventoPeca(pb, ipb);
		Tabuleiro.avaliarEventoTabuleiro(3, 3);
		assertAll("Mover Pe�o branco para sobrepor o peão preto",
				() -> assertEquals(3, pb.getPosX()),
				() -> assertEquals(4, pb.getPosY())
				);
		
	}
	
	//TADSXD-45
		@Test
		@DisplayName("Verificação de movimento peao preto e branco para não sobrepor um peão da mesma cor diagonalmente")
		void movimentoRestricaodeSobreposicaoPeaoAliadoDiagonal() {
			Tabuleiro tabuleiro = new Tabuleiro();
			tabuleiro.iniciar(new TradutorEspanhol());
			
			Peao pb = Tabuleiro.peaoBranco3;
			IPeao ipb = Tabuleiro.iPeaoBranco3;
	 		
	 		Peao pp = Tabuleiro.peaoPreto3;
	 		IPeao ipp = Tabuleiro.iPeaoPreto3;
			
			Peao pb2 = Tabuleiro.peaoBranco4;
			IPeao ipb2 = Tabuleiro.iPeaoBranco4;
	 		
	 		Peao pp2 = Tabuleiro.peaoPreto4;
	 		IPeao ipp2 = Tabuleiro.iPeaoPreto4;
	 		
	 		Tabuleiro.avaliarEventoPeca(pb2, ipb2);
			Tabuleiro.avaliarEventoTabuleiro(3, 5);
			assertAll("Mover Pe�o branco de d2 duas casas",
					() -> assertEquals(3, pb2.getPosX()),
					() -> assertEquals(5, pb2.getPosY())
					);
			
			Tabuleiro.avaliarEventoPeca(pp2, ipp2);
			Tabuleiro.avaliarEventoTabuleiro(3, 3);
			assertAll("Mover Pe�o preto de d7 duas casas",
					() -> assertEquals(3, pp2.getPosX()),
					() -> assertEquals(3, pp2.getPosY())
					);
			Tabuleiro.avaliarEventoPeca(pb, ipb);
			Tabuleiro.avaliarEventoTabuleiro(2, 4);
			assertAll("Mover Pe�o branco de c2 duas casas ",
					() -> assertEquals(2, pb.getPosX()),
					() -> assertEquals(4, pb.getPosY())
					);
			Tabuleiro.avaliarEventoPeca(pp, ipp);
			Tabuleiro.avaliarEventoTabuleiro(2, 3);
			assertAll("Mover Pe�o preto de c7 duas casas",
					() -> assertEquals(2, pp.getPosX()),
					() -> assertEquals(3, pp.getPosY())
					);
			Tabuleiro.avaliarEventoPeca(pb, ipb);
			Tabuleiro.avaliarEventoTabuleiro(3, 3);
			assertAll("Mover Pe�o branco para capturar peão preto",
					() -> assertEquals(3, pb.getPosX()),
					() -> assertEquals(3, pb.getPosY())
					);
			Tabuleiro.avaliarEventoPeca(pb2, ipb2);
			Tabuleiro.avaliarEventoTabuleiro(3, 3);
			assertAll("Mover Pe�o branco uma casa tentanto sobrepor outro peão branco",
					() -> assertEquals(3, pb2.getPosX()),
					() -> assertEquals(4, pb2.getPosY())
					);
		}
		

}
