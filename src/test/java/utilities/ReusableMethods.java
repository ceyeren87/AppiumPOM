package utilities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.*;
import java.time.Duration;

public class ReusableMethods {

    static Actions actions = new Actions(Driver.getDriver());

    public static void longPress(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()
                ));
    }

    public static void doubleClick(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "mobile: doubleClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()
                ));
    }

    public static void clickJS(WebElement element) {
        waitForClickAbility(element, 20);
        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "mobile: clickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()
                ));
    }

    public static void sendKeys(WebElement SendKeyselement, String text){
        waitForVisibility(SendKeyselement,20);
        SendKeyselement.sendKeys(text);
    }

    public static void popUp(WebElement element){
        try {
            if (element.isEnabled()
            ) {
                clickJS(element);
            }
        } catch (Exception ignored) { }
    }

    public static void assertTrue (WebElement element){
        waitForVisibility(element,20);
        Assert.assertTrue(element.isDisplayed());
    }

    public void Assertion(WebElement element,String expected){
        waitForVisibility(element,20);
        Assert.assertEquals(element.getText(),expected);
        System.out.println("My Message :  " + element.getText());

    }

    public static void dragAndDrop(WebElement element, double endX, double endY) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "mobile: dragGesture",
                ImmutableMap.of(
                        "elementId", ((RemoteWebElement) element).getId(),
                        "endX", endX,
                        "endY", endY,
                        "speed", 5000
                ));
    }

    public static void dragAndDrop(double startX, double startY, double endX, double endY) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "mobile: dragGesture",
                ImmutableMap.of(
                        "startX", startX,
                        "startY", startY,
                        "endX", endX,
                        "endY", endY,
                        "speed", 5000
                ));
    }

    public static void dragAndDrop(double startX, double startY, double endX, double endY, int speed1to5) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "mobile: dragGesture",
                ImmutableMap.of(
                        "startX", startX,
                        "startY", startY,
                        "endX", endX,
                        "endY", endY,
                        "speed", 1000 * speed1to5
                ));
    }

    public static void dragAndDrop(WebElement element, WebElement targetElement) {
        actions.clickAndHold(element)
                .moveToElement(targetElement)
                .release()
                .perform();
    }

    public static Point getMiddlePointOfTheScreen() {
        Dimension dimension = Driver.getDriver().manage().window().getSize();
        return new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.5));
    }

    public static void swipe(String fingerDirection, int speed1to100, int count) {
        Point midPoint = getMiddlePointOfTheScreen();
        for (int i = 0; i < count; i++) {
            waitFor(2);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("mobile: swipeGesture",
                    ImmutableMap.of(
                            "left", midPoint.x * 0.5,
                            "top", midPoint.y * 0.5,
                            "width", midPoint.x,
                            "height", midPoint.y,
                            "direction", fingerDirection.toLowerCase(),
                            "percent", 0.75,
                            "speed", speed1to100 * 1000
                    ));
        }
    }

    public static void swipe(WebElement element, String fingerDirection, int speed1to100) {
        waitFor(1);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("mobile: swipeGesture",
                ImmutableMap.of(
                        "elementId", ((RemoteWebElement) element).getId(),
                        "direction", fingerDirection.toLowerCase(),
                        "percent", 0.75,
                        "speed", speed1to100 * 1000
                ));
    }

    public static void scroll(String direction, int count) {
        Point midPoint = getMiddlePointOfTheScreen();
        for (int i = 0; i < count; i++) {
            waitFor(2);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("mobile: scrollGesture",
                    ImmutableMap.of(
                            "left", midPoint.x * 0.5,
                            "top", midPoint.y * 0.5,
                            "width", midPoint.x,
                            "height", midPoint.y,
                            "direction", direction.toLowerCase(),
                            "percent", 30,
                            "speed", 4000
                    ));
        }
    }

    public static void scroll(WebElement element, String direction) {
            waitFor(2);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("mobile: scrollGesture",
                    ImmutableMap.of(
                            "elementId", ((RemoteWebElement) element).getId(),
                            "direction", direction.toLowerCase(),
                            "percent", 3
                    ));
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollRight(WebElement element, int swipePercentage) {
        waitForClickAbility(element, 10);
        actions.clickAndHold(element)
                .moveByOffset(calculateOffsetForLeftAndRightScroll(swipePercentage), 0)
                .release()
                .perform();
    }

    public static void scrollLeft(WebElement element, int swipePercentage, int count) {
        for (int i = 0; i < count; i++) {
            waitForClickAbility(element, 10);
            actions.clickAndHold(element)
                    .moveByOffset(-calculateOffsetForLeftAndRightScroll(swipePercentage), 0)
                    .release()
                    .perform();
            waitFor(1);
        }
    }

    public static void scrollDown(WebElement element, int scrollPercentage) {
        waitForClickAbility(element, 10);
        actions.clickAndHold(element)
                .moveByOffset(0, -(calculateOffsetForUpAndDownScroll(scrollPercentage)))
                .release()
                .perform();
        waitFor(1);
        System.out.println(calculateOffsetForUpAndDownScroll(scrollPercentage));
    }

    public static void scrollUp(WebElement element, int scrollPercentage) {
        waitForClickAbility(element, 10);
        actions.clickAndHold(element)
                .moveByOffset(0,(calculateOffsetForUpAndDownScroll(scrollPercentage)))
                .release()
                .perform();
        waitFor(1);
    }

    //String text alanına elemanın text'ini yazıyoruz oraya kadar kaydırma işlemi yapıyor
    public static void scrollUpUIAutomator(String text){
        Driver.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
               +".scrollIntoView(new UiSelector()"+".textMatches(\""+text+"\").instance(0))"));
    }

    private static int calculateOffsetForUpAndDownScroll(int scrollAmount) {
        Dimension dimension = Driver.getDriver().manage().window().getSize();
        return ((scrollAmount * dimension.height) / 100);
    }

    private static int calculateOffsetForLeftAndRightScroll(int scrollAmount) {
        Dimension dimension = Driver.getDriver().manage().window().getSize();
        return ((scrollAmount * dimension.width) / 100);
    }

    public static WebElement waitForClickAbility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    // Element görünene kadar bekleme
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void AdbKeyboardExample() {
            try {
                String textToType = "963852";
                String adbCommand = "adb shell input text " + textToType;
                ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", adbCommand);
                processBuilder.redirectErrorStream(true);
                Process process = processBuilder.start();

                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                int exitCode = process.waitFor();
                System.out.println("Komut çıkış kodu: " + exitCode);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }


    public static void BatDosyaCalistirmaOrnegi() {

                try {
                    // Bat dosyasını başlatma işlemini burada yapın
                    Process process = Runtime.getRuntime().exec("C:\\Users\\ceyer\\OneDrive\\Masaüstü\\app.bat");

                    // Bat dosyasının çıktılarını alın
                    InputStream inputStream = process.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }

                    // Hata çıktılarını alın
                    InputStream errorStream = process.getErrorStream();
                    BufferedReader errorReader = new BufferedReader(new InputStreamReader(errorStream));
                    String errorLine;
                    while ((errorLine = errorReader.readLine()) != null) {
                        System.err.println(errorLine);
                    }

                    // Bat dosyasının tamamlanmasını bekleyin
                    process.waitFor();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
            }
    }


}
