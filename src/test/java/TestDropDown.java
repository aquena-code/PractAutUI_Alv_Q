import actions.Click;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.DropDown;


public class TestDropDown extends base{
    @Test
    public void selectDropDown(){
        String opcionSeleccionada;

        opcionSeleccionada = DropDown.as(webDriver);
        Assert.assertEquals(opcionSeleccionada, "Option 2");
    }
}
