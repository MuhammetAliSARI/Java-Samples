
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.IOException;


public class Excell {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:/Users/horon/OneDrive/Desktop/Excell_Dosyasi/dosya.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        int satirsayisi = 8;
        for (int a=0; a<satirsayisi; a++) {
            String ad = workbook.getSheet("Sayfa1").getRow(a).getCell(0).toString();
            String soyad = workbook.getSheet("Sayfa1").getRow(a).getCell(1).toString();
            String email = workbook.getSheet("Sayfa1").getRow(a).getCell(2).toString();

            System.out.println(ad+soyad+email);
        }
    }
}






/*
poom.xml içinde aşağıdaki kodun bulunması gerekiyor



        <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.17.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.17.2</version>
        </dependency>
 */
