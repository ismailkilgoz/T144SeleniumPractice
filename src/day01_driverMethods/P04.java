package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {

    public static void main(String[] args) {

        // 1-Driver oluşturalim
        // 2-Java class’imiza chnomedriver.exe i tanitalim
        System.setProperty("webdriver.chrome.driver","dosyalar/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 3-Driver’in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();

        // 4-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklesini
        // söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        // 5-“https://www.google.com” adresine gidelim
        driver.get("https://www.google.com");

        // 6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String exceptedTitle = driver.getTitle();
        String exceptedUrl = driver.getCurrentUrl();

        // 7-Title’ın  ve url inin Google kelimesinin içerip icermedigini kontrol edelim
        if (exceptedTitle.contains("Google") && exceptedUrl.contains("Google")){
            System.out.println("Google test PASSED");
        }else System.out.println("Google test FAILED");

        // 8-Ardindan “https://wisequarter.com/” adresine gidip
        driver.navigate().to("https://wisequarter.com/");

        // 9-Bu adresin basligini alalim ve “Quarter” kelimesini icenip icermedigini kontrol edelim
        String quarterTitle = driver.getTitle();

        if (quarterTitle.contains("Quarter")){
            System.out.println("WiseQuarter test PASSED");
        }else System.out.println("WiseQuarter test FAILED");

        // 10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();

        // 11-Sayfayı yenileyelim
        driver.navigate().refresh();

        // 12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().back();
        driver.close();

        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
    }
}
