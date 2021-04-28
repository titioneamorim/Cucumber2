package util;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Componentes {

    private WebDriver driver;

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
}
