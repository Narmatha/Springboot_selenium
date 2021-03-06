package com.example.springboot.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbPage {

    private WebDriver driver;

    public AbPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='content']/div/h3")
    private WebElement titleAbPage;

    @FindBy(linkText = "A/B Testing")
    private WebElement linkTextABTesting;

    public String getTextTitleAB() {
        return titleAbPage.getText();
    }

    public AbPage clickLinkABTesting(){
        driver.findElement(By.linkText("A/B Testing")).click();;
       // linkTextABTesting.click();
        return this;
    }
}
