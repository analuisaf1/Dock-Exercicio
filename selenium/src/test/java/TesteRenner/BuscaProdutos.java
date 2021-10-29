package TesteRenner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BuscaProdutos {
    WebDriver driver;
    @Before
    public void iniciar()throws Exception {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lojasrenner.com.br");


    }

    @Test
    public void BuscaProdutos() throws InterruptedException {

        //driver.get("https://www.lojasrenner.com.br");
        WebElement caixadeBusca = driver.findElement(By.name("Ntt"));
        caixadeBusca.click();
        caixadeBusca.sendKeys("camiseta"+ Keys.ENTER);
        Thread.sleep(10000);

        String resultadoPesquisa = driver.findElement(By.cssSelector("img[alt='Camiseta Manga Curta com Estampa da Sakura hover']")).getText();
        System.out.println(resultadoPesquisa);
        //resultado = resultado.toLowerCase();

        if(resultadoPesquisa.contains("Camiseta")){
            System.out.println("Sucesso");
        }else{
            System.out.println("Erro na pesquisa");
        }
        //Thread.sleep(300);
        // driver.quit();




    }
    @After
    public void encerrar()throws Exception{
        driver.quit();
    }




}



