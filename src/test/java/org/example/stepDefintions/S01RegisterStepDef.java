package org.example.stepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01Register;
import org.testng.asserts.SoftAssert;

public class S01RegisterStepDef {

    P01Register p01Register = new P01Register();
    SoftAssert soft = new SoftAssert();


    @Given("user go to register page")
    public void navigateRegister() throws InterruptedException {
        p01Register.registerLink.click();
        Thread.sleep(2000);

    }

    @When("user select gender type")
    public void userSelectGenderType() throws InterruptedException {
        p01Register.genderSelect.click();
        Thread.sleep(2000);

    }

    @And("user enter first name {string} and last name {string}")
    public void firstAndlastNames(String firstName, String lastName) throws InterruptedException {
        p01Register.firstLastNames(firstName,lastName);
        Thread.sleep(2000);

    }

    @And("user enter date of birth")
    public void dateOfBirth() throws InterruptedException {
        p01Register.selectBirthInfo();
        Thread.sleep(2000);
    }

    @And("user enter email field")
    public void userEnterEmailField() throws InterruptedException {
        p01Register.emailEL.sendKeys("mustafaagamy1990@gmail.com");
        Thread.sleep(2000);
    }

    @And("user fills Password fields {string} {string}")
    public void fillPassword(String password, String passwordConf) throws InterruptedException {
        p01Register.passwordAndConf(password,passwordConf);
        Thread.sleep(2000);
    }

    @And("user clicks on register button")
    public void clickRegBtn() throws InterruptedException {
        p01Register.regBtnEl.click();
        Thread.sleep(3000);
    }

    @Then("success message is displayed")
    public void successMessage()
    {
        //Assertions
        soft.assertTrue(p01Register.regMsgEl.isDisplayed());

        String expectedResult = "Your registration completed";
        String actualResult = p01Register.regMsgEl.getText();
        System.out.println("AssertionRegMsg");
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(actualResult.contains(expectedResult),true);
        String color = p01Register.regMsgEl.getCssValue("color");
        System.out.println("color "+color);
        soft.assertEquals("rgba(76, 177, 124, 1)".equals(color),true);
        System.out.println("AssertionRegMsgColor");

        soft.assertAll();
    }


}
