package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/Componentes.feature", glue = "", tags = "@interagir_alert_botao_confirmar")
public class TestRunner {

}