package exercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PreEPosCondicoesDaClass {
	
	@BeforeClass
	public static void preCondicao_AntesClasse() {
		System.out.println("Executou antes de todos os testes");
	}
	
	
	@Before
	public void preCondicao() {
		System.out.println("Executou a pre condicao");	
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste1() {
		System.out.println("Executou o testes 01 ");
	}
	@Test
	public void exibicaoPrePosCondicao_Teste2() {
		System.out.println("Executou o testes 02 ");
	}
	@After
	public void posCondicao() {
		System.out.println("Executou a pos condicao");	
	}
	
	@AfterClass
	public static void posCondicao_DespoisClasse() {
		System.out.println("Executou depois de todos os testes");
	}
}
