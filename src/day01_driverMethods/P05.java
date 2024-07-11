package day01_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","dosyalar/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://babayigit.net/test/ adresine gidip adres çubuğuna
        driver.get("https://babayigit.net/test/");

        // 1-Vizontele aratıp sonuç sayısını yazdırın
        driver.findElement(By.id("search")).sendKeys("Vizontele", Keys.ENTER);

        driver.findElement(By.id("hdtb-tls")).click();
        WebElement stats = driver.findElement(By.id("result-stats"));
        String str= stats.getText();
        System.out.println("Vizontele icin "+str);

        // 2-12 Angry men aratıp sonuç sayısını yazdırın
        driver.navigate().back();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("12 Angry men");

        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.id("hdtb-tls")).click();

        WebElement stats2 = driver.findElement(By.id("result-stats"));
        System.out.println("12 Angry men icin "+stats2.getText());

        // 3-Saving Private Ryan aratıp sonuç sayısını yazdırın
        driver.navigate().back();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("Saving Private Ryan"+Keys.ENTER);

        driver.findElement(By.id("hdtb-tls")).click();
        WebElement stats3 = driver.findElement(By.id("result-stats"));
        System.out.println("Saving Private Ryan icin "+stats3.getText());

        // 4-3 Idiots aratıp sonuç sayısını yazdırın
        driver.navigate().back();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("3 Idiots", Keys.ENTER);

        driver.findElement(By.id("hdtb-tls")).click();
        WebElement stats4 = driver.findElement(By.id("result-stats"));
        System.out.println("3 Idiots icin "+stats4.getText());

         Thread.sleep(3000);
         driver.quit();
    }
}
