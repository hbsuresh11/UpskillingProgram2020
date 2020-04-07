package testPackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9arraylistwithERPapp0704 {

	private static Object string;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String[] itemsneeded= {"Cucumber","Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<products.size();i++) {
			   String[] name = products.get(i).getText().split("-");
			   String formattedname= name[0].trim();
			   List itemsneededlist = Arrays.asList(itemsneeded); 
			   if(itemsneededlist.contains(formattedname)) {
			   
			   driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}
		
	}

	}
}
