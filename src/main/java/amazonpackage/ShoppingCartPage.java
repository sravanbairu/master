package amazonpackage;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Sravan Bairu on 07/12/2014.
 */
public class ShoppingCartPage extends AbstractPage {
HomePage homePage;
    String item = "iphone 6";

    public String verifyQQ(){
        WebElement element = driver.findElement(By.xpath("//html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/form/div[3]/div[1]/div/div[1]/p/span/span[1]"));
        return element.getText();


    }
   
    public void verifyQ(String itemindex) {
        
       System.out.println(driver.findElement(By.cssSelector(".a-size-medium.a-text-bold>span")).getText());
        if (driver.findElement(By.cssSelector(".a-size-medium.a-text-bold>span")).getText()!=itemindex) {

                                        //html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/form/div[3]/div[1]/div/div[1]/p/span/span[1]

        do {
            int index=2;
            gotoLink();
            driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/div/div[2]/div["+index+"]/div[5]/div/form/span/span/span/input")).click();
           if(driver.findElement(By.cssSelector("#hlb-cart-itemcount-text")).getText().contains("3")){
        	   break;
           }
           else{
        	   editQuantity();
           }
            index++;
            } while (driver.findElement(By.xpath("html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/form/div[3]/div[2]/div/div[1]/p/span/span[1]")).getText() == itemindex);
        }
    }
    public boolean compareQ(String itemindex1) {
        gotoShoppingcart();
        System.out.println(driver.findElement(By.xpath("//html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/form/div[3]/div[1]/div/div[1]/p/span/span[1]")).getText());

        try {

            Assert.assertEquals(itemindex1, driver.findElement(By.xpath("//html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/form/div[3]/div[1]/div/div[1]/p/span/span[1]")).getText());
            System.out.println("both are same");
            return true;

        }
        catch (Error e) {
            System.out.println("both are not same");
            gotoLink();
            return false;
        }
    }
    public void checkout() {

        driver.findElement(By.xpath("//html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/form/div[3]/div[1]/div/div[3]/span/span/input")).click();
    }

}
