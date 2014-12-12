package amazonpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Sravan Bairu on 07/12/2014.
 */
public class BrowseFactory {
    static WebDriver driver = null;

    public enum browserName {Firefox,IE,GoogleChrome}
    public static final browserName useThisBrowser = browserName.GoogleChrome;

    public static WebDriver getThisDriver()
    {
        if (driver==null)
        {
            switch(useThisBrowser)
            {
                case Firefox:
                    driver = new FirefoxDriver();break;

                case IE:

                    System.setProperty("webdriver.ie.driver","src/main/resources/drivers/IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    break;
                case GoogleChrome:

                    System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
           //C:\Users\Abhiram\workspace\AmazonNewTest\src\main\resources\drivers\IEDriverServer.exe
            }
        }
        return driver;
    }

}
