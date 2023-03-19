package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		WebElement moveto = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions act = new Actions(driver);
		act.moveToElement(moveto).perform();
		
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'col-xs-6  favDp product-tuple-listing js-tuple ')]"));
		int count = list.size();
		System.out.println("The total count of shoes is : "+count);
		
		driver.findElement(By.xpath("(//a[@class='child-cat-node dp-widget-link hashAdded'])[3]")).click();
		
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		WebElement j = driver.findElement(By.xpath("//li[@class='search-li']"));
		driver.executeScript("arguments[0].click()", j);
		Thread.sleep(2000);
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		Thread.sleep(2000);
		List<Integer> sort = new ArrayList<Integer>();
		
		for (int i = 0; i < price.size(); i++) {
			String p = price.get(i).getAttribute("display-price");
			System.out.println(p);
			int parseInt = Integer.parseInt(p);
			sort.add(parseInt);	
		}
		Collections.sort(sort);
		System.out.println(sort);
		
		WebElement lh = driver.findElement(By.xpath("//div[contains(text(),'Price Low To High')]"));
		
		if(lh.isDisplayed()) {
			
			System.out.println("Price shorted Low to High : True");
		}
		
		else {
			System.out.println("Price shorted Low to High : False");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='child-cat-name ']")).click();
		
		
		WebElement scroll = driver.findElement(By.xpath("(//button[text()='View More '])[3]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(scroll).perform();
		scroll.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']/span")).click();
		
		WebElement minprice = driver.findElement(By.xpath("//input[@name='fromVal']"));
		Thread.sleep(2000);
		minprice.clear();
		minprice.sendKeys("500");
		Thread.sleep(2000);
		
		
		WebElement maxprice = driver.findElement(By.xpath("//input[@name='toVal']"));
		Thread.sleep(2000);
		maxprice.clear();
		maxprice.sendKeys("1200");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);
		
		WebElement colfil = driver.findElement(By.xpath("//a[@class='clear-filter-pill  ']"));
		Thread.sleep(2000);
		WebElement pricefil = driver.findElement(By.xpath("//a[@data-key='Price|Price']"));
		Thread.sleep(2000);
		if(colfil.isDisplayed() && pricefil.isDisplayed()) {
			
			System.out.println("Filters are Verified");
		}
		else {
			
			System.out.println("Filters are not displayed");
		}
		
		WebElement moveto2 = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
		act.moveToElement(moveto2).perform();
		moveto2.click();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span"));
		String text = element.getText();
		System.out.println("The cost of the Shoe is : "+text);
		Thread.sleep(2000);
		
		WebElement dis = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		String text1 = dis.getText();
		System.out.println("The Discount percentage applied for the shoe is : "+text1);
		Thread.sleep(2000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./Snapshots/ss.png");
		FileUtils.copyFile(src, des);
		
		driver.close();
		
	}

}
