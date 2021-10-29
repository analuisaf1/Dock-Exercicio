package TesteRenner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaleConosco {
    WebDriver driver;
    @Before
    public void iniciar()throws Exception {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lojasrenner.com.br");


    }

    @Test
    public void verificarSocial() throws InterruptedException {
        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement botaoInstagram = driver.findElement(By.xpath("//i[@class='ic-instagram']"));
        botaoInstagram.click();
        WebElement botaoPinterest = driver.findElement(By.xpath("///i[@class='ic-pinterest']"));
        botaoPinterest.click();
        WebElement botaoYoutube = driver.findElement(By.xpath("//i[@class='ic-youtube']"));
        botaoYoutube.click();
        WebElement botaoFacebook = driver.findElement(By.xpath("//i[@class='ic-facebook']"));
        botaoFacebook.click();
        WebElement botaoTwitter= driver.findElement(By.xpath("//i[@class='ic-twitter']"));
        botaoTwitter.click();

    }



    @After
    public void encerrar()throws Exception{
        //driver.quit();
    }





}


