package br.com.afsj.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.afsj.model.Peao;
import br.com.afsj.model.Rainha;
import br.com.afsj.model.Torre;
import br.com.afsj.model.Cavalo;
import br.com.afsj.model.ArrayPecas;
import br.com.afsj.model.Bispo;
import br.com.afsj.model.Tabuleiro;
import br.com.afsj.model.TradutorEspanhol;
import br.com.afsj.view.IPeao;

public class PeaoTest {

	@BeforeEach
	void resetarEstadoDoTabuleiro() {
		// Recria os objetos estáticos manualmente
		Tabuleiro.listaBrancas = new ArrayPecas();
		Tabuleiro.listaPretas = new ArrayPecas();
//		Tabuleiro.pecaMarcada = null;
//		Tabuleiro.iPecaMarcada = null;
//
//		// Redefine a cor do jogador
//		Tabuleiro.corJogadorAtual = Xadrez.corBRANCA;

		// Recria os peões
		Tabuleiro.peaoBranco1 = new Peao();
		Tabuleiro.iPeaoBranco1 = new IPeao(Tabuleiro.peaoBranco1);
		Tabuleiro.peaoBranco2 = new Peao();
		Tabuleiro.iPeaoBranco2 = new IPeao(Tabuleiro.peaoBranco2);
		Tabuleiro.peaoBranco3 = new Peao();
		Tabuleiro.iPeaoBranco3 = new IPeao(Tabuleiro.peaoBranco3);
		Tabuleiro.peaoBranco4 = new Peao();
		Tabuleiro.iPeaoBranco4 = new IPeao(Tabuleiro.peaoBranco4);
		Tabuleiro.peaoBranco6 = new Peao();
		Tabuleiro.iPeaoBranco6 = new IPeao(Tabuleiro.peaoBranco6);
		Tabuleiro.peaoPreto3 = new Peao();
		Tabuleiro.iPeaoPreto3 = new IPeao(Tabuleiro.peaoPreto3);
		Tabuleiro.peaoPreto4 = new Peao();
		Tabuleiro.iPeaoPreto4 = new IPeao(Tabuleiro.peaoPreto4);
		
		// Peões Brancos
		Tabuleiro.peaoBranco1.mover(0, 6);
		Tabuleiro.iPeaoBranco1.mover(0, 6);

		Tabuleiro.peaoBranco2.mover(1, 6);
		Tabuleiro.iPeaoBranco2.mover(1, 6);

		Tabuleiro.peaoBranco3.mover(2, 6);
		Tabuleiro.iPeaoBranco3.mover(2, 6);

		Tabuleiro.peaoBranco4.mover(3, 6);
		Tabuleiro.iPeaoBranco4.mover(3, 6);

		Tabuleiro.peaoBranco6.mover(5, 6);
		Tabuleiro.iPeaoBranco6.mover(5, 6);

		// Peões Pretos
		Tabuleiro.peaoPreto1.mover(0, 1);
		Tabuleiro.iPeaoPreto1.mover(0, 1);

		Tabuleiro.peaoPreto2.mover(1, 1);
		Tabuleiro.iPeaoPreto2.mover(1, 1);

		Tabuleiro.peaoPreto3.mover(2, 1);
		Tabuleiro.iPeaoPreto3.mover(2, 1);

		Tabuleiro.peaoPreto4.mover(3, 1);
		Tabuleiro.iPeaoPreto4.mover(3, 1);

		Tabuleiro.peaoPreto6.mover(5, 1);
		Tabuleiro.iPeaoPreto6.mover(5, 1);

		
		

		// Recria o tabuleiro
		new Tabuleiro().iniciar(new TradutorEspanhol());
	}

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
	@Disabled("Teste desativado devido à necessidade de interação com JOptionPane para promoção. Requer refatoração do código do jogo.")
	@DisplayName("Movimento peao preto e branco promocao para Rainha")
	void promocaoPeaoRainha() {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
		
		/** Pré-Condições
		 * Posicionando as peças brancas no tabuleiro */
		
		// peaoBranco1 em a2 (0,6)
		Peao pb1 = Tabuleiro.peaoBranco1;
		IPeao ipb1 = Tabuleiro.iPeaoBranco1;
		
		// peaoBranco2 em b2 (1,6)
		Peao pb2 = Tabuleiro.peaoBranco2;
		IPeao ipb2 = Tabuleiro.iPeaoBranco2;
		
		// peaoBranco3 em c2 (2,6)
		Peao pb3 = Tabuleiro.peaoBranco3;
		IPeao ipb3 = Tabuleiro.iPeaoBranco3;
		
		// peaoBranco4 em d2 (3,6)
		Peao pb4 = Tabuleiro.peaoBranco4;
		IPeao ipb4 = Tabuleiro.iPeaoBranco4;
		
		// peaoBranco6 em f2 (5,6) - Essa é a peça que vai ser usada neste caso de teste
		Peao pb6 = Tabuleiro.peaoBranco6;
		IPeao ipb6 = Tabuleiro.iPeaoBranco6;
		
		/** Posicionando as peças pretas no tabuleiro */
		
		// peaoPreto1 em a7 (0,1)
		Peao pp1 = Tabuleiro.peaoPreto1;
		IPeao ipp1 = Tabuleiro.iPeaoPreto1;
		
		// peaoPreto2 em b7 (1,1)
		Peao pp2 = Tabuleiro.peaoPreto2;
		IPeao ipp2 = Tabuleiro.iPeaoPreto2;
		
		// peaoPreto3 em c7 (2,1)
		Peao pp3 = Tabuleiro.peaoPreto3;
		IPeao ipp3 = Tabuleiro.iPeaoPreto3;
		
		// peaoPreto4 em d7 (3,1)
		Peao pp4 = Tabuleiro.peaoPreto4;
		IPeao ipp4 = Tabuleiro.iPeaoPreto4;
		
		// peaoPreto6 em g7 (6,1) - Essa é a peça que vai ser usada neste caso de teste
		Peao pp6 = Tabuleiro.peaoPreto6; 
		IPeao ipp6 = Tabuleiro.iPeaoPreto6;
		
		/** Movimento dos peões */

		// Mover Peão branco de f2 (5,6) para f4 (5,4)
		Tabuleiro.avaliarEventoPeca(pb6, ipb6);
		Tabuleiro.avaliarEventoTabuleiro(5, 4);
		assertAll("Mover Peão branco de f2 para f4",
				() -> assertEquals(5, pb6.getPosX()),
				() -> assertEquals(4, pb6.getPosY())
				);
		
		// Mover Peão preto de g7 (6,1) para g5 (6,3)
		Tabuleiro.avaliarEventoPeca(pp6, ipp6);
		Tabuleiro.avaliarEventoTabuleiro(6, 3);
		assertAll("Mover Peão preto de g7 para g5",
				() -> assertEquals(6, pp6.getPosX()),
				() -> assertEquals(3, pp6.getPosY())
				);
		
		// Mover Peão branco de f4 (5,4) para f5 (5,3)
		Tabuleiro.avaliarEventoPeca(pb6, ipb6);
		Tabuleiro.avaliarEventoTabuleiro(5, 3);
		assertAll("Mover Peão branco de f4 para f5",
				() -> assertEquals(5, pb6.getPosX()),
				() -> assertEquals(3, pb6.getPosY())
				);
		
		// Mover Peão preto de g5 (6,3) para g4 (6,4)
		Tabuleiro.avaliarEventoPeca(pp6, ipp6);
		Tabuleiro.avaliarEventoTabuleiro(6, 4);
		assertAll("Mover Peão preto de g5 para g4",
				() -> assertEquals(6, pp6.getPosX()),
				() -> assertEquals(4, pp6.getPosY())
				);
		
		// Mover Peão branco de from f5 (5,3) para f6 (5,2)
		Tabuleiro.avaliarEventoPeca(pb6, ipb6);
		Tabuleiro.avaliarEventoTabuleiro(5, 2);
		assertAll("Mover Peão branco de f5 para f6",
				() -> assertEquals(5, pb6.getPosX()),
				() -> assertEquals(2, pb6.getPosY())
				);
		
		// Mover Peão preto de g4 (6,4) para g3 (6,5)
		Tabuleiro.avaliarEventoPeca(pp6, ipp6);
		Tabuleiro.avaliarEventoTabuleiro(6, 5);
		assertAll("Mover Peão preto de g4 para g3",
				() -> assertEquals(6, pp6.getPosX()),
				() -> assertEquals(5, pp6.getPosY())
				);
		
		// Mover Peão branco de f6 (5,2) para f7 (5,1)
		Tabuleiro.avaliarEventoPeca(pb6, ipb6);
		Tabuleiro.avaliarEventoTabuleiro(5, 1);
		assertAll("Mover Peão branco de f6 para f7",
				() -> assertEquals(5, pb6.getPosX()),
				() -> assertEquals(1, pb6.getPosY())
				);
		
		// Mover Peão preto de g3 (6,5) para g2 (6,6)
		Tabuleiro.avaliarEventoPeca(pp6, ipp6);
		Tabuleiro.avaliarEventoTabuleiro(6, 6);
		assertAll("Mover Peão preto de g3 para g2",
				() -> assertEquals(6, pp6.getPosX()),
				() -> assertEquals(6, pp6.getPosY())
				);

		// Mover Peão branco de f7 (5,1) para f8 (5,0) - Isso vai ativar a caixa diálogo da promoção
		/** Como não é possível validar a promoção devido ao teste automatizado JUnit não conseguir interagir com o JOptionPane,
		 * Apenas verificamos mais uma vez se a posição do peão branco é a última linha do tabuleiro do lado das peças pretas*/
		Tabuleiro.avaliarEventoPeca(pb6, ipb6);
		Tabuleiro.avaliarEventoTabuleiro(5, 0);
		assertAll("Mover Peão branco de f7 para f8 e promover para Rainha",
				() -> assertEquals(5, pb6.getPosX()), 
				() -> assertEquals(0, pb6.getPosY())
		);
		
		/** Após refatorar o código para permitir um valor mockado para a escolha da Rainha em vez do JOptionPane,
		* 	poderíamos implementar os seguintes testes:
		*/
		//	assertNull(Tabuleiro.listaBrancas.pecaPosicao(5, 0)); // Peão branco foi removido
		//	assertInstanceOf(Rainha.class, Tabuleiro.listaBrancas.pecaPosicao(5, 0)); // Uma Rainha está no seu lugar
		
		/**	Além da limitação devido ao JOptionPane, a visibilidade do método pecaPosicao na classe 'ArrayPeca' deveria ser 'public'
		* 	para possibilitar os dois últimos testes sugeridos acima.
		*/
	}
		
