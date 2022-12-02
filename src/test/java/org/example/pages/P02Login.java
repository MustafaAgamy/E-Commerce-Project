package org.example.pages;

import org.example.stepDefintions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02Login {

    public P02Login()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "ico-login")
    public WebElement loginLink;

    @FindBy(className = "email")
    public WebElement emailEL;

    @FindBy(className = "password")
    public WebElement passwordEl;

    @FindBy(className = "login-button")
    public WebElement loginBtn;

    public void loginSteps(String email, String password)
    {
        emailEL.sendKeys(email);
        passwordEl.sendKeys(password);
    }

    @FindBy(className = "ico-account")
    public WebElement myAccountEl;

    @FindBy(className = "message-error")
    public  WebElement errorMsg;

}

