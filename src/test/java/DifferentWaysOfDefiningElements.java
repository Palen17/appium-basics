import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentWaysOfDefiningElements {

    @FindBy (xpath = "//*[@text=\"Accessibility\"]")
    private static WebElement myElement4;

    @AndroidFindBy(xpath = "//*[@text=\"Accessibility\"]")
    private static WebElement myElement5;

    public DifferentWaysOfDefiningElements(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionUsingOptions.initializeDriver();

        DifferentWaysOfDefiningElements differentWaysOfDefiningElements = new DifferentWaysOfDefiningElements(driver);
        System.out.println(myElement4.getText());

        WebElement myElement = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println(myElement.getText());

        By myElement2 = By.xpath("//*[@text=\"Accessibility\"]");
        System.out.println(driver.findElement(myElement2).getText());

        By myElement3 = AppiumBy.accessibilityId("Accessibility");
        System.out.println(driver.findElement(myElement3).getText());

        myElement4.getText();

        //driver.findElement(myElement2).click();

    }
}
