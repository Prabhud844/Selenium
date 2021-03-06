import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//ApiDemos-debug.apk
		//device
				//Prabhu14a
				//Pixel_3a_API_30
		//String phonename  ="Pixel_3a_API_30";
		String phonename  ="Prabhu14a";

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\372262\\workspace\\Testing\\BDDTest\\Drivers\\chromedriver.exe");
		String apk = "C:\\Users\\372262\\workspace\\Testing\\MobileTesting\\src";
		File f = new File(apk);
		File app = new File(apk,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, phonename);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		//UI Automator --> andriod apps
		
		URL ul = new URL("http://127.0.0.1:4723/wd/hub");
		//AndroidDriver<AndroidElement> driver = new AndroidDriver<>(ul,cap);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		
		
		

	}

}
