package Selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSRT {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String srtMain = driver.getWindowHandle();
		
		for (String handle : driver.getWindowHandles()) {
			if(!handle.equals(srtMain)) {
				if(!handle.equals(srtMain)) {
					driver.switchTo().window(handle).close();
				}
			}
		}
		driver.get("https://etk.srail.kr/main.do");
		// /html/body/div/div[4]/div[1]/div[2]/div[1]/div[1]/form/fieldset/div[1]/select
		
		// 출발역
		Select departure = new Select(driver.findElement(By.name("dptRsStnCd")));
		// 확인 System.out.println(departure);
		//name 사용
		departure.selectByVisibleText("동탄");
		
		// 도착역
		Select arrival = new Select(driver.findElement(By.name("arvRsStnCd")));
		//value 사용
		arrival.selectByValue("0010");
		
	}

}
