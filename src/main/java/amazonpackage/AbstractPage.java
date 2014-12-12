package amazonpackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


/**
 * Created by Sravan Bairu on 07/12/2014.
 */
public class AbstractPage extends BasePage {

    public void gotoLogin(){

       driver.findElement(By.className("ico-login")).click();
      }


    public void editShoppingCart() {

        driver.findElement(By.id("a-autoid-0-announce")).click();
    }




    public void gotoLink(){
        driver.findElement(By.linkText("product detail page")).click();
        driver.findElement(By.xpath("//html/body/div[2]/form/table[3]/tbody/tr[9]/td/div/span[1]/a")).click();
        //driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/div/div[2]/div[4]/div[5]/div/form/span/span/span/input")).click();

    }

    public void editQuantity() {
        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(By.id("a-autoid-2-announce"))).perform();
        driver.findElement(By.id("dropdown1_3")).click();
    }

    public void editQuantity1() {
        Actions act1 = new Actions(driver);
        act1.doubleClick(driver.findElement(By.id("a-autoid-2-announce"))).perform();
        driver.findElement(By.id("dropdown1_1")).click();
    }



//    public void login(String username, String password)
//    {
//
//        gotoLogin();
//        driver.findElement(By.id("Email")).sendKeys(username);
//        driver.findElement(By.id("Password")).sendKeys(password);
//        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//
//     }

    public void gotoShoppingcart(){

        driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
    }


}





