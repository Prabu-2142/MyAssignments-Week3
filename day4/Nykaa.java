package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		Thread.sleep(2000);
		
		WebElement moveto = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act = new Actions(driver);
		act.moveToElement(moveto).perform();
		
		driver.findElement(By.xpath("//a[text()='The Face Shop']/following::a")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("L'Oreal Paris")) {
			System.out.println("Title Verified");
		}
		else {
			System.out.println("Title Not Verified");
		}
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		
		WebElement j = driver.findElement(By.xpath("(//span[@class='title'])[4]"));
		driver.executeScript("arguments[0].click()", j);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='title ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='filter-name ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[2]")).click();
		Thread.sleep(2000);
		
		WebElement j1 = driver.findElement(By.xpath("//span[text()='Concern']"));
		driver.executeScript("arguments[0].click()", j1);
		Thread.sleep(2000);
		
		WebElement j2 = driver.findElement(By.xpath("//span[text()='Color Protection']"));
		driver.executeScript("arguments[0].click()", j2);
		Thread.sleep(2000);
		
		WebElement filter = driver.findElement(By.xpath("//span[@class='filter-value']"));
		
		if(filter.isDisplayed()) {
			System.out.println("Shampoo is Filtered");
		}
		else {
			System.out.println("Shampoo is not filtered");
		}
		
		driver.findElement(By.xpath("//a[@class='css-qlopj4']")).click();
		
		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh);
		List<String> window = new ArrayList<String>(wh);
		System.out.println("Total Windows : "+ window.size());
		driver.switchTo().window(window.get(1));
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		Thread.sleep(2000);
		
		WebElement sele = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		sele.click();
		
		Select opt = new Select(sele);
		opt.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement txt = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e']/span)[2]"));
		String mrp = txt.getText();
		System.out.println("The MRP of the product is : "+mrp);
		
		driver.findElement(By.xpath("//button[@class=' css-1qvy369']/span")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		//String title2 = driver.getTitle();
		//System.out.println(title2);
		
		WebElement gt = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
		String total = gt.getText();
		System.out.println("Grand Total is : "+total);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class=' css-1l4d0ex e171rb9k3']")).click();
		
		WebElement pr = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']"));
		String price = pr.getText();
		System.out.println("The price is : "+price);
		
		if(total.equals(price)) {
			System.out.println("Price Matches");
		}
		else {
			System.out.println("Price not Matches");
		}
		driver.quit();
	}

}
