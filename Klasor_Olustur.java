import java.io.File;

public class KlasorOlustur {
    public static void main(String[] args) {
        String folderPath = "C:/Yeni Klasör";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            boolean isCreated = folder.mkdirs();

            if (isCreated) {
                System.out.println("Klasör oluşturuldu.");
            } else {
                System.out.println("Klasör oluşturulamadı.");
            }
        } else {
            System.out.println("Klasör zaten mevcut.");
        }
    }
}

// Hazırlayan : Emre Demirtekin 
