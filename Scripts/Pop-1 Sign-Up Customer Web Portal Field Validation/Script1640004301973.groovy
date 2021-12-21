import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.populix.co/login')

'Main Menu'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Populix/a_Daftar'))

'Pop-1_SU-1 Daftar button customer'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), 'Yosua')

'Pop-1_SU-2 Input field Nama Depan'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), 'Yosua123456')

'Pop-1_SU-3 Input field Nama Depan Alphanumeric'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), 'Yosua123!@#')

'Pop-1_SU-4 Input field Nama Depan Alphanumeric Symbol'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), 'YosuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA')

'Pop-1_SU-5 Input field Nama Depan >100 Character'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Populix/input_Nama Depan_firstName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Nama Belakang_lastName'), 'Kristian')

'Pop-1_SU-7 Input field Nama Belakang'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Nama Belakang_lastName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Nama Belakang_lastName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Nama Belakang_lastName'), 'Kristian123456')

'Pop-1_SU-8 Input field Nama Belakang Alphanumeric'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Nama Belakang_lastName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Nama Belakang_lastName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Nama Belakang_lastName'), 'Kristian123!@#')

'Pop-1_SU-9 Input field Nama Belakang Alphanumeric Symbol'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Nama Belakang_lastName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Nama Belakang_lastName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Nama Belakang_lastName'), 'KristiannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnN')

'Pop-1_SU-10 Input field Nama Belakang >100 Character'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Nama Belakang_lastName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Nama Belakang_lastName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Alamat Email_email'), 'yosuakris@gmail.com')

WebUI.delay(2)

'Pop-1_SU-12 Input field Email'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Alamat Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Alamat Email_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Alamat Email_email'), 'yosuakris@gmail')

WebUI.delay(2)

'Pop-1_SU-13 Input field Email (wrong format)'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Alamat Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Alamat Email_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Alamat Email_email'), 'yosuakris123@gmail.com')

WebUI.delay(2)

'Pop-1_SU-14 Input field Email Alphanumeric'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Alamat Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Alamat Email_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Alamat Email_email'), 'yosuakris123!@#@gmail.com')

not_run: WebUI.delay(2)

'Pop-1_SU-15 Input field Email Alphanumeric Symbol'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Alamat Email_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Alamat Email_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Populix/tick Unhide Kata Sandi'))

'Pop-1_SU-17 Unhide tick Kata Sandi'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Kata Sandi_password'), 'katasandi')

'Pop-1_SU-18 Input field Kata Sandi'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Kata Sandi_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Kata Sandi_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Kata Sandi_password'), 'katasandi123')

'Pop-1_SU-19 Input field Kata Sandi Alphanumeric'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Kata Sandi_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Kata Sandi_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Kata Sandi_password'), 'katasandi123!@#')

'Pop-1_SU-20 Input field Kata Sandi Alphanumeric Symbol'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Kata Sandi_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Kata Sandi_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Populix/input_Kata Sandi_password'), 'katasandiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiI')

'Pop-1_SU-21 Input field Kata Sandi >100 Character'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix/input_Kata Sandi_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix/input_Kata Sandi_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Populix/span_Daftar'))

WebUI.delay(2)

'Pop-1_SU-6 Blank input field Nama Depan'
WebUI.takeScreenshot()

'Pop-1_SU-11 Blank input field Nama Belakang'
WebUI.takeScreenshot()

'Pop-1_SU-11 Blank input field Nama Belakang'
WebUI.takeScreenshot()

'Pop-1_SU-16 Blank field Email'
WebUI.takeScreenshot()

'Pop-1_SU-22 Blank input field Kata Sandi'
WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.closeBrowser()

