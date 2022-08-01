package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    public WebDriver driver ;
    
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addProduct= By.xpath("//div/button[@id=\"add-to-cart-button-4\"]");
    
    private By addedSuccessfully= By.cssSelector("p[class=\"content\"]");
    
    private By open= By.cssSelector("a[href=\"/cart\"]");
    
    private By changeQuantity= By.xpath("//td[@class=\"quantity\"]/input[@class=\"qty-input\"] ");
    
    private By delete= By.xpath("//table[@class=\"cart\"]/tbody/tr/td[@class=\"remove-from-cart\"]/button");
    
    private By assertT= By.cssSelector("div[class=\"no-data\"]");

    public void addProduct() {
        driver.findElement(addProduct).click();
    }
    
    public String addedSuccessfully() {
        return driver.findElement(addedSuccessfully).getText();
    }
    
    public void open() {
        driver.findElement(open).click();
    }
    
    public void changeQuantity() {
        driver.findElement(changeQuantity).clear();
        driver.findElement(changeQuantity).click();
        driver.findElement(changeQuantity).sendKeys("4");
    }
    
    public void delete() {
        driver.findElement(delete).click();
    }
    
    public boolean assertT(String txt) {
        return driver.findElement(assertT).getText().contains(txt);
    }
}
