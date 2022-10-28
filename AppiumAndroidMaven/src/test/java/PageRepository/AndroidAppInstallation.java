package PageRepository;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

//import PagesRepository.CommonFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidAppInstallation {
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// Set the Desired Capabilities

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\DKI-Satish\\Downloads\\3.0A-05.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		CommonFunctions cf = new CommonFunctions(driver);

		cf.myWait(15000);

		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
				.click();
		cf.myWait(3000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
				.click();
		cf.myWait(3000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
				.click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"))
				.click();
		cf.myWait(3000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]"))
				.click();
		cf.myWait(3000);
		// Enter email
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"))
				.sendKeys("satish.nalmala@dki.ca");
		cf.myWait(3000);
		// Enter password
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"))
				.sendKeys("Tara0518");
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/btn_login")).click();// Click login
		cf.myWait(3000);
		System.out.println("App Installed and Logged int");
		// Create Job
		driver.findElement(By.id("com.dki.dki:id/fab_create_job")).click();
		cf.myWait(3000);
		driver.findElement(By.id("com.dki.dki:id/et_name")).sendKeys("testingAndroid");
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_address")).sendKeys("2360 bristol circle");
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_unit")).sendKeys("401");
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_city")).sendKeys("oakville");
		cf.myWait(3000);
		driver.findElement(By.id("com.dki.dki:id/sp_province")).click();//Provience
		cf.myWait(3000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[10]"))
				.click();
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_postal_code")).sendKeys("L6H6M5");
		cf.myWait(3000);
		driver.findElement(By.id("com.dki.dki:id/sp_country")).click();//Country
		cf.myWait(3000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"))
				.click();
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_email")).sendKeys("dkisatishnalmala1@gmail.com");

		driver.findElement(By.id("com.dki.dki:id/bt_add")).click();
		cf.myWait(3000);
		System.out.println("Create Job 1st Screen completed");

		driver.findElement(By.id("com.dki.dki:id/tv_name")).click();
		cf.myWait(3000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"))
				.click();
		cf.myWait(3000);
		// Phone no
		driver.findElement(By.id("com.dki.dki:id/et_phone")).sendKeys("2398729430");
		cf.myWait(3000);
		// Ext
		driver.findElement(By.id("com.dki.dki:id/et_ext")).sendKeys("+1");
		cf.myWait(3000);

		// Add Button
		driver.findElement(By.id("com.dki.dki:id/btn_add")).click();
		cf.myWait(3000);

		System.out.println("Add Phone popup completd");

	}
}
