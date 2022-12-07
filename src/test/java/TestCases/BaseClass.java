package TestCases;

import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    ReadConfig rc = new ReadConfig();


    public String baseURL =rc.getCoingeckowebsite();
    public String username = rc.getEmailAddress();

    public String password = rc.getPassword();
    public static WebDriver driver;
    public static Logger logger;


    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        logger = Logger.getLogger("CoinGecko");
        PropertyConfigurator.configure("Log4j.properties");

    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
