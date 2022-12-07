package TestCases;

import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_001 extends BaseClass {

    @Test
    public void logintest_001() throws InterruptedException {

        driver.get(baseURL);
        logger.info("User navigate to URl");


        LoginPage lp = new LoginPage(driver);
        Thread.sleep(2000);

        driver.manage().window().maximize();
        logger.info("User maximize the window");

        lp.clickLogintab();
        logger.info("User click login tab");


        lp.setEmail(username);
        logger.info("user enter email address");

        lp.setPassword(password);
        logger.info("User enter password");


        lp.clickLoginbutton();
        logger.info("User click on login button");


        if (driver.getTitle().equals("Cryptocurrency Prices, Charts, and Crypto Market Cap | CoinGecko")){
            Assert.assertTrue(true);
            logger.info("User navigate to correct page");

        }else{
            Assert.assertTrue(false);
            logger.info("User navigate to WRONG Page");

        }

    }
}
