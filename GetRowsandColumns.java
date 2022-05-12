package Week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRowsandColumns {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().driverVersion("101.0.4951.54").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");

		System.out.println("Javascript library Table");

		int colCount = driver.findElements(By.xpath("//div[@class='render']/table/thead/tr/th")).size();
		System.out.println("Column count is " + colCount);

		int rowCount = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr")).size();
		System.out.println("Column count is " + rowCount);

		System.out.println("Tables for Data, Not Layout");

		int colCount1 = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/th")).size();
		System.out.println("Column count is " + colCount1);

		int rowCount1 = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr")).size();
		System.out.println("Column count is " + rowCount1);

	}

}
