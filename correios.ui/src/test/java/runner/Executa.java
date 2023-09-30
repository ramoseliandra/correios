package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@regressivo",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		
		)
		
	public class Executa extends Drivers{
	
	public static void abrirNavegador() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.correios.com.br/");
		driver.manage().window().maximize();
		
	}

}
