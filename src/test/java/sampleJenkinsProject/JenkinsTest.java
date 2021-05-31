package sampleJenkinsProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsTest {
	
	@Parameters({"url"})
	@Test
	public void sampleJenkinsTest(String url) {
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver=new ChromeDriver();
	   driver.get(url);
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
	}

}
