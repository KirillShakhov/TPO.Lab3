package org.example.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.example.Utils;

public class Header extends Page {

    public Header(WebDriver driver) {
        super(driver);
    }

    public void goToAccount() {
        Utils.getElementBySelector(driver, By.xpath(".//div[@id='main']/div/div[2]/a[2]/strong")).click();
        Utils.getElementBySelector(driver, By.xpath(".//div[@id='main']/div/div[2]/div/ul/li/ul/li/a")).click();
        Utils.waitUntilPageLoads(driver, 10);
    }

    public void goToFiles() {
        Utils.getElementBySelector(driver, By.xpath(".//*[@id=\"main\"]/div[1]/ul/li[2]/a")).click();
        Utils.waitUntilPageLoads(driver, 10);
    }
}

