package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHeplper {
    private WebDriver driver;

    public SessionHeplper(WebDriver driver) {

        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }
}
