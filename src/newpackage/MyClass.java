package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium - Webdriver -2021\\Selenium-Lib-Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = " https://digiappuat.nrfsi.com/dlp_preprod/home";
		driver.get(baseUrl);
		driver.close();
		

	}

}
