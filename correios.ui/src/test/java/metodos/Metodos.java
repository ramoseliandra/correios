package metodos;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import drivers.Drivers;

public class Metodos extends Drivers{
	
	public void escrever(By elemento,String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
		
		
	}
public void clicar(By elemento) {
	driver.findElement(elemento).click();
	
}
public void submit(By elemento) {
	driver.findElement(elemento).submit();
	
}
public void scroll(int tempo) {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scroll(0,300)", "");
	
	
}
public void trocarDeAba() {
	String janelaAtual = driver.getWindowHandle();
	Set<String> janelas = driver.getWindowHandles();
	
	for(String janela :janelas) {
		driver.switchTo().window(janela);
		System.out.println("Endereço do site" + driver.getCurrentUrl());
	}
}
public void validarTexto(By elemento,String textoDesejado) {
	
	String textoCapturado = driver.findElement(elemento).getText();
	assertEquals(textoDesejado,textoCapturado);
	
}
public void fecharAba() {
	driver.close();
	
	
}
public void fecharNavegador() {
	driver.quit();
	
}
}