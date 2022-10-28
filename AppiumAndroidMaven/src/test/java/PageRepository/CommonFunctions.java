package PageRepository;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	WebDriver driver=null;

	public CommonFunctions(WebDriver driver)
	{
		this.driver=driver;
		}
	public void initialPermissions() throws InterruptedException
	{
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
		.click();
myWait(3000);
driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
		.click();
myWait(3000);
driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
		.click();
driver.findElement(By.xpath(
		"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"))
		.click();
myWait(3000);
driver.findElement(By.xpath(
		"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"))
		.click();
myWait(3000);
	}
	public void Login() throws InterruptedException
	{
		// Enter email
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"))
				.sendKeys("satish.nalmala@dki.ca");
		myWait(3000);
		// Enter password
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"))
				.sendKeys("Tara0518");
		myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/btn_login")).click();// Click login
		myWait(3000);
		System.out.println("App Installed and Logged int");
	}
	
	public void myWait(int mytime) throws InterruptedException
	{
	
	Thread.sleep(mytime);
	}
}
