import org.testng.Assert;
import org.testng.annotations.Test;
import task.NotificationMessage;
import ui.VariablesUI;

public class TestNotificationMessage extends base{
    @Test
    public void loadNewMessage(){
        NotificationMessage.as(webDriver);
        Assert.assertNotEquals(VariablesUI.beforeMsg,VariablesUI.afterMsg);

    }
}
