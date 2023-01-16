package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//'extends' is for the dependency injection. This is how values from different classes can be passed and used.
//To be able to use the dependency injection, cucumber-picocontainer should be set in pom.xml
public class Hook extends BaseUtil {
    //Create a private variable
    private BaseUtil base;

    //Create a constructor. Shortcut key Alt + Insert.
    public Hook(BaseUtil base) {

        this.base = base;
    }

    //This is executed before each test
    @Before
    public void InitializeTest() {

        System.out.println("Opening browser: Chrome");

        //Preparing ChromeDriver so it can be used to open a URL
       System.setProperty("webdriver.chrome.driver","D:\\Offshorly\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
       base.Driver = new ChromeDriver();
    }

    //This is executed after each test
    @After
    public void TearDownTest (){
       base.Driver.close();
    }
}
