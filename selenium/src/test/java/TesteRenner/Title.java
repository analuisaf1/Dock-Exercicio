package TesteRenner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Title {
    WebDriver driver;
    @Before
    public void iniciar()throws Exception {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lojasrenner.com.br");


    }
    @Test
    public void title() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.lojasrenner.com.br");
        Assert.assertEquals("Moda Feminina, Masculina, Infantil e Perfumes - Renner", driver.getTitle());
        //Thread.sleep(300);
        // driver.quit();

    }
}
