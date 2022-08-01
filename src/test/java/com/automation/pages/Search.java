package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

    public WebDriver driver ;
    public Search(WebDriver driver) {
        this.driver = driver;
    }

    private By clickField=  By.id("small-searchterms");
    
    private By typing=  By.id("small-searchterms");

    private By product = By.className("product-item");

    private By result=  By.cssSelector("h2[class=\"product-title\"] a");

    private By searchBtn=  By.cssSelector("button[class=\"button-1 search-box-button\"]");

    private By advanced_search=  By.xpath("//div/input[@id=\"advs\"]");

    private By choose_category=  By.xpath("//div/select[@id=\"cid\"]");

    private By choose_manufacturer=  By.xpath("//div/select[@id=\"mid\"]");

    private By advanceBtn=  By.cssSelector("button[class=\"button-1 search-button\"]");

    private By SKU = By.className("sku");

    public void clickField() {
        driver.findElement(clickField).click();
    }

    public void typing() {
        driver.findElement(typing).sendKeys("book");
    }
    public void typing2() {
        driver.findElement(typing).sendKeys("AP_MBP_13");
    }
    int count;
    public  int result() {
        count = driver.findElements(result).size();
        return count;
    }

    public  boolean assertT() {
        boolean temp = true;
        for (int x = 0; x < count; x++) {
          temp = driver.findElements(result).get(x).getText().toLowerCase().contains("book");
        }
        return temp;
    }

    public void selectProduct() {
        driver.findElement(product).click();
    }

    public String itemSKU(){
        String sku = driver.findElement(SKU).getText();
        return sku;
    }
    public void searchBtn() {
        driver.findElement(searchBtn).click();
    }

    public void advanced_search() {
        driver.findElement(advanced_search).click();
    }

    public WebElement choose_category() {
        return driver.findElement(choose_category);
    }

    public WebElement choose_manufacturer() {
        return driver.findElement(choose_manufacturer);
    }

    public void advanceBtn() {
        driver.findElement(advanceBtn).click();
    }

}
