package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Order {

    public WebDriver driver ;
    
    public Order(WebDriver driver) {
        this.driver = driver;
    }

    private By addProduct= By.xpath("//div/button[@id=\"add-to-cart-button-4\"]");
    
    private By open= By.cssSelector("a[href=\"/cart\"]");

    private By acceptTerms= By.xpath("//div/input[@ id=\"termsofservice\"]");

    private By checkout= By.xpath("//div/button[@id=\"checkout\"]");

    private By country= By.cssSelector("select[id=\"BillingNewAddress_CountryId\"]");

    private By city= By.cssSelector("input[id=\"BillingNewAddress_City\" ]");

    private By address= By.cssSelector("input[id=\"BillingNewAddress_Address1\" ]");

    private By zipCode= By.cssSelector("input[id=\"BillingNewAddress_ZipPostalCode\" ]");

    private By phoneNumber= By.cssSelector("input[id=\"BillingNewAddress_PhoneNumber\" ]");
    
    
    private By addressBtn= By.xpath("//div/button[@class=\"button-1 new-address-next-step-button\"] ");
    
    private By shippingMethod= By.xpath("//div/button[@class=\"button-1 shipping-method-next-step-button\"] ");
    
    private By paymentMethod= By.xpath("//div/button[@class=\"button-1 payment-method-next-step-button\"] ");
    
    private By paymentInfo= By.xpath("//div/button[@class=\"button-1 payment-info-next-step-button\"] ");
    
    private By confirmOrder= By.xpath("//div/button[@class=\"button-1 confirm-order-next-step-button\"] ");
    
    private By orderCreatedSuccessfully= By.cssSelector("div[class=\"section order-completed\"]");

    public void addProduct() {
        driver.findElement(addProduct).click();
    }

    public void open() {
        driver.findElement(open).click();
    }

    public void acceptTermsen() {
        driver.findElement(acceptTerms).click();
    }

    public void checkout() {
        driver.findElement(checkout).click();
    }

    public void country(String x) {
        driver.findElement(country).sendKeys(x);
    }

    public void city(String x) {
        driver.findElement(city).sendKeys(x);
    }

    public void address(String x) {
        driver.findElement(address).sendKeys(x);
    }

    public void zipCode(String x) {
        driver.findElement(zipCode).sendKeys(x);
    }

    public void phoneNumber(String x) {
        driver.findElement(phoneNumber).sendKeys(x);
    }

    public void addressBtn() {
        driver.findElement(addressBtn).click();
    }

   
    public void confirmOrder() {
        driver.findElement(shippingMethod).click();
        driver.findElement(paymentMethod).click();
        driver.findElement(paymentInfo).click();
        driver.findElement(confirmOrder).click();
    }

    public String orderCreatedSuccessfully() {
        return driver.findElement(orderCreatedSuccessfully).getText();
    }

}
