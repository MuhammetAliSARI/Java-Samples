package day01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resource/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
    }
}
