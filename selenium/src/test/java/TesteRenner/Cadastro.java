package TesteRenner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Cadastro {
    WebDriver driver;
    private Object page;

    @Before
    public void iniciar()throws Exception {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.lojasrenner.com.br");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void Login() throws InterruptedException {
        WebElement botaoLogin = driver.findElement(By.className("user-nav"));
        botaoLogin.click();

        driver.findElement(By.xpath("input[name='login']")).sendKeys("teste@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        Thread.sleep(10000);

        WebElement botaoEntrar = driver.findElement(By.xpath("//button[normalize-space()='ENTRAR']"));
        botaoEntrar.click();


    }
}

