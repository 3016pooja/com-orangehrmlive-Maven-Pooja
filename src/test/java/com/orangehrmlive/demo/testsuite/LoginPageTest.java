package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
  LoginPage loginPage=new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername();//	Enter “Admin” username
        loginPage.enterPassword();       // Enter “admin123“ password
        loginPage.clickOnLoginButton();// 	lick on ‘LOGIN’ button
        loginPage.verifyTheTextDashboard();//Verify the ‘Dashboard’ text is display
        Assert.assertEquals(loginPage.verifyTheTextDashboard(),"Dashboard","Error message not displayed");

    }
    @Test
    public void  userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPage.clickOnForgotPassword();

        loginPage.verifyTextResetPassword();  //verify the text 'Reset Password'
        Assert.assertEquals(loginPage.verifyTextResetPassword(),"Reset Password","Error message not displayed");

    }


}
