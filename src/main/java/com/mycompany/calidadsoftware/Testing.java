
package com.mycompany.calidadsoftware;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;   
import java.awt.AWTException;

public class Testing {
      
    // Atributos del testing de registro de usuario
    static WebDriver driver;
     By singUpBtonHomepage = By.id("signin2");
     By singUpLabel = By.id("signInModalLabel");
     By singUpUserNamefield = By.id("sign-username");
     By singUpUserPasswordfield = By.id("sign-password");
     By singUpBtonSingup = By.cssSelector("#signInModal .btn-primary");
      
     //Elementos testing cart 
     By elementBtonAddTOCart = By.linkText("Add to cart");
     By elementBtonDeletefromCart = By.linkText("Delete"); 
     
     //Elementos testing compra
     By elementBtonPlaceOrder = By.cssSelector(".btn-success");
     By elementFieldOrderName = By.id("name");
     By elementFieldOrderContry = By.id("country"); 
     By elementFieldOrderCity = By.id("city"); 
     By elementFieldOrderCreditCard = By.id("card"); 
     By elementFieldOrderMonth = By.id("month");  
     By elementFieldOrderYear= By.id("year");  
     By elementBtonCreateOrder = By.cssSelector("#orderModal .btn-primary");
     By elementBtonConfirmOrder = By.cssSelector(".confirm");
     
     //Elementos AboutUs
     By startBigVideoBton = By.cssSelector(".vjs-poster");
     By startVideoBton = By.id("example-video_html5_api");
     By closeVideoBton = By.cssSelector("#videoModal .btn");
     
     //Atributos del testing de opcion Contact
     By elementContactEmailField = By.id("recipient-email");
     By elementContactNameField = By.id("recipient-name");
     By elementContactMessageField = By.id("message-text");
     By singUpBtonSendMessage = By.cssSelector("#exampleModal .btn-primary");
     
     //Elementos del testing login
     By elementContactUsernameFieldLogin = By.id("loginusername");
     By elementContactPasswordFieldLogin = By.id("loginpassword");
     By loginBton = By.cssSelector("#logInModal .btn-primary");
     By closeLoginBton = By.cssSelector("#logInModal .btn-secondary");
     
     
     // Elementos del de home
     By elementBtonSamsungG = By.linkText("Samsung galaxy s6");
     By elementBtonNokiaLumia = By.linkText("Nokia lumia 1520");
     By elementBtonNexus6 = By.linkText("Nexus 6");
     By elementBtonIphone6 = By.linkText("Iphone 6 32gb");
     By elementBtonSonyXperia = By.linkText("Sony xperia z5");
     By elementBtonSonyVaio = By.linkText("Sony vaio i7");
     By elementBtonSamsugG7 = By.linkText("Samsung galaxy s7");
     
    
     //Categories
     By elementBtonMonitors = By.linkText("Monitors");
     By elementBtonLaptops = By.linkText("Laptops");
     By elementBtonPhones = By.linkText("Phones"); 
     
   
     //Botones previous and next Home
     
     By elementBtonNext = By.id("next2");
     By elementBtonPrevious = By.id("prev2");
     
