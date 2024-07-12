package Selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) {
		// 크롬 드라이버 불러오기(크롬 드라이버가 최상단에 있기 때문에 괄호 안을 비워둬도 ok)
		// 브라우저 간의 공통점을 모은 ~?
		// crtl+shift+o -> 패키지 자동 import
		WebDriver driver = new ChromeDriver();
		
		// 드라이버를 이용해서 페이지를 열기
		driver.get("https://www.naver.com/");
		// #shortcutArea > ul > li:nth-child(6) > a
		// css에서 찾는 거
//		WebElement financeButton = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
//		// 클릭 명령
//		financeButton.click();
		// html을 따라가는 거
		// xpath: HTML문서의 구조를 보여주는 패스 -> 태그의 경로를 알려줌 (위의 코드보다 구조적인 방법)
		// 둘 사이의 큰 차이가 없음 -> 내가 보기 편한 것으로 보는 것.
		WebElement financeButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[6]/ul/li[6]/a"));
		financeButton.click();
		

	}

}
