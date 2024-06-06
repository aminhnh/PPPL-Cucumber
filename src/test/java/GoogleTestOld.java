import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleTestOld {
    @Test
    public void driverTestChrome() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



        driver.quit();
    }
    @Test
    public void driverTestChromeOld() {
        WebDriver driver = new ChromeDriver();

//        Ini perlu v4.11 kebawah:
//        System.setProperty("webdriver.chrome.driver", "resources/");

        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);

        // Cari element, interaksi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // Beri delay untuk load
        WebElement search_bar = driver.findElement(By.id("APjFqb"));
        search_bar.sendKeys("Irokousui");
        WebElement button = driver.findElement(By.name("btnK"));
        button.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Beri delay untuk load
        WebElement link = driver.findElement(By.xpath("//*[@id=\"hdtb-sc\"]/div/div/div[1]/div/div[3]/a"));
        link.click();

//        search_bar.submit();
        // Assert

//        driver.quit();
    }
    @Test
    public void driverTestChromeYoutube() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // Beri delay untuk load
//        WebElement search_bar = driver.findElement(By.id("search"));
        WebElement search_bar = driver.findElement(By.xpath("//*[@id=\"search\"]"));
        search_bar.sendKeys("Irokousui");
        search_bar.submit();

//        driver.quit();
    }
    public void driverTestFirefox() {

    }
}
