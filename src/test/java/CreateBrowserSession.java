import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CreateBrowserSession {

    public static AppiumDriver initializeDriver() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Pixel_7");
        caps.setCapability("appium:automationName", "uiautomator2");
        caps.setCapability("browserName", "Chrome");

        URL url = new URL("http://0.0.0.0:4723");

        return new AndroidDriver(url, caps);



    }
}
