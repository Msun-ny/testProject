package Selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://finance.naver.com/");
		
		///html/body/div[2]/div[1]/div/div[2]/div[1]/form/input[1]
		WebElement searchBar = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/form/input[1]"));
		searchBar.sendKeys("삼성전자");
		// System.out.println(searchBar);
		// 작업관리자에서 Chromedriver.exe. 많으면 느려질 수 있으니 지우면서 하기
		// 현재 유지보수 오류로 검색 키 클릭이 안돼서 엔터 입력하는 걸로
		searchBar.sendKeys(Keys.ENTER);
		
		

	}

}
