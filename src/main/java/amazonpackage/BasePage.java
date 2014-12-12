package amazonpackage;




import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sravan Bairu 07/12/2014.
 */
public class BasePage {

    public static WebDriver driver;


    @BeforeClass

    public static void startTest()
    {
        driver =BrowseFactory.getThisDriver();
        driver.get("http://www.amazon.co.uk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void stopTest()
    {

        driver.quit();
    }

}
