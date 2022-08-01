package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    public WebDriver driver ;
    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    private By go=  By.cssSelector("a[class=\"ico-register\"]");
    
    private By gender=  By.id("gender-male");
    
    private By fName=  By.id("FirstName");

    private By lName=  By.id("LastName");

    private By day=  By.name("DateOfBirthDay");
    
    private By month=  By.name("DateOfBirthMonth");
    
    private By year=  By.name("DateOfBirthYear");
    
    private By email=  By.id("Email");
    
    private By company=  By.id("Company");

    private By password=  By.id("Password");

    private By confirmPassword=  By.id("ConfirmPassword");

    private By btn=  By.id("register-button");

    private By success=  By.className("result");

    private By logout=  By.cssSelector("a[href=\"/logout\"]");

    public void go(){
           driver.findElement(go).click();
       }
    
    public void gender(){
        driver.findElement(gender).click();
    }

    public void fName(String name){
        driver.findElement(fName).sendKeys(name);
    }
    
    public void lName(String name){
        driver.findElement(lName).sendKeys(name);
    }
    
    public void birthDate(){
        Select Day = new Select(driver.findElement(day));
        Day.selectByIndex(6);
        Select Month = new Select(driver.findElement(month));
        Month.selectByValue("12");
        Select Year = new Select(driver.findElement(year));
        Year.selectByValue("1997");
    }
    
    public void email(String mail){
        driver.findElement(email).sendKeys(mail);
    }
    
    public void company(){
        driver.findElement(company).sendKeys("Test Company");
    }
    
    public void password(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    
    public void confirmPassword(String confirm){
        driver.findElement(confirmPassword).sendKeys(confirm);
    }
    
    public void btn(){
        driver.findElement(btn).sendKeys(Keys.ENTER);
    }
    
    public String success(){
        return driver.findElement(success).getText();
    }
    
    public void logout(){
         driver.findElement(logout).click();
    }

}
