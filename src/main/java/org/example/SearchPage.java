package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage {
    WebDriver driver;
    // Locator
    By search_bar = new By.ById("APjFqb");
    //By button = new By.ById("btnK");
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setSearch_bar(String query) {
        driver.findElement(search_bar).sendKeys(query);
    }
    public ResultPage click_search() {
        driver.findElement(search_bar).submit();
        return new ResultPage(driver);
    }
}