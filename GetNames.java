package Week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetNames {

	static boolean b = false;

	public static String dup = "";
	static int count = 0;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().driverVersion("101.0.4951.54").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/newportal/stock-nse-bulk-deals.asp']")).click();

		int colCount = driver
				.findElements(
						By.xpath("//table[@class='table table-bordered table-condensed table-striped']//thead/tr/th"))
				.size();
		int rowCount = driver
				.findElements(By.xpath(
						"		//table[@class='table table-bordered table-condensed table-striped']//tbody/tr\n" + ""))
				.size();
		System.out.println(colCount);
		System.out.println(rowCount);

		for (int i = 1; i <= rowCount; i++) {

			for (int j = 3; j <= 3; j++) {
				String s = driver.findElement(
						By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tbody/tr[" + (i)
								+ "]/td[" + (j) + "]"))
						.getText();
				System.out.println(s);

			}
		}

	}

}
