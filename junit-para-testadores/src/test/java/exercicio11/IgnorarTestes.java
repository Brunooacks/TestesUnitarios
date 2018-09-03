package exercicio11;

import org.junit.Ignore;
import org.junit.Test;

public class IgnorarTestes {

	@Test
	public void teste01 () {
		
	}
	
	@Test 
	@Ignore
	public void testeIgnorado () {
		
	}
	
	@Test
	@Ignore(value = "Teste ignorado pois a funcionalidade náo foi entregue")
	public void testeIgnoradoComMotivo () {
	
	}
}
