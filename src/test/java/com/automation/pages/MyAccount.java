package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyAccount {

    public WebDriver driver ;
    
    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }

    private By go=  By.cssSelector("a[class=\"ico-account\"]");
    
    private By changePass=  By.cssSelector("a[href=\"/customer/changepassword\"]");

    private By old=  By.id("OldPassword");

    private By newPass=  By.id("NewPassword");

    private By confirm=  By.id("ConfirmNewPassword");

    private By btn=  By.cssSelector("button[class=\"button-1 change-password-button\"]");

    private By asrt=  By.cssSelector("p[class=\"content\"]");

    public void go() {
        driver.findElement(go).click();
    }

    public void changePass() {
        driver.findElement(changePass).click();
    }

    public void old(String pass) {
        driver.findElement(old).sendKeys(pass);
    }

    public void newPass() {
        driver.findElement(newPass).sendKeys("Passw0rd@");
    }

    public void confirm() {
        driver.findElement(confirm).sendKeys("Passw0rd@");
    }

    public void btn(){
        driver.findElement(btn).sendKeys(Keys.ENTER);
    }

    public String asrt(){
       return driver.findElement(asrt).getText();
    }
}
