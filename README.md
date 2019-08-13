# Appiumdemoproject

To automate an app we need to use below capabilities

1.CapabilityType. BROWSER_NAME
2.deviceName
3.PlatformName
4.PlatformVersion
5.appPackage
6.appActivity

Step1 - JDK Installation
step2 - android SDK installation
Step3 - download and launch eclipse
Step4- configure appium server.exe in tester computer
step5- Create AVD / connect ARd
step6- install app corresponding AVD/ARD
step7- devloping scripts
step8- Locating elements in app screens

As a test automator i can locate elements in android app screen via xpath or accessbilityID or android code

1. driver.findElement(By.xpath("......")
2. driver.findElementByAccessbilityID("........")
3. driver.findElementByAndroidUIAutomator("...........")

we can start appium server in 3 ways but in my organisation we are using below code in command prompt.

Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");

To Stop an appium server wer are using below code.

Runtime.getRuntime().exec("tasjkill/F/IM node.exe");
Runtime.getRuntime().exec("tasjkill/F/IM cmd.exe");

