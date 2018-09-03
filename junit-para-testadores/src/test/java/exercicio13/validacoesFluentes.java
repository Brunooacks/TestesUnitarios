package exercicio13;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;


public class validacoesFluentes {

	@Test
	public void validacaoEqualsTo() {
		String produto = "TV 40 polegadas" ;
		assertThat(produto, equalTo("TV 40 polegadas"));	
	}
	
	@Test
	public void validacaoIs() {
		int codigo = 50 ;
		assertThat(codigo, is(50));
	}
	
	@Test
	public void validacaoAnyOf() {
		String resultadoObtido = "A cor selecionada foi vermelha";
		assertThat(resultadoObtido, anyOf(containsString("vermelho"), containsString("vermelha")));
	}
	
	@Test
	public void validacaoHasItem() {
		java.util.List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("iphone 8 Plus 64gb");
		listaProdutos.add("Adaptador USB-C VGA");
		listaProdutos.add("Apple TV 4 geracao");
		
		assertThat(listaProdutos, hasItem("Adaptador USB-C VGA"));
	}
	
}
