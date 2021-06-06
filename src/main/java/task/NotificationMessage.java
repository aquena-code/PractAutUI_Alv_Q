package task;

import actions.Click;
import actions.ReturnText;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class NotificationMessage {
    public static void as(WebDriver driver){

        Click.on(driver, VariablesUI.notMsg);
        VariablesUI.beforeMsg = ReturnText.getText(driver,VariablesUI.alertMsg);
        Click.on(driver, VariablesUI.clickHere);
        VariablesUI.afterMsg = ReturnText.getText(driver, VariablesUI.alertMsg);


    }


}
