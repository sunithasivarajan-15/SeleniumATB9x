package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test01 {
    @Test
    public void test_selenium01(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle());
}
}