package amazonpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Sravan Bairu on 07/12/2014.
 */
public class RegisterPage extends AbstractPage {

    public void registerUser(String email, String name, String pwd) {

        driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[3]/form/div/div[6]/span[1]/input")).isEnabled();
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.id("signInSubmit-input")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys(name);
        driver.findElement(By.id("ap_email_check")).sendKeys(email);
        driver.findElement(By.id("ap_password")).sendKeys(pwd);
        driver.findElement(By.id("ap_password_check")).sendKeys(pwd);
        driver.findElement(By.id("continue-input")).click();
    }
    public void registerAddress (String name, String addLine, String addCity, String addRegion, String addPC, String addPh, String addGC){

        driver.findElement(By.id("enterAddressFullName")).sendKeys(name);
        driver.findElement(By.id("enterAddressAddressLine1")).sendKeys(addLine);
        driver.findElement(By.id("enterAddressCity")).sendKeys(addCity);
        driver.findElement(By.id("enterAddressStateOrRegion")).sendKeys(addRegion);
        driver.findElement(By.id("enterAddressPostalCode")).sendKeys(addPC);
        driver.findElement(By.id("enterAddressPhoneNumber")).sendKeys(addPh);
        Select dropdown = new Select(driver.findElement(By.xpath("//html/body/div[5]/div[2]/div[2]/div[1]/div/div[1]/div/form/div[3]/div/select")));
        dropdown.selectByIndex(1);
        driver.findElement(By.id("GateCode")).sendKeys(addGC);
        driver.findElement(By.cssSelector("input[value = '1']")).click();
        driver.findElement(By.id("addAnotherAddress")).click();
        driver.findElement(By.xpath("//html/body/div[5]/div[2]/div/div[2]/div[1]/div/div[1]/div/form/div[6]/span/span/input")).click();

    }
    public void regAdd(){
        driver.findElement(By.xpath("//html/body/div[4]/div[2]/form/div/div[2]/div/div/div/span/input")).click();

    }
    public void addDespatch(){

        driver.findElement(By.xpath("//html/body/div[5]/div/div/div[2]/div[1]/form/div[1]/div[2]/div/span[1]/span/input")).click();
    }

    public void radioButtonInvoke() {

        driver.findElement(By.cssSelector("input[value = '1']")).click();
      }

}