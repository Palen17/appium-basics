import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;

public class AndLockAndUnlockDevice {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionUsingOptions.initializeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ((AndroidDriver) driver).lockDevice();
        System.out.println(((AndroidDriver) driver).isDeviceLocked());
        ((AndroidDriver) driver).unlockDevice();

    }
    }
