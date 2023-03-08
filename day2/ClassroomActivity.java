package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomActivity {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone",Keys.ENTER);
		List<WebElement>allprice = driver.findElements(By.className("a-price-whole"));
		
		List<Integer>allphones=new ArrayList<Integer>();
		
		for (int i = 0; i < allprice.size(); i++) {
			
			String text = allprice.get(i).getText();
			String replaceAll = text.replaceAll(",", "");
			System.out.println(replaceAll);
			if(!replaceAll.trim().equals("")) {
				int finalPrice = Integer.parseInt(replaceAll);
				if(finalPrice>0) {
					allphones.add(finalPrice);
				}
			}
			
			}
		Collections.sort(allphones);
		System.out.println("The lowest mobile Price is : "+allphones.get(0));
		
	}

}
