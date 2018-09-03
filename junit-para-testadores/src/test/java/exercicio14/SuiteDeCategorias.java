package exercicio14;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categorias.Positivos;
import categorias.Smoke;

@RunWith(Categories.class)
@IncludeCategory(Smoke.class)
@SuiteClasses({
	TesteCategorizado.class
})

public class SuiteDeCategorias {

}
