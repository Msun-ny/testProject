package Selenium_prac;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEduSSAFY {

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
		
		// 팝업창 없애기
		// /html/body/div[3]/div[2]/div[2]/button[2]
		WebElement PopClose = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/button[2]"));
		PopClose.click();
		Thread.sleep(300);
		
		
		//커뮤니티 - 익명 게시판 들어가기
		WebElement community = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[3]/a"));
		community.click();
		Thread.sleep(300);
		
		WebElement anonymous = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[1]/div[2]/div/ul/li[3]/a"));
		anonymous.click();
		Thread.sleep(300);
		
		//글쓰기 - 제목 - 내용 - 제출
//		
//		WebElement write = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div/span/button"));
//		write.click();
//		Thread.sleep(300);
//		
//		///html/body/div[1]/form/div/div[1]/div[2]/div/ul/li[3]/a
//		///html/body/div[1]/form/div/div[2]/div/div[1]/div/div[1]/div[2]/input
//		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[1]/div/div[1]/div[2]/input"));
//		title.sendKeys("얘들아 2주 동안 수고했고");
//		Thread.sleep(300);
//		
//		WebElement text = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[1]/div/div[2]/div[2]/div/textarea"));
//		text.sendKeys("대전 3반 파이팅!!");
//		Thread.sleep(300);
//		
//		WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div[2]/div/a"));
//		submit.click();
//		Thread.sleep(300);
//		
//		WebElement Ok = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/button"));
//		Ok.click();
//		Thread.sleep(300);

//		// 좋아요 누르기
//		List<WebElement> annList = driver.findElements(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/ul/li"));
//
//		for (int i=1; i<=annList.size();i++) {
//			WebElement element = driver.findElement(By.xpath("html/body/div[1]/form/div/div[2]/div/div[3]/ul/li[" + i + "]/div[1]/a"));
//			element.click();
//			
//			 
//			
//			//페이지 접속 후 좋아요 버튼 누르고 목록으로 복귀
//			WebElement Good = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div[4]/div/button[1]"));
//			
//			if ( Good.getText().equals("수정")) {
//				WebElement Back = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/div[2]/div/div/button"));
//				Back.click();
//				Thread.sleep(300);
//				
//				continue;
//			}
//			Thread.sleep(500);
//			
//			Good.click();
//			Thread.sleep(500);
//			
//			WebElement Back = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/div[2]/div/div/button"));
//			Back.click();
//			Thread.sleep(300);
//			
//			Set<String> handles = driver.getWindowHandles();
//			for (String handle : handles) {
//				driver.switchTo().window(handle);
//				
//			}
//			annList.get(i);
//		}
		
		// 멘토링 게시판 - 멘토 스토리 - 주요 트렌드
		WebElement mentoring = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[5]/a"));
		mentoring.click();
		Thread.sleep(300);
		
		WebElement mstory = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[1]/div[2]/div/ul/li[1]/a"));
		mstory.click();
		Thread.sleep(300);
		
		WebElement trend = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div/div/ul/li[4]/a"));
		trend.click();
		Thread.sleep(300);
		
		// /html/body/div[1]/form/div/div[2]/div/div[3]/ul/li[" + i + " ]/div[2]/a
		
		// 주요 트렌드 제목 불러오기
		List<WebElement> trendList = driver.findElements(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/ul/li"));

		for (int i=3; i<=trendList.size();i++) {
			WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/ul/li[" + i + "]/div[2]/a"));
			System.out.println(element2.getText());
		
		}
			
			
}
		
		
		
		
	

	

}
