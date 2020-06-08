package webBoot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webboot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Guilherme\\drivers\\chromedriver.exe");
		
		WebDriver navegador = new ChromeDriver();
		
		navegador.get("https://www.google.com.br/");
		
		navegador.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("teste");
	}

}