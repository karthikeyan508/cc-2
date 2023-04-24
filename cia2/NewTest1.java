package cia2;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
@Test()
 public void Test1() throws InterruptedException {
WebDriver driver;
WebDriverManager.chromedriver().setup();
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);
driver.get("https://www.trivago.in/");
driver.manage().window().maximize();
WebElement id=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[2]/div/div[1]/button[1]"));
id.click();
}
}