     //Botones del Menu principal
     //Home Bton
     By elementBtonHome = By.cssSelector(".active > .nav-link");
     //Contact Bton
     By elementBtonContact = By.linkText("Contact"); 
     //About us Bton
     By elementBtonAboutUs = By.linkText("About us");
     //Cart Bton
     By elementBtonCart = By.id("cartur");
     //Login Bton
     By elementBtonLogin = By.id("login2");
     //LogOut Bton
     By elementBtonLogout = By.id("logout2");
     
     
    // metodo para tiempo de espera
         public void tiempoEspera(int tiempo){
         try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }  
     }
     
        public void registroUsuario(){
         
        System.setProperty("webdriver.chrome.driver", "/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");
        driver = new ChromeDriver();  
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
        driver.findElement(singUpBtonHomepage).click();
        tiempoEspera(5000);
        driver.findElement(singUpUserNamefield).sendKeys("newuserprueba2");
        driver.findElement(singUpUserPasswordfield).sendKeys("6060");
        driver.findElement(singUpBtonSingup).click();
        tiempoEspera(5000); 
        driver.quit();
    }
     
        public void testingHomeFuncionalidades(){
        System.setProperty("webdriver.chrome.driver", "/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");    
        driver = new ChromeDriver();  
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
        tiempoEspera(3000);  
        
        //entrar
        driver.findElement(elementBtonSamsungG).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);   
        
        //entrar
        driver.findElement(elementBtonNokiaLumia).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);
        
        //entrar
        driver.findElement(elementBtonNexus6).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);
        
        //entrar
        driver.findElement(elementBtonIphone6).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);
        
        //entrar
        driver.findElement(elementBtonSonyXperia).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);
        
        //entrar
        driver.findElement(elementBtonSonyVaio).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);
        
        //entrar
        driver.findElement(elementBtonSamsugG7).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);
        
        //Testing categoria Monitores
        driver.findElement(elementBtonMonitors).click();
        tiempoEspera(5000);
        //Testing categoria Laptops
        driver.findElement(elementBtonLaptops).click();
        tiempoEspera(5000);
        //Testing categoria Phones
        driver.findElement(elementBtonPhones).click();
        tiempoEspera(5000);
        
        //Next bton
        driver.findElement(elementBtonNext).click();
        tiempoEspera(8000);
        //Previous bton
        driver.findElement(elementBtonPrevious).click();
        tiempoEspera(5000);
        driver.quit();
        
        }
         
        public void testingContactOption(){
        System.setProperty("webdriver.chrome.driver", "/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");    
        driver = new ChromeDriver();  
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
        tiempoEspera(3000);    
            
        driver.findElement(elementBtonContact).click();
        tiempoEspera(3000);
     
      driver.findElement(elementContactEmailField).sendKeys("Fake email");
      tiempoEspera(2000);
      driver.findElement(elementContactNameField).sendKeys("Testing Name");
      tiempoEspera(2000);
      driver.findElement(elementContactMessageField).sendKeys("Este mensaje es para testear la validación de datos");
      tiempoEspera(2000);
      driver.findElement(singUpBtonSendMessage).click();
      tiempoEspera(5000);
      driver.quit();
      
      
      }  
         
       public void testingAboutUS(){
        System.setProperty("webdriver.chrome.driver", "/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");    
        driver = new ChromeDriver();  
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
        tiempoEspera(3000);     
          
        driver.findElement(elementBtonAboutUs).click();
        tiempoEspera(3000);  
        driver.findElement(startBigVideoBton).click();
        tiempoEspera(10000); 
        driver.findElement(startVideoBton).click();
        tiempoEspera(3000); 
        driver.findElement(closeVideoBton).click();
        tiempoEspera(2000);
        driver.quit(); 
           
           
       }
               
        public void testingLogin() {
        System.setProperty("webdriver.chrome.driver", "C/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");    
        driver = new ChromeDriver();  
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
        tiempoEspera(3000);     
        
        driver.findElement(elementBtonLogin).click();
        tiempoEspera(3000);
        
        driver.findElement(elementContactUsernameFieldLogin).sendKeys("TESTINGSELENIUM2022FAKEUSER");
        tiempoEspera(2000);
        driver.findElement(elementContactPasswordFieldLogin).sendKeys("TESTINGSELENIUM2022FAKEUSERPASSWORD");
        tiempoEspera(2000);
        driver.findElement(loginBton).click();
        tiempoEspera(5000);
        //ROBOT para precionar la tecla Enter y aceptar el cuadro de texto que selenium no puede reconocer.
        try{
          Robot robotkey = new Robot();
        robotkey.keyPress(KeyEvent.VK_ENTER);
        robotkey.keyRelease(KeyEvent.VK_ENTER);  
        }catch(Exception e){
            e.printStackTrace();
        }
        tiempoEspera(2000);
        driver.findElement(closeLoginBton).click();
        tiempoEspera(2000);
        
        driver.findElement(elementBtonLogin).click();
        tiempoEspera(3000);
        driver.findElement(elementContactUsernameFieldLogin).clear();
        driver.findElement(elementContactUsernameFieldLogin).sendKeys("Sommers1998");
        tiempoEspera(2000);
        driver.findElement(elementContactPasswordFieldLogin).clear();
        driver.findElement(elementContactPasswordFieldLogin).sendKeys("9098");
        tiempoEspera(2000);
        driver.findElement(loginBton).click();
        tiempoEspera(5000);
        driver.quit();

        }
        
        public void iniciarSesionYcerrarSesion(){
        System.setProperty("webdriver.chrome.driver", "/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");    
        driver = new ChromeDriver();  
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
        tiempoEspera(3000);     
        
        driver.findElement(elementBtonLogin).click();
        tiempoEspera(3000);    
        
        driver.findElement(elementContactUsernameFieldLogin).sendKeys("Sommers1998");
        tiempoEspera(2000);
        driver.findElement(elementContactPasswordFieldLogin).sendKeys("9098");
        tiempoEspera(2000);
        driver.findElement(loginBton).click();
        tiempoEspera(5000);
        driver.findElement(elementBtonLogout).click();
        tiempoEspera(5000);
        driver.quit();  
        }
        
        
        public void testingCart(){
        System.setProperty("webdriver.chrome.driver", "C/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");    
        driver = new ChromeDriver();  
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
        tiempoEspera(3000);  
        
        driver.findElement(elementBtonCart).click();
        tiempoEspera(3000);  
        driver.findElement(elementBtonHome).click();
        tiempoEspera(2000);
        
        //entrar
        driver.findElement(elementBtonSamsungG).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonAddTOCart).click();
        tiempoEspera(3000);
         //ROBOT para precionar la tecla Enter y aceptar el cuadro de texto que selenium no puede reconocer.
        try{
          Robot robotkey = new Robot();
        robotkey.keyPress(KeyEvent.VK_ENTER);
        robotkey.keyRelease(KeyEvent.VK_ENTER);  
        }catch(Exception e){
            e.printStackTrace();
        }
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);   
        
        //entrar
        driver.findElement(elementBtonNokiaLumia).click();
        tiempoEspera(3000);
         driver.findElement(elementBtonAddTOCart).click();
        tiempoEspera(3000);
         //ROBOT para precionar la tecla Enter y aceptar el cuadro de texto que selenium no puede reconocer.
        try{
          Robot robotkey = new Robot();
        robotkey.keyPress(KeyEvent.VK_ENTER);
        robotkey.keyRelease(KeyEvent.VK_ENTER);  
        }catch(Exception e){
            e.printStackTrace();
        }
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);
        driver.findElement(elementBtonCart).click();
        tiempoEspera(3000);  
        driver.findElement(elementBtonDeletefromCart).click();
        tiempoEspera(8000);
        driver.quit();
        }
        
        
        public void testingCompra(){
            
        System.setProperty("webdriver.chrome.driver", "/Users/pamelazumbado/Documents/Calidad/Demo2/chromedriver");    
        driver = new ChromeDriver();  
        driver.get("http://opencart.abstracta.us/");
        driver.manage().window().maximize();
        tiempoEspera(3000);  
        
        driver.findElement(elementBtonCart).click();
        tiempoEspera(3000);  
        driver.findElement(elementBtonHome).click();
        tiempoEspera(2000);
        
        //entrar
        driver.findElement(elementBtonSamsungG).click();
        tiempoEspera(3000);
        driver.findElement(elementBtonAddTOCart).click();
        tiempoEspera(3000);
         //ROBOT para precionar la tecla Enter y aceptar el cuadro de texto que selenium no puede reconocer.
        try{
          Robot robotkey = new Robot();
        robotkey.keyPress(KeyEvent.VK_ENTER);
        robotkey.keyRelease(KeyEvent.VK_ENTER);  
        }catch(Exception e){
            e.printStackTrace();
        }
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);   
        
        //entrar
        driver.findElement(elementBtonNokiaLumia).click();
        tiempoEspera(3000);
         driver.findElement(elementBtonAddTOCart).click();
        tiempoEspera(3000);
         //ROBOT para precionar la tecla Enter y aceptar el cuadro de texto que selenium no puede reconocer.
        try{
          Robot robotkey = new Robot();
        robotkey.keyPress(KeyEvent.VK_ENTER);
        robotkey.keyRelease(KeyEvent.VK_ENTER);  
        }catch(Exception e){
            e.printStackTrace();
        }
        driver.findElement(elementBtonHome).click();
        //salir
        tiempoEspera(3000);
        driver.findElement(elementBtonCart).click();
        tiempoEspera(3000);     
        
       driver.findElement(elementBtonPlaceOrder).click();
       tiempoEspera(2000);
       driver.findElement(elementFieldOrderName).sendKeys("testing");
       driver.findElement(elementFieldOrderContry).sendKeys("testing");     
       driver.findElement(elementFieldOrderCity).sendKeys("testing");   
       driver.findElement(elementFieldOrderCreditCard).sendKeys("testing");
       driver.findElement(elementFieldOrderMonth).sendKeys("testing");
       driver.findElement(elementFieldOrderYear).sendKeys("testing");
       tiempoEspera(5000);
       driver.findElement(elementBtonCreateOrder).click();
       tiempoEspera(2000);
       driver.findElement(elementBtonConfirmOrder).click();
       tiempoEspera(5000);
       driver.quit();
    
            
        }
        
}      
        
