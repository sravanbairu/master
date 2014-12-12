package amazonpackage;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Sravan Bairu on 07/12/2014.
 */

public class AmazonTestPage extends BasePage {
 //Test Data

    String item = "iphone 6";
    String itemindex = "Subtotal (3 items): ";
    String itemindex1 = "Subtotal (3 items):";
    String email = "usemyname1243477777@gmail.com";
    String name = "SSS Bairu";
    String pwd = "Sbairu1234";
    String addLine = "64 Caledon Road";
    String addRegion = "London";
    String addCity = "EastHam";
    String addPC = "E6 2HB";
    String addPh = "07737639708";
    String addGC = "1234";


    @Test
    public void e2ePayments() {
        HomePage homePage = new HomePage();
        homePage.searchItem(item);

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.addItem();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.editShoppingCart();
        shoppingCartPage.editQuantity();
          shoppingCartPage.verifyQ(itemindex);
        //shoppingCartPage.verifyQ(itemindex);

        //shoppingCartPage.compareQ(itemindex1);


        RegisterPage registerPage = new RegisterPage();
        registerPage.radioButtonInvoke();
        registerPage.registerUser(email, name, pwd);
        registerPage.registerAddress(name, addLine, addCity, addRegion, addPC, addPh,addGC);

        registerPage.regAdd();
        registerPage.addDespatch();


      }
}