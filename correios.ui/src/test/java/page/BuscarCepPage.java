package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class BuscarCepPage {
	
	Metodos metodo = new Metodos();
	
	
	By logradouroNome = By.xpath("//td[@data-th='Logradouro/Nome']");
	By bairro = By.xpath("//td[@data-th='Bairro/Distrito']");
	By localidade = By.xpath("//td[@data-th='Localidade/UF']");
	By cep = By.xpath("//td[@data-th='CEP']");
	
	
	
	public void validarDadosDOCep(String logradouroNome,String  bairro,String localidade,String cep) {
		metodo.trocarDeAba();
		metodo.validarTexto(this.logradouroNome, logradouroNome);
		metodo.validarTexto(this.bairro, bairro);
		metodo.validarTexto(this.localidade, localidade);
		metodo.validarTexto(this.cep, cep);
		metodo.fecharAba();
	
	


		
	}
}
