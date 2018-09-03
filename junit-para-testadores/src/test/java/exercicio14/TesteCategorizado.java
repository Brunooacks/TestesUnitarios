package exercicio14;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorias.Positivos;
import categorias.Smoke;

public class TesteCategorizado {

	@Test
	@Category(Smoke.class)
	public void testes01() {
		
		
	}
	@Test
	@Category(Positivos.class)
	public void teste02() {
		
	}
	@Test
	public void teste03() {
		
	}
	
}
