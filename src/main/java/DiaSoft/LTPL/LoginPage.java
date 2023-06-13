package DiaSoft.LTPL;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class LoginPage {

	public static void main(String[] args) throws Exception {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("D:\\HB\\Diasoft\\Debug_Raj\\DiaSoft.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(1000);
		driver.findElementByName("Login").sendKeys("CHETAN");
		driver.findElementByName("Login").submit();
		WebElement pass = driver.findElementByName("PassWord");
		pass.sendKeys("123");
		pass.submit();
		driver.findElementByName("Login").click();
		Thread.sleep(5000);

	}

}
