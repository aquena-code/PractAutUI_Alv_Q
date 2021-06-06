package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Click {
    public static void on(WebDriver webDriver, By locator){
        webDriver.findElement(locator).click();
    }

    public static void onAcceptAlert(WebDriver webDriver){
        webDriver.switchTo().alert().accept();
    }

    public static String  onSelectOption(WebDriver webDriver, By locator) {

        Select drop = new Select(webDriver.findElement(locator));
        drop.selectByVisibleText("Option 2");
        webDriver.findElement(locator).click();
        return drop.getFirstSelectedOption().getText();

    }

    public static String getStringDrop(WebDriver webDriver, By locator){
        Select drop = new Select(webDriver.findElement(locator));
        return drop.getFirstSelectedOption().getText();
    }
}