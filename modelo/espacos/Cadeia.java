package modelo.espacos;

import modelo.enums.NomeDeEspaco;

/**
 * 	Espaço para onde o jogador vai quando ele é preso fica na cadeia ate a proxima jogada
 
 */
public class Cadeia extends Espaco {

	private final int fianca = 50;

	public Cadeia(NomeDeEspaco nome) {
		super(nome);
	}

	public int getFianca() {
		return fianca;
	}

}
