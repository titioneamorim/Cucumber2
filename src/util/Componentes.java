package util;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Componentes {

    private WebDriver driver;
    private Select combo;


    public void inicializa(){
        String chromeDriver = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/resource/componentes.html");

    }

    public void maximinizarNavegador(){
        driver.manage().window().maximize();
    }

    public void fecharNavegador(){
        driver.quit();
    }

    public void navegadorChrome(){
        Assert.assertTrue(driver.toString().contains("Chrome"));
    }

    public void testeTextField() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");
    }

     public void validaTextField(){
        Assert.assertEquals("Batatinha", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
     }

    public void testeTextArea() {
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Batatinha \n\n Batatinha");
    }

    public void validaTextArea(){
        Assert.assertEquals("Batatinha \n\n Batatinha", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }

    public void testeSelecaoRadioButton(String element){
        driver.findElement(By.id(element)).click();
    }

    public void validaSelecaoRadioButton(String element){
        Assert.assertTrue(driver.findElement(By.id(element)).isSelected());

    }

    public void testeSelecaoCheckBox(String element){
        driver.findElement(By.id(element)).click();
    }

    public void validaSelecaoCheckBox(String element){
        Assert.assertTrue(driver.findElement(By.id(element)).isSelected());
    }

    public void selecionarValorPeloTexto(String valorCampo){
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        combo.selectByValue(valorCampo);
    }

    public void validaValorCOmboboxPeloTexto(String valorCampo){
        Assert.assertEquals(valorCampo, combo.getFirstSelectedOption().getText());
    }

    public void selecionarValorCOmbobox(){
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        combo.selectByIndex(5);
    }
    public void validaValorCOmbobox(){
        Assert.assertEquals("Especializacao", combo.getFirstSelectedOption().getText());
    }

    public void listarQuantidadeCombobox(){
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        List<WebElement> quantidade = combo.getOptions();
    }

    public void validaQuantidadeCombo(){
        Assert.assertEquals(8, combo.getOptions().size());
    }

    public void validaOpcaoSelecionada(String valorCampo){
        List<WebElement> opcoes = combo.getOptions();
        String encontrado = valorCampo;
        for (WebElement ignorado : opcoes) {
            ignorado.getText().equals(valorCampo);
            encontrado = valorCampo;
            break;
        }
        Assert.assertEquals(encontrado, combo.getFirstSelectedOption().getText());
    }

    public void selecionarValorComboMultiplo(){
        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(elemento);
        combo.selectByVisibleText("O que eh esporte?");
        combo.selectByVisibleText("Karate");
    }

    public void vaidaValorComboMultiplo(){
        List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(2, allSelectedOptions.size());

    }

    public void interageBotao(){
        WebElement elemento = driver.findElement(By.id("buttonSimple"));
        elemento.click();
    }

    public void validaInteracaoBtao(){
        WebElement element =driver.findElement(By.id("buttonSimple"));
        Assert.assertEquals("Obrigado!", element.getAttribute("value"));
    }

    public void interageBotaoAlert(){
        WebElement elemento = driver.findElement(By.id("alert"));
        elemento.click();
    }

    public void validaInteracaoAlert(){
        Alert alert =driver.switchTo().alert();
        Assert.assertEquals("Alert Simples", alert.getText());
    }

    public void interageBotaoConfirm(){
        WebElement elemento = driver.findElement(By.id("confirm"));
        elemento.click();
    }

    public void validaInteracaoAlertConfirm(String valor){
        Alert alert =driver.switchTo().alert();
        Assert.assertEquals(valor, alert.getText());
    }

    public void interageAlertConfirmOk(){
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    public void interageAlertConfirmCancelar(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }

}
