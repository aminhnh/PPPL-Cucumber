package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ResultPage;
import org.example.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchStep {
    WebDriver driver;
    SearchPage searchPage;
    ResultPage resultPage;
    public void setup() {
        driver = new ChromeDriver();
    }
    public void cleanup() {
        driver.quit();
    }
    @Given("user is on the search page")
    public void user_is_on_the_search_page() {
        setup();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        searchPage = new SearchPage(driver);
    }
    @When("user search a valid query")
    public void user_search_a_valid_query() {
        searchPage.setSearch_bar("Irokusui");
        resultPage = searchPage.click_search();
    }
    @Then("user should be redirected to the result page")
    public void user_should_be_redirected_to_the_result_page() {
        Assertions.assertTrue(resultPage.getWebTitle().contains("Irokusui"));
        cleanup();
    }
}
