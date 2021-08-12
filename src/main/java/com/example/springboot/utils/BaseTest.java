package com.example.springboot.utils;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import com.example.springboot.driver.DriverFactory;
import com.example.springboot.page.AbPage;
import com.example.springboot.page.AddRemoveElementsPage;
import com.example.springboot.page.BasicAuthPage;
import com.example.springboot.page.WelcomePage;
import com.example.springboot.report.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


import static com.example.springboot.utils.PropertyLoader.returnConfigValue;

@Listeners({ExtentITestListenerClassAdapter.class, ReportListener.class})
public abstract class BaseTest {

    protected static WebDriver driver;
    protected WelcomePage welcomePage;
    protected AbPage abPage;
    protected AddRemoveElementsPage addRemoveElementsPage;
    protected BasicAuthPage basicAuthPage;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void preCondition() {
        driver = new DriverFactory().createInstance();
        driver.manage().window().maximize();
        driver.get(returnConfigValue("url.base"));
        welcomePage = new WelcomePage(driver);
        abPage = new AbPage(driver);
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
        basicAuthPage = new BasicAuthPage(driver);
    }

    @AfterMethod
    public void postCondition(){
        driver.quit();
    }
}
