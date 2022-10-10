
package simulacion1.proyectocalidad;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  

public class Testing {
    
static WebDriver driver;
public static void main(String[] args){

System.setProperty("webdriver.chrome.driver","C:\\Users\\Pamela\\Downloads\\chromedriver_win32");
driver = new ChromeDriver();
driver.get("http://opencart.abstracta.us/");
System.out.print("EL TITULO DE LA PAGINA ES"+ driver.getTitle());
}
}
    

