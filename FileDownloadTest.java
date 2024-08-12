import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileDownloadTest {
    public static void main(String[] args) {
        

       
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      
        driver.get("http://example.com/download_page"); 
        driver.findElement(By.id("download_button_id")).click();  

       
        try {
            Thread.sleep(5000);  // Adjust wait time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

 
        String filename = "expected_file_name.ext";  // Update with actual file name
        File file = new File(downloadDir + File.separator + filename);
        if (file.exists()) {
            System.out.println("File downloaded successfully.");
        } else {
            System.out.println("File not found.");
        }
        driver.quit();
    }
}
