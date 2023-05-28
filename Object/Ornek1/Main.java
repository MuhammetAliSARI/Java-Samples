package horonaga.ObjeOlusturma;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager  = new CustomerManager();    // customerManager adında bir obje oluşturduk
        CustomerManager customerManager2 = new CustomerManager();   // customerManager2 adında bir obje daha oluşturduk
        customerManager = customerManager2;
        customerManager.Add();      // CustomerManager. yazıldığında CustomerManager classının içindeki Add'ı görür
        customerManager.Remove();   // CustomerManager. yazıldığında CustomerManager classının içindeki Remove'i görür
        customerManager.Update();   // CustomerManager. yazıldığında CustomerManager classının içindeki Update'i görür
    }
}

// customerManager = customerManager2; şeklindeki 7. satır sayesinde 5. satırdaki eşleme çöp oldu.
// Bu veriyi tutan bir şey olmadığı için 'Garbage Collector'(Çöp toplayıcı) denen bellek yöneticisi bu veriyi önbellekten siler.
