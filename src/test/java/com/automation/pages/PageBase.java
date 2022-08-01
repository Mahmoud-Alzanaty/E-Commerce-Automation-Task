package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {
    protected WebDriver driver;
    public Select select;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage loginpage(){
        return new LoginPage(driver);
    }

    public Registration registrationPage(){
        return new Registration(driver);
    }

    public MyAccount myAccountPage(){
        return new MyAccount(driver);
    }

    public Search searchPage(){
        return new Search(driver);
    }

    public WishlistPage wishlistPage(){ return new WishlistPage(driver); }

    public FilterWithColor filterWithColorPage(){ return new FilterWithColor(driver); }

    public CategoriesPage categoriesPage(){ return new CategoriesPage(driver); }

    public Currencies currenciesPage(){ return new Currencies(driver); }

    public TagsPage tagsPage(){ return new TagsPage(driver); }

    public CompareList compareListPage(){ return new CompareList(driver); }

    public CartPage cartPage(){ return new CartPage(driver); }

    public Order orderPage(){ return new Order(driver); }

}
