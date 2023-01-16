package Steps;

import Base.BaseUtil;
import org.openqa.selenium.By;

public class EnvironmentStep extends BaseUtil{
    public static BaseUtil base;

    public EnvironmentStep(BaseUtil base) {
        EnvironmentStep.base = base;
    }

    public static void theUserProceedsToTheTestEnvironment() throws Throwable{
        EnvironmentStep.base.Driver.navigate().to("http://play.idealforliving.com/");
    }

    public static void theUserProceedsToSignUpPage() throws Throwable{

        //TO DO: Refactor this under NavigationDefinition
        EnvironmentStep.base.Driver.navigate().to("http://play.idealforliving.com/");

        //Clicking "Create Account" in Login Page to redirect to SignUp
        EnvironmentStep.base.Driver.findElement(By.linkText("Create Account")).click();
    }
}