		//TADSXD-10
		@Test
		@Disabled("Teste desativado devido à necessidade de interação com JOptionPane para promoção. Requer refatoração do código do jogo.")
		@DisplayName("Movimento peao preto e branco promocao para Torre")
		void promocaoPeaoTorre() {
			Tabuleiro tabuleiro = new Tabuleiro();
			tabuleiro.iniciar(new TradutorEspanhol());

			/** Pré-Condições
			 * Posicionando as peças brancas no tabuleiro */
			
			// peaoBranco1 em a2 (0,6)
			Peao pb1 = Tabuleiro.peaoBranco1;
			IPeao ipb1 = Tabuleiro.iPeaoBranco1;
			
			// peaoBranco2 em b2 (1,6)
			Peao pb2 = Tabuleiro.peaoBranco2;
			IPeao ipb2 = Tabuleiro.iPeaoBranco2;
			
			// peaoBranco3 em c2 (2,6)
			Peao pb3 = Tabuleiro.peaoBranco3;
			IPeao ipb3 = Tabuleiro.iPeaoBranco3;
			
			// peaoBranco4 em d2 (3,6)
			Peao pb4 = Tabuleiro.peaoBranco4;
			IPeao ipb4 = Tabuleiro.iPeaoBranco4;
			
			// peaoBranco6 em f2 (5,6) - Essa é a peça que vai ser usada neste caso de teste
			Peao pb6 = Tabuleiro.peaoBranco6;
			IPeao ipb6 = Tabuleiro.iPeaoBranco6;
			
			/** Posicionando as peças pretas no tabuleiro */
			
			// peaoPreto1 em a7 (0,1)
			Peao pp1 = Tabuleiro.peaoPreto1;
			IPeao ipp1 = Tabuleiro.iPeaoPreto1;
			
			// peaoPreto2 em b7 (1,1)
			Peao pp2 = Tabuleiro.peaoPreto2;
			IPeao ipp2 = Tabuleiro.iPeaoPreto2;
			
			// peaoPreto3 em c7 (2,1)
			Peao pp3 = Tabuleiro.peaoPreto3;
			IPeao ipp3 = Tabuleiro.iPeaoPreto3;
			
			// peaoPreto4 em d7 (3,1)
			Peao pp4 = Tabuleiro.peaoPreto4;
			IPeao ipp4 = Tabuleiro.iPeaoPreto4;
			
			// peaoPreto6 em g7 (6,1) - Essa é a peça que vai ser usada neste caso de teste
			Peao pp6 = Tabuleiro.peaoPreto6; 
			IPeao ipp6 = Tabuleiro.iPeaoPreto6;
			
			/** Movimento dos peões */

			// Mover Peão branco de f2 (5,6) para f4 (5,4)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 4);
			assertAll("Mover Peão branco de f2 para f4",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(4, pb6.getPosY())
					);
			
			// Mover Peão preto de g7 (6,1) para g5 (6,3)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 3);
			assertAll("Mover Peão preto de g7 para g5",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(3, pp6.getPosY())
					);
			
			// Mover Peão branco de f4 (5,4) para f5 (5,3)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 3);
			assertAll("Mover Peão branco de f4 para f5",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(3, pb6.getPosY())
					);
			
			// Mover Peão preto de g5 (6,3) para g4 (6,4)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 4);
			assertAll("Mover Peão preto de g5 para g4",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(4, pp6.getPosY())
					);
			
			// Mover Peão branco de from f5 (5,3) para f6 (5,2)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 2);
			assertAll("Mover Peão branco de f5 para f6",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(2, pb6.getPosY())
					);
			
			// Mover Peão preto de g4 (6,4) para g3 (6,5)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 5);
			assertAll("Mover Peão preto de g4 para g3",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(5, pp6.getPosY())
					);
			
			// Mover Peão branco de f6 (5,2) para f7 (5,1)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 1);
			assertAll("Mover Peão branco de f6 para f7",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(1, pb6.getPosY())
					);
			
			// Mover Peão preto de g3 (6,5) para g2 (6,6)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 6);
			assertAll("Mover Peão preto de g3 para g2",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(6, pp6.getPosY())
					);

			// Mover Peão branco de f7 (5,1) para f8 (5,0) - Isso vai ativar a caixa diálogo da promoção
			/** Como não é possível validar a promoção devido ao teste automatizado JUnit não conseguir interagir com o JOptionPane,
			 * Apenas verificamos mais uma vez se a posição do peão branco é a última linha do tabuleiro do lado das peças pretas*/
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 0);
			assertAll("Mover Peão branco de f7 para f8 e promover para Torre",
					() -> assertEquals(5, pb6.getPosX()), 
					() -> assertEquals(0, pb6.getPosY())
			);
			
