package test;
// ************TestNG'DE ÇALIŞTIR***************
// Bu örnek, Apache POI kütüphanesini kullanarak Excel verilerini okur
// ve Selenium WebDriver'ı kullanarak bir web sitesindeki ilgili alanlara veri girer.
// Öncelikle, Maven veya Gradle gibi bir bağımlılık yöneticisi kullanarak Apache POI
// ve Selenium WebDriver'ı projenize eklemeniz gerekmektedir.
// Aşağıda, bu iki bağımlılığı eklediğinizde kullanabileceğiniz bir örnek kod verilmiştir:
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class ExceldenAktar {
    public static void main(String[] args) {

        // Excel dosyasının yolu
        String excelFilePath = "C:/Dosya2.xlsx";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        try {
            // Excel dosyasını açın
            FileInputStream fis = new FileInputStream(excelFilePath);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            // Her satırı döngüye alın
            for (Row row : sheet) {
                // Excel tablosundaki ilgili hücreleri alın
                Cell cell1 = row.getCell(0);
                Cell cell2 = row.getCell(1);

                // Hücrelerdeki verileri alın
                String data1 = cell1.getStringCellValue();
                String data2 = cell2.getStringCellValue();

                // Web sitesini açın
                driver.get("https://tr-tr.facebook.com/");

                // İlgili yerlere verileri girin
                WebElement input1 = driver.findElement(By.xpath("//*[@id='email']"));
                input1.sendKeys(data1);

                WebElement input2 = driver.findElement(By.xpath("//*[@id='pass']"));
                input2.sendKeys(data2);

                // Bekleyin ve devam edin
                Thread.sleep(1000);

                // Submit butonuna tıklayın
                //WebElement submitButton = driver.findElement(By.id("submit-button"));
                //submitButton.click();
            }

            // Excel işlemlerini kapatın
            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            // Web sürücüsünü kapatın
            //driver.quit();
        }
    }
}
