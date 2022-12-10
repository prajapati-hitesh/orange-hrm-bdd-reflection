package com.gtr.bdd.reflection.reflection.pages;

import com.gtr.bdd.reflection.driver.DriverFactory;
import com.gtr.bdd.reflection.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class OrangeHRMLoginPage {
    By loginLogo = By.xpath("//*[text()='Login']");

    public WebElement getLoginLogoElement() {
        return WaitHelper.waitUntilElementIsVisible(
                DriverFactory.getInstance().getDriver(),
                Duration.ofSeconds(90),
                loginLogo
        );
    }

}
