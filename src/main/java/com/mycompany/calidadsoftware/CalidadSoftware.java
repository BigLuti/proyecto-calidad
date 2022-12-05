
package com.mycompany.calidadsoftware;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class CalidadSoftware {

    public static void main(String[] args) {
        Testing proyecto = new Testing();
            proyecto.registroUsuario();  
            proyecto.testingHomeFuncionalidades(); 
            proyecto.testingContactOption();
            proyecto.testingAboutUS();
            proyecto.testingLogin();        
            proyecto.testingCart(); 
            proyecto.iniciarSesionYcerrarSesion();
            proyecto.testingCompra();     
    }
}
