
package com.mycompany.calidadsoftware;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.chrome.ChromeDriver;
public class CalidadSoftware {

    public static void main(String[] args) {
        System.setProperty (key:"webdriver.chrome.driver", value:"/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(duration:Duration.ofSeconds(5));
        driver.get(url:https://www.opencart.com/index.php?route=account/login);
    }
}
