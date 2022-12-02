package org.example.pages;

import org.example.stepDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P01Register {

    public P01Register() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerLink;

    @FindBy(id = "gender-male")
    public WebElement genderSelect;

    @FindBy(id = "FirstName")
    public WebElement firstNameEl;

    @FindBy(id = "LastName")
    public WebElement lastNameEl;

    public void firstLastNames(String firstName, String lastName) {
        firstNameEl.sendKeys(firstName);
        lastNameEl.sendKeys(lastName);
    }

    public void selectBirthInfo() {
        WebElement birthDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(birthDay);
        select.selectByVisibleText("27");

        WebElement birthMonth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select select1 = new Select(birthMonth);
        select1.selectByVisibleText("July");


        WebElement birthYear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select select2 = new Select(birthYear);
        select2.selectByVisibleText("1995");
    }

    @FindBy(id = "Email")
    public WebElement emailEL;

    @FindBy(id = "Password")
    public WebElement passwordEL;

    @FindBy(id = "ConfirmPassword")
    public WebElement passwordConfEl;

    public void passwordAndConf(String password, String passwordConf) {
        passwordEL.sendKeys(password);
        passwordConfEl.sendKeys(passwordConf);
    }

    @FindBy(id = "register-button")
    public WebElement regBtnEl;

    @FindBy(className = "result")
    public WebElement regMsgEl;

}

