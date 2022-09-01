package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExample1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("samsung f22");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(1000);
		String priceOfSamsungf22 = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Black, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println("price of samsung f22 : "+priceOfSamsungf22);
	}

}