package Utilities;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.File;

public class ReadConfig {

    Properties Pro;

    public ReadConfig(){

        File source = new File ("/Users/alanliew/Desktop/Automation/Selenium-Java/SeleniumWithoutCucumber/Configuration/config.properties");

        try{
            FileInputStream fis = new FileInputStream(source);
            Pro = new Properties();
            Pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is :" + e.getMessage());
        }
    }

    public String getCoingeckowebsite(){
        String coingecko = Pro.getProperty("url");
        return coingecko;
    }

    public String getEmailAddress(){
        String emailaddress = Pro.getProperty("email");
        return emailaddress;
    }

    public String getPassword(){
        String correctPassword = Pro.getProperty("password");
        return correctPassword;
    }
}
