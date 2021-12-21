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

'Pop-2_SI-1 Sign-In customer'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), 'yoskris@gmail.com')

'Pop-2_SI-2 Input field Alamat Email'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), 'yoskris@gmail.')

'Pop-2_SI-3 Input field Alamat Email (wrong format)'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), 'yoskris123@gmail.com')

'Pop-2_SI-4 Input field Alamat Email Alphanumeric'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), 'yoskris123!@#@gmail.com')

'Pop-2_SI-5 Input field Alamat Email Alphanumeric Symbol'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Alamat Email_username'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page_Populix Sign_In/svg_Password_MuiSvgIcon-root'))

'Pop-2_SI-7 Unhide tick Password'
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Populix Sign_In/input_Password_password'), 'password')

'Pop-2_SI-8 Input field Password'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Password_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Password_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/input_Password_password'), 'password123')

'Pop-2_SI-9 Input field Password Alphanumeric'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Password_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Password_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/input_Password_password'), 'password123!@#')

'Pop-2_SI-10 Input field Password Alphanumeric Symbol'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Password_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Password_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/input_Password_password'), 'passworddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddD')

'Pop-2_SI-11 Input field Password >100 Character'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Password_password'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/input_Password_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page_Populix Sign_In/span_Masuk'))

'Pop-2_SI-6 Blank field Alamat Email'
WebUI.takeScreenshot()

'Pop-2_SI-12 Blank input field Password'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Page_Populix Sign_In/lupa kata sandi'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), 'yoskris@gmail.com')

'Pop-2_SI-13 Lupa Kata Sandi - Input field Alamat Email'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), 'yoskris@gmail.')

'Pop-2_SI-14 Lupa Kata Sandi - Input field Alamat Email (wrong format)'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), 'yoskris123@gmail.com')

'Pop-2_SI-15 Lupa Kata Sandi - Input field Alamat Email Alphanumeric'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), 'yoskris123!@#@gmail.com')

'Pop-2_SI-16 Lupa Kata Sandi - Input field Alamat Email Alphanumeric Symbol'
WebUI.takeScreenshot()

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Populix Sign_In/alamat_email lupa kata sandi'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Page_Populix Sign_In/kirim ulang kata sandi'))

'Pop-2_SI-17 Lupa Kata Sandi - Blank field Alamat Email'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Page_Populix Sign_In/kembali ke halaman login'))

'Pop-2_SI-18 Lupa Kata Sandi - Kembali Ke Halaman Login'
WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.closeBrowser()

