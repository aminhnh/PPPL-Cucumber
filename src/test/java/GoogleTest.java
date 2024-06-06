import org.example.ResultPage;
import org.example.SearchPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GoogleTest {
    WebDriver driver;
    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    @Test
    public void driverTestChrome() {
        // Buat objek dari halaman search
        SearchPage searchPage = new SearchPage(driver);

        // Masukkan query
        searchPage.setSearch_bar("Irokusui");
        searchPage.click_search();

        // Klik pencarian
        ResultPage resultPage = searchPage.click_search();

        // Assert
        Assertions.assertTrue(resultPage.getWebTitle().contains("Irokusui"));
    }
    @AfterAll
    public void cleanup() {
        driver.quit();
    }
}
