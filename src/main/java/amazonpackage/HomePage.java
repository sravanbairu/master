package amazonpackage;

import org.openqa.selenium.By;

/**
 * Created by Sravan Bairu on 07/12/2014.
 */
public class HomePage extends AbstractPage {

    public void searchItem(String item)
    {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
        driver.findElement(By.xpath("//input[@class='nav-submit-input']")).click();


    }
}
