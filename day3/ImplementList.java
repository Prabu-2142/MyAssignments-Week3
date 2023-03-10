package week3.day3;

import java.time.Duration;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplementList {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name = 'searchVal']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
		
		List<WebElement> itele = driver.findElements(By.xpath("//img[contains(@class,'rilrtl-lazy-img')]"));
		
		System.out.println("The total items found is: "+itele.size());
		
		List<String> brand = new ArrayList<String>();
		
	
		 List<WebElement> bname = driver.findElements(By.xpath("//div[@class='brand']"));
		 
           
		for (WebElement web : bname) {
			
			String name = web.getText();
			brand.add(name);
			
		}
		
		System.out.println("The total count of brand name is: "+brand.size());
		System.out.println(brand);
		
		List<String> bgname = new ArrayList<String>();
		
		List<WebElement> pname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		for (WebElement n : pname) {
			
			String text1 = n.getText();
			bgname.add(text1);
		}
		
		System.out.println("The total count of bag name is: "+bgname.size());
		System.out.println(bgname);
	}

}
