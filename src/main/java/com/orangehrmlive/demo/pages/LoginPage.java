package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

 By userNameField=By.name("username");
 By passwordField=By.name("password");
 By loginButton= By.xpath("//button[@type='submit']");

By verifyText=By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");
By forgotPassword=By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]");
    By verifyText1=By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/h6[1]");

    public void enterUsername(){
        sendTextToElement(userNameField,"Admin");// Enter “Admin” username
    }
public void enterPassword(){
        sendTextToElement(passwordField,"admin123"); // Enter “admin123“ password
}
public void clickOnLoginButton(){
        clickOnElement(loginButton); // 	click on ‘LOGIN’ button
}
public String verifyTheTextDashboard(){
       return getTextFromElement(verifyText);//Verify the ‘Dashboard’ text is display
}
    //click on the ‘Forgot your password’ link
    public void clickOnForgotPassword(){
        clickOnElement(forgotPassword);
    }

    public String verifyTextResetPassword(){
        return getTextFromElement(verifyText1);//verify the text 'Reset Password'
    }
}