package com.practest;

import org.testng.annotations.AfterMethod;
import  org.testng.annotations.Test;
import com.apple.concurrent.Dispatch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.http.impl.client.SystemDefaultHttpClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import java.util.PriorityQueue;

public class PracticalTest {
        WebDriver driver;


        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.gecko.driver","/Users/shamimchy/Documents/selenium_server/geckodriver");
            driver = new FirefoxDriver();
            driver.get("http://www.google.com");
        }

    @Test (priority =  3)
    public  void mainTest(){
        String title  =  driver.getTitle();
        System.out.println(" Title3 "+ title);
       // driver.close();
    }

    @Test    (priority =  2)
    public  void mainTest2(){
        String title  =  driver.getTitle();
        System.out.println(" Title2 "+ title);

    }


    @Test  (priority =  1)
    public void testMainTest() {
        String title  =  driver.getTitle();
        System.out.println(" Title1 "+ title);
    }

    @AfterMethod
    public  void closebrowser(){
         driver.close();
    }

    }