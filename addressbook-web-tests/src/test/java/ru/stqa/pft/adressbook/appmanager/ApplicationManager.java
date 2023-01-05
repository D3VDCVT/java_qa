package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {

    protected WebDriver driver;
    private  SessionHeplper sessionHeplper;
    private  NavigationHeplper navigationHeplper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    JavascriptExecutor js;
    private Map<String, Object> vars;

    public void init() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(driver);
        navigationHeplper = new NavigationHeplper(driver);
        sessionHeplper = new SessionHeplper(driver);
        contactHelper = new ContactHelper(driver);
        sessionHeplper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHeplper getNavigationHeplper() {
        return navigationHeplper;
    }

    public ContactHelper getContactHelper() { return contactHelper;}
}
