package Selenium_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// 뉴스기사 타이틀 가져오기
		// html/body/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div/ul/li
		// li 태그는 직접 추가함: 여러개를 가져오겠다는 의미
		driver.get("https://finance.naver.com/");
		
		//List: java.util로, findElements 주의
		List<WebElement> newsTitleList = driver.findElements(By.xpath("html/body/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div/ul/li"));
		
		for (WebElement webElement : newsTitleList) {
			System.out.println(webElement.getText());
		}

	}

}
