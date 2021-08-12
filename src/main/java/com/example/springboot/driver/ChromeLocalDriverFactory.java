package com.example.springboot.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLocalDriverFactory {
    private ChromeOptions chromeOptions;

    ChromeLocalDriverFactory(ChromeOptions chromeOptions) {
        this.chromeOptions = chromeOptions;
    }

    WebDriver driver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
}
