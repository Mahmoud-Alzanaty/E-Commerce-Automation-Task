package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class Currencies {

    public WebDriver driver ;
    
    public Currencies(WebDriver driver) {
        this.driver = driver;
    }

    private By go=  By.xpath("//div[@class=\"currency-selector\"]");
    
    private By change=  By.xpath("//select [@id=\"customerCurrency\"]");

    private By newcurrency = By.className("prices");

    public void go() {
         driver.findElement(go).click();
    }

    public WebElement change() {
       return driver.findElement(change);
    }

    public List<String> changedCurrency() {

        List<WebElement> listOfElements = driver.findElements(newcurrency);
        List<String> arrlist = new ArrayList<String>();
        Vector<String> v = new Vector<String>();

        for (int i = 0; i < listOfElements.size(); i++) {
             v.add(listOfElements.get(i).getText());
            Enumeration<String> e = v.elements();
            arrlist = Collections.list(e);

        }

        return arrlist;

    }
    
}
