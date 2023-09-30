package steps;

import drivers.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.BuscarCepPage;
import page.HomePage;
import runner.Executa;

public class PesquisaCepTeste extends Drivers{

	HomePage home = new HomePage();
	
	BuscarCepPage  page = new BuscarCepPage();
	
	
	
	
	@Given("que esteja no site")
	public void queEstejaNoSite() {
		Executa.abrirNavegador();
	    
	}
	@Given("preencho os dados  validos")
	public void preenchoOsDadosValidos() {
		home.buscarCep("06246-140");
		
	}
	@Then("valido dados do endereco")
	public void validoDadosDoEndereco() {
		page.validarDadosDOCep("Rua Doutor José Marques de Rezende", "Munhoz Júnior", "Osasco/SP", "06246-140");
	    
	}




}
