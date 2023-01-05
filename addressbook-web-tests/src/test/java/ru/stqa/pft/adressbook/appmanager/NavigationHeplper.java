package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHeplper {
    private WebDriver driver;

    public NavigationHeplper(WebDriver driver) {
        this.driver = driver;
    }

    public void goToGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }
}