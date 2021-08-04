import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\arthu\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://sso.certponto.com.br/auth?showforgotpassword=false&documenttypes=CPF&authtype=document&token=zYEPOa%2bxhdkd%2fXMKZWsdob2uQz7yn1uibfKaUWdhu7qsDsgIKUwhRUGa5CLKR4QmZFIwVMQCMKzCDOiJuEraSw%3d%3d");

      WebElement caixaCPF = driver.findElement(By.cssSelector("div.form-group:nth-child(3) > input:nth-child(1)"));
      caixaCPF.sendKeys("531-890-638-93");
        WebElement caixasenha = driver.findElement(By.cssSelector("input.ng-pristine"));
        caixasenha.sendKeys("teste");
        WebElement ok = driver.findElement(By.cssSelector(".btn"));
        ok.click();

       // WebElement clock = driver.findElement(By.cssSelector("div.row:nth-child(1) > div:nth-child(1) > a:nth-child(1) > input:nth-child(1)"));
        //clock.click();

    }

}
