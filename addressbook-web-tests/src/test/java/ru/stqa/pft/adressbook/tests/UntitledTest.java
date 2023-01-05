package ru.stqa.pft.adressbook.tests;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest extends TestBase {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Test
  public void untitled() {
    driver.get("http://localhost/addressbook/");
    //app.getContactHelper().initContactCreation();
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("test1");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("test2");
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("nickname")).sendKeys("test3");
    driver.findElement(By.name("theform")).click();
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys("88005553535");
    driver.findElement(By.cssSelector("input:nth-child(87)")).click();
  }


}