package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.VariablesUI;

public class DropDown {
    public static String as(WebDriver driver) {
        String opcionSeleccionada;
        Click.on(driver, VariablesUI.dropDown);
        Click.on(driver, VariablesUI.dropDown2);
        opcionSeleccionada = Click.onSelectOption(driver, VariablesUI.dropDown2);
        return opcionSeleccionada;
    }

}