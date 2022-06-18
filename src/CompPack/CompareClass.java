package CompPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareClass {

	public static void main(String[] args) throws InterruptedException {
		   
       
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihal\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://text-compare.com");
		
		driver.findElement(By.id("inputText1")).sendKeys("Sangam");
		
           driver.findElement(By.id("switchButton")).click();
           driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
           driver.findElement(By.id("inputText1")).sendKeys("Sangam");
           driver.findElement(By.xpath("//div[@class='compareButtonText']")).click();
           
          String ActualText= driver.findElement(By.xpath("/html/body/div[2]/span[3]")).getText();
        Thread.sleep(2000);
          System.out.println(ActualText);
          
	}

}
