package TesteRenner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Novidades {
    WebDriver driver;
    @Before
    public void iniciar()throws Exception {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lojasrenner.com.br");


    }

    @Test
    public void deveEnviarNovidades(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        new Select(driver.findElement(By.xpath("//select[@id='interestSelect']"))).selectByVisibleText("Feminino");
        driver.findElement(By.id("emailInput")).sendKeys("teste@gmail.com");
        WebElement caixaCadastrar = driver.findElement(By.xpath("//button[@class='css-yl1sti']"));
        caixaCadastrar.click();
    }



    @After
    public void encerrar()throws Exception{
        //driver.quit();
    }





}