			/** Após refatorar o código para permitir um valor mockado para a escolha da Torre em vez do JOptionPane,
			* 	poderíamos implementar os seguintes testes:
			*/
			//	assertNull(Tabuleiro.listaBrancas.pecaPosicao(5, 0)); // Peão branco foi removido
			//	assertInstanceOf(Torre.class, Tabuleiro.listaBrancas.pecaPosicao(5, 0)); // Uma Torre está no seu lugar
			
			/**	Além da limitação devido ao JOptionPane, a visibilidade do método pecaPosicao na classe 'ArrayPeca' deveria ser 'public'
			* 	para possibilitar os dois últimos testes sugeridos acima.
			*/
		}
			
		//TADSXD-28
		@Test
		@Disabled("Teste desativado devido à necessidade de interação com JOptionPane para promoção. Requer refatoração do código do jogo.")
		@DisplayName("Movimento peao preto e branco promocao para Bispo")
		void promocaoPeaoBispo() {
			Tabuleiro tabuleiro = new Tabuleiro();
			tabuleiro.iniciar(new TradutorEspanhol());

			/** Pré-Condições
			 * Posicionando as peças brancas no tabuleiro */
			
			// peaoBranco1 em a2 (0,6)
			Peao pb1 = Tabuleiro.peaoBranco1;
			IPeao ipb1 = Tabuleiro.iPeaoBranco1;
			
			// peaoBranco2 em b2 (1,6)
			Peao pb2 = Tabuleiro.peaoBranco2;
			IPeao ipb2 = Tabuleiro.iPeaoBranco2;
			
			// peaoBranco3 em c2 (2,6)
			Peao pb3 = Tabuleiro.peaoBranco3;
			IPeao ipb3 = Tabuleiro.iPeaoBranco3;
			
			// peaoBranco4 em d2 (3,6)
			Peao pb4 = Tabuleiro.peaoBranco4;
			IPeao ipb4 = Tabuleiro.iPeaoBranco4;
			
			// peaoBranco6 em f2 (5,6) - Essa é a peça que vai ser usada neste caso de teste
			Peao pb6 = Tabuleiro.peaoBranco6;
			IPeao ipb6 = Tabuleiro.iPeaoBranco6;
			
			/** Posicionando as peças pretas no tabuleiro */
			
			// peaoPreto1 em a7 (0,1)
			Peao pp1 = Tabuleiro.peaoPreto1;
			IPeao ipp1 = Tabuleiro.iPeaoPreto1;
			
			// peaoPreto2 em b7 (1,1)
			Peao pp2 = Tabuleiro.peaoPreto2;
			IPeao ipp2 = Tabuleiro.iPeaoPreto2;
			
			// peaoPreto3 em c7 (2,1)
			Peao pp3 = Tabuleiro.peaoPreto3;
			IPeao ipp3 = Tabuleiro.iPeaoPreto3;
			
			// peaoPreto4 em d7 (3,1)
			Peao pp4 = Tabuleiro.peaoPreto4;
			IPeao ipp4 = Tabuleiro.iPeaoPreto4;
			
			// peaoPreto6 em g7 (6,1) - Essa é a peça que vai ser usada neste caso de teste
			Peao pp6 = Tabuleiro.peaoPreto6; 
			IPeao ipp6 = Tabuleiro.iPeaoPreto6;
			
			/** Movimento dos peões */

			// Mover Peão branco de f2 (5,6) para f4 (5,4)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 4);
			assertAll("Mover Peão branco de f2 para f4",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(4, pb6.getPosY())
					);
			
			// Mover Peão preto de g7 (6,1) para g5 (6,3)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 3);
			assertAll("Mover Peão preto de g7 para g5",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(3, pp6.getPosY())
					);
			
			// Mover Peão branco de f4 (5,4) para f5 (5,3)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 3);
			assertAll("Mover Peão branco de f4 para f5",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(3, pb6.getPosY())
					);
			
			// Mover Peão preto de g5 (6,3) para g4 (6,4)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 4);
			assertAll("Mover Peão preto de g5 para g4",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(4, pp6.getPosY())
					);
			
			// Mover Peão branco de from f5 (5,3) para f6 (5,2)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 2);
			assertAll("Mover Peão branco de f5 para f6",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(2, pb6.getPosY())
					);
			
			// Mover Peão preto de g4 (6,4) para g3 (6,5)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 5);
			assertAll("Mover Peão preto de g4 para g3",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(5, pp6.getPosY())
					);
			
			// Mover Peão branco de f6 (5,2) para f7 (5,1)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 1);
			assertAll("Mover Peão branco de f6 para f7",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(1, pb6.getPosY())
					);
			
			// Mover Peão preto de g3 (6,5) para g2 (6,6)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 6);
			assertAll("Mover Peão preto de g3 para g2",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(6, pp6.getPosY())
					);

			// Mover Peão branco de f7 (5,1) para f8 (5,0) - Isso vai ativar a caixa diálogo da promoção
			/** Como não é possível validar a promoção devido ao teste automatizado JUnit não conseguir interagir com o JOptionPane,
			 * Apenas verificamos mais uma vez se a posição do peão branco é a última linha do tabuleiro do lado das peças pretas*/
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 0);
			assertAll("Mover Peão branco de f7 para f8 e promover para Bispo",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(0, pb6.getPosY())
			);
			
			/** Após refatorar o código para permitir um valor mockado para a escolha do Bispo em vez do JOptionPane,
			* 	poderíamos implementar os seguintes testes:
			*/
			//	assertNull(Tabuleiro.listaBrancas.pecaPosicao(5, 0)); // Peão branco foi removido
			//	assertInstanceOf(Bispo.class, Tabuleiro.listaBrancas.pecaPosicao(5, 0)); // Um Bispo está no seu lugar
			
			/**	Além da limitação devido ao JOptionPane, a visibilidade do método pecaPosicao na classe 'ArrayPeca' deveria ser 'public'
			* 	para possibilitar os dois últimos testes sugeridos acima.
			*/
		}
		
		//TADSXD-36
		@Test
		@Disabled("Teste desativado devido à necessidade de interação com JOptionPane para promoção. Requer refatoração do código do jogo.")
		@DisplayName("Movimento peao preto e branco promocao para Cavalo")
		void promocaoPeaoCavalo() {
			Tabuleiro tabuleiro = new Tabuleiro();
			tabuleiro.iniciar(new TradutorEspanhol());

			/** Pré-Condições
			 * Posicionando as peças brancas no tabuleiro */
			
			// peaoBranco1 em a2 (0,6)
			Peao pb1 = Tabuleiro.peaoBranco1;
			IPeao ipb1 = Tabuleiro.iPeaoBranco1;
			
			// peaoBranco2 em b2 (1,6)
			Peao pb2 = Tabuleiro.peaoBranco2;
			IPeao ipb2 = Tabuleiro.iPeaoBranco2;
			
			// peaoBranco3 em c2 (2,6)
			Peao pb3 = Tabuleiro.peaoBranco3;
			IPeao ipb3 = Tabuleiro.iPeaoBranco3;
			
			// peaoBranco4 em d2 (3,6)
			Peao pb4 = Tabuleiro.peaoBranco4;
			IPeao ipb4 = Tabuleiro.iPeaoBranco4;
			
			// peaoBranco6 em f2 (5,6) - Essa é a peça que vai ser usada neste caso de teste
			Peao pb6 = Tabuleiro.peaoBranco6;
			IPeao ipb6 = Tabuleiro.iPeaoBranco6;
			
			/** Posicionando as peças pretas no tabuleiro */
			
			// peaoPreto1 em a7 (0,1)
			Peao pp1 = Tabuleiro.peaoPreto1;
			IPeao ipp1 = Tabuleiro.iPeaoPreto1;
			
			// peaoPreto2 em b7 (1,1)
			Peao pp2 = Tabuleiro.peaoPreto2;
			IPeao ipp2 = Tabuleiro.iPeaoPreto2;
			
			// peaoPreto3 em c7 (2,1)
			Peao pp3 = Tabuleiro.peaoPreto3;
			IPeao ipp3 = Tabuleiro.iPeaoPreto3;
			
			// peaoPreto4 em d7 (3,1)
			Peao pp4 = Tabuleiro.peaoPreto4;
			IPeao ipp4 = Tabuleiro.iPeaoPreto4;
			
			// peaoPreto6 em g7 (6,1) - Essa é a peça que vai ser usada neste caso de teste
			Peao pp6 = Tabuleiro.peaoPreto6; 
			IPeao ipp6 = Tabuleiro.iPeaoPreto6;
			
			/** Movimento dos peões */

			// Mover Peão branco de f2 (5,6) para f4 (5,4)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 4);
			assertAll("Mover Peão branco de f2 para f4",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(4, pb6.getPosY())
					);
			
			// Mover Peão preto de g7 (6,1) para g5 (6,3)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 3);
			assertAll("Mover Peão preto de g7 para g5",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(3, pp6.getPosY())
					);
			
			// Mover Peão branco de f4 (5,4) para f5 (5,3)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 3);
			assertAll("Mover Peão branco de f4 para f5",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(3, pb6.getPosY())
					);
			
			// Mover Peão preto de g5 (6,3) para g4 (6,4)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 4);
			assertAll("Mover Peão preto de g5 para g4",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(4, pp6.getPosY())
					);
			
			// Mover Peão branco de from f5 (5,3) para f6 (5,2)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 2);
			assertAll("Mover Peão branco de f5 para f6",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(2, pb6.getPosY())
					);
			
			// Mover Peão preto de g4 (6,4) para g3 (6,5)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 5);
			assertAll("Mover Peão preto de g4 para g3",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(5, pp6.getPosY())
					);
			
			// Mover Peão branco de f6 (5,2) para f7 (5,1)
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 1);
			assertAll("Mover Peão branco de f6 para f7",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(1, pb6.getPosY())
					);
			
			// Mover Peão preto de g3 (6,5) para g2 (6,6)
			Tabuleiro.avaliarEventoPeca(pp6, ipp6);
			Tabuleiro.avaliarEventoTabuleiro(6, 6);
			assertAll("Mover Peão preto de g3 para g2",
					() -> assertEquals(6, pp6.getPosX()),
					() -> assertEquals(6, pp6.getPosY())
					);

			// Mover Peão branco de f7 (5,1) para f8 (5,0) - Isso vai ativar a caixa diálogo da promoção
			/** Como não é possível validar a promoção devido ao teste automatizado JUnit não conseguir interagir com o JOptionPane,
			 * Apenas verificamos mais uma vez se a posição do peão branco é a última linha do tabuleiro do lado das peças pretas*/
			Tabuleiro.avaliarEventoPeca(pb6, ipb6);
			Tabuleiro.avaliarEventoTabuleiro(5, 0);
			assertAll("Mover Peão branco de f7 para f8 e promover para Cavalo",
					() -> assertEquals(5, pb6.getPosX()),
					() -> assertEquals(0, pb6.getPosY())
			);
			
			/** Após refatorar o código para permitir um valor mockado para a escolha do Cavalo em vez do JOptionPane,
			* 	poderíamos implementar os seguintes testes:
			*/
			//	assertNull(Tabuleiro.listaBrancas.pecaPosicao(5, 0)); // Peão branco foi removido
			//	assertInstanceOf(Cavalo.class, Tabuleiro.listaBrancas.pecaPosicao(5, 0)); // Um Cavalo está no seu lugar
			
			/**	Além da limitação devido ao JOptionPane, a visibilidade do método pecaPosicao na classe 'ArrayPeca' deveria ser 'public'
			* 	para possibilitar os dois últimos testes sugeridos acima.
			*/
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
		Tabuleiro.avaliarEventoPeca(pp, ipp);
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
	 		
	 		System.out.println("Posição inicial: " + pb2.getPosX() + ", " + pb2.getPosY());

			Tabuleiro.avaliarEventoPeca(pb2, ipb2);
			Tabuleiro.avaliarEventoTabuleiro(3, 4);
			assertAll("Mover Pe�o branco de d2 duas casas",
					() -> assertEquals(3, pb2.getPosX()),
					() -> assertEquals(4, pb2.getPosY())
					);
			System.out.println("Posição após tentativa: " + pb2.getPosX() + ", " + pb2.getPosY());
			
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
			Tabuleiro.avaliarEventoPeca(pp2, ipp2);
			assertAll("Mover Pe�o branco para capturar peão preto",
					() -> assertEquals(3, pb.getPosX()),
					() -> assertEquals(3, pb.getPosY())
					);
			
			Tabuleiro.avaliarEventoPeca(pp, ipp);
			Tabuleiro.avaliarEventoTabuleiro(2, 4);
			assertAll("Mover Pe�o preto de c7 duas casas",
					() -> assertEquals(2, pp.getPosX()),
					() -> assertEquals(4, pp.getPosY())
					);
			
			Tabuleiro.avaliarEventoPeca(pb2, ipb2);
			Tabuleiro.avaliarEventoPeca(pb, ipb);
			assertAll("Mover Pe�o branco uma casa tentanto sobrepor outro peão branco",
					() -> assertEquals(3, pb2.getPosX()),
					() -> assertEquals(4, pb2.getPosY())
					);
		}
		

}
