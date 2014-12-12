package amazonpackage;

import org.openqa.selenium.By;

/**
 * Created by Sravan Bairu on 07/12/2014.
 */
public class SearchResultPage extends AbstractPage {

    public void addItem(){

        driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[4]/div[2]/div/div[4]/div[1]/div/ul/li[3]/div/div/div/div[2]/div[1]/a/h2")).click();
        driver.findElement(By.id("bb_atc_button")).click();

    }

}
