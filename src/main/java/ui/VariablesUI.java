package ui;

import org.openqa.selenium.By;

public class VariablesUI {
    /*Variables para TestDropDown*/
    public static By dropDown = By.xpath("//a[.='Dropdown']");
    public static By dropDown2 = By.id("dropdown");

    /*Variables para TestNotificationMessage*/
     public static By notMsg = By.xpath("//a[.='Notification Messages']");
     public static By clickHere = By.xpath("//a[.='Click here']");
     public static By alertMsg = By.id("flash");
     public static String beforeMsg = "";
     public static String afterMsg = "";
}
