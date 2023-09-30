package page;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class HomePage {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public By buscarcep = By.id("relaxation");
	
	
	
	public void buscarCep(String cep) {
		metodo.scroll(0);
		metodo.clicar(el.fechaCarol);
		metodo.escrever(buscarcep, "06246-140");
		metodo.clicar(el.politicaPrivacidade);
		metodo.submit(buscarcep);
		
		

	}
}
