package Selenium_prac;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://edu.ssafy.com/edu/main/index.do");
			
			// ID 입력
			WebElement ID = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/div[1]/div[1]/input"));
			ID.sendKeys("rjqnrdl5113@naver.com");
			// 비밀번호 입력
			WebElement PW = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/div[1]/div[2]/input"));
			PW.sendKeys("h22!sunhee");
			Thread.sleep(300);
			PW.sendKeys(Keys.ENTER);
			
			//커뮤니티 - 익명 게시판 들어가기
			WebElement community = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[3]/a"));
			community.click();
			Thread.sleep(300);
			
			WebElement anonymous = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[1]/div[2]/div/ul/li[3]/a"));
			anonymous.click();
			Thread.sleep(300);
			
			WebElement test = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/ul/li[2]/div[1]/a"));
			test.click();
			Thread.sleep(300);
			
			// /html/body/div[1]/form/div/div[2]/div/div[2]/div[4]/div/button[1]
			
			WebElement testre = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div[4]/div/button[1]"));
			System.out.println(testre.getText()=="수정");
			
			
			

	}

}
