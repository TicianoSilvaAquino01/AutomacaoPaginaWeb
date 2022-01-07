package eadIterasys;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		dryRun = false, 
		monochrome = true,
		features = { "src/test/resources/" },
		glue = { "/" },
		plugin = {"pretty", 
				"html:target/relatorio1.html", 
				"json:target/relatorio1.json"
				
				//"com.cucumber.listener.ExtentCucumberFormatter:target/relatorio2/dashboard.html"
				
				
				
		}
		
		
		
		
		
		
		
		
		
		)


public class Runner {

	
	
}
