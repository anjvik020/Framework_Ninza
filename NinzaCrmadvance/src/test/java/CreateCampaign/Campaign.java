package CreateCampaign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Campaign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.edgedriver().setup();
WebDriver d=new EdgeDriver();

d.get("http://49.249.28.218:8098/");
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
d.findElement(By.id("username")).sendKeys("rmgyantra");
d.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
d.findElement(By.xpath("//button[text()='Sign In']")).click();

d.findElement(By.xpath("//a[text()='Campaigns']")).click();
d.findElement(By.linkText("Create Campaign")).click();
//d.close();
	}

}
