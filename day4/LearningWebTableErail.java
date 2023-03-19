package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWebTableErail {

	public static void main(String[] args) {


		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get("https://erail.in/");
		dr.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		dr.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("ms",Keys.TAB);
		dr.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		dr.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("co",Keys.TAB);
		dr.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		List<String> tname = new ArrayList<String>();
		
		List<WebElement> ele = dr.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]/a"));
		
		for (WebElement web : ele) {
			String text = web.getText();
			tname.add(text);
		}
		
		System.out.println(tname);
	}

}
