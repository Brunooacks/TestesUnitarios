package exercicio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidacaoVedadeiroFalso {
	
	
	@Test
	public void validacaoVerdadeiro_Sucesso () {
	
	boolean campoEstaPresente = true;
	assertTrue(campoEstaPresente);
	}
	@Test
	public void validacaoVerdadeiro_Falha () {
		boolean campoEstaPresente = true;
		assertFalse("Campo não está presente", campoEstaPresente);
	}
}

	