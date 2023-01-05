package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHeplper extends HelperBase {

    public SessionHeplper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        type(By.name("user"),username);
        type(By.name("pass"),password);
        click(By.cssSelector("input:nth-child(7)"));
    }
}
