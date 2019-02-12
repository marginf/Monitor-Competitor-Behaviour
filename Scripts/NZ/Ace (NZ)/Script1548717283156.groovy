import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Assert

WebUI.openBrowser('')

//Logs User into MF')
WebUI.navigateToUrl('https://marginfueltest.azurewebsites.net/Home/Login')
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Global Objects/input_Username'), 'PTAce')
WebUI.setText(findTestObject('Global Objects/input_Password'),Password)
WebUI.click(findTestObject('Global Objects/button_Login'))

//To Competitor Behaviour Page
WebUI.click(findTestObject('Global Objects/a_Monitor'))
WebUI.click(findTestObject('Global Objects/a_Competitor Behaviour'))
WebUI.waitForPageLoad(2)
WebUI.switchToFrame(findTestObject('Global Objects/iframe_Competitor Behaviour'),1)

// Select Market from Drop Down
WebUI.click(findTestObject('Competitor Behaviour/Market'))
WebUI.selectOptionByValue(findTestObject('Competitor Behaviour/Market'),NZ, false)
WebUI.click(findTestObject('Competitor Behaviour/Market'))

// Select Client Channel
WebUI.click(findTestObject('Competitor Behaviour/Client Channel'))
WebUI.selectOptionByLabel(findTestObject('Competitor Behaviour/Client Channel'),'Direct',false)
WebUI.click(findTestObject('Competitor Behaviour/Client Channel'))

//Select Pickup Location
WebUI.click(findTestObject('Competitor Behaviour/Pickup Location'))
WebUI.selectOptionByLabel(findTestObject('Competitor Behaviour/select_Pickup'), 'Auckland Airport', false)
//WebUI.selectOPtionByValue(findTestObject('Competitor Behaviour/select_Pickup'), '041c2f3a-4912-437f-a404-6c17064efe22',false)
WebUI.click(findTestObject('Competitor Behaviour/Pickup Location'))

// Select DropOff Location
WebUI.click(findTestObject('Competitor Behaviour/Dropoff Location'))
WebUI.selectOptionByLabel(findTestObject('Competitor Behaviour/Dropoff Location'),'Auckland Airport', false)
WebUI.click(findTestObject('Competitor Behaviour/Dropoff Location'))

// Select Vehicle Type
WebUI.click(findTestObject('Competitor Behaviour/Category Type'))
WebUI.selectOptionByLabel(findTestObject('Competitor Behaviour/Category Type'),'Car',false)
WebUI.click(findTestObject('Competitor Behaviour/Category Type'))

// Select Vehicle
WebUI.click(findTestObject('Competitor Behaviour/select_Vehicle'))
WebUI.verifyElementChecked(findTestObject('Competitor Behaviour/select_Vehicle - DropDown - SelectAll'),1)
WebUI.uncheck(findTestObject('Competitor Behaviour/select_Vehicle - DropDown - SelectAll'))
WebUI.check(findTestObject('Competitor Behaviour/select_Vehicle - AceNZ - Corolla'))
WebUI.click(findTestObject('Competitor Behaviour/select_Vehicle'))

// Select Competitor Channel
WebUI.click(findTestObject('Competitor Behaviour/Competitor Channel'))
WebUI.selectOptionByLabel(findTestObject('Competitor Behaviour/Competitor Channel'),'Direct',false)
WebUI.click(findTestObject('Competitor Behaviour/Competitor Channel'))

// Select Competitors
WebUI.click(findTestObject('Competitor Behaviour/Competitor - DropDown'))
WebUI.verifyElementChecked(findTestObject('Competitor Behaviour/Competitor - SelectAll'),1)
WebUI.uncheck(findTestObject('Competitor Behaviour/Competitor - SelectAll'))
WebUI.check(findTestObject('Competitor Behaviour/Competitor - Apex (AceNZ)'))
WebUI.check(findTestObject('Competitor Behaviour/Competitor - Avis (HertzNZ)'))
WebUI.check(findTestObject('Competitor Behaviour/Competitor - Budget (HertzNZ)'))
WebUI.check(findTestObject('Competitor Behaviour/Competitor - Firefly (ThriftyNZ)'))
WebUI.check(findTestObject('Competitor Behaviour/Competitor - GO (AceNZ)'))
WebUI.check(findTestObject('Competitor Behaviour/Competitor - Hertz (ThriftyNZ)'))
WebUI.check(findTestObject('Competitor Behaviour/Competitor - Jucy (AceNZ)'))
WebUI.check(findTestObject('Competitor Behaviour/Competitor - Thrifty - NZ'))
WebUI.click(findTestObject('Competitor Behaviour/Competitor - DropDown'))

// Select Pickup Date
WebUI.click(findTestObject('Competitor Behaviour/Pickup Date'))
WebUI.click(findTestObject('Competitor Behaviour/i_Today_icon-arrow-right'))
WebUI.focus(findTestObject('Competitor Behaviour/Pickup Date1'))
WebUI.click(findTestObject('Competitor Behaviour/Pickup Date1'))

// Select Dropoff Date
WebUI.click(findTestObject('Competitor Behaviour/Dropoff Date'))
//WebUI.click(findTestObject('Forward Market Pricing/Page_Car Rental - Portal/i_Today_icon-arrow-left'))
WebUI.focus(findTestObject('Competitor Behaviour/DropOff Date10'))
WebUI.click(findTestObject('Competitor Behaviour/DropOff Date10'))

// Select Duration
WebUI.click(findTestObject('Competitor Behaviour/Duration'))
WebUI.selectOptionByValue(findTestObject('Competitor Behaviour/Duration'),'ALL', false)
WebUI.click(findTestObject('Competitor Behaviour/Duration'))

// Select Search Button
WebUI.focus(findTestObject('Competitor Behaviour/Search Button'))
WebUI.click(findTestObject('Competitor Behaviour/Search Button'))
WebUI.waitForPageLoad(10)

// Select Copy button
WebUI.scrollToElement(findTestObject('Competitor Behaviour/Copy Button'),1)
WebUI.focus(findTestObject('Competitor Behaviour/Copy Button'))
WebUI.click(findTestObject('Competitor Behaviour/Copy Button'))
WebUI.verifyTextPresent('Copy to clipboard', false)
WebUI.sendKeys(findTestObject('Competitor Behaviour/Copy Span'), Keys.chord(Keys.ESCAPE))

// Select CSV Download button
WebUI.click(findTestObject('Competitor Behaviour/CSV Button'))

//Change to number of records viewed
WebUI.focus(findTestObject('Competitor Behaviour/Display Records'))
WebUI.click(findTestObject('Competitor Behaviour/Display Records'))
WebUI.selectOptionByValue(findTestObject('Competitor Behaviour/Display Records'),'25',false)
WebUI.click(findTestObject('Competitor Behaviour/Display Records'))
WebUI.scrollToElement(findTestObject('Competitor Behaviour/Pagination'),1)

//Change Data Tabel Sorting
WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Company'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Company'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Pickup Location'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Pickup Location'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Dropoff Location'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Dropoff Location'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Pickup Date'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Pickup Date'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Duration'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Duration'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Car'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Car'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Last Update Rate'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Last Update Rate'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-This Update Rate'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-This Update Rate'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Diff'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Diff'))

WebUI.focus(findTestObject('Competitor Behaviour/Table_Sort-Priority'))
WebUI.click(findTestObject('Competitor Behaviour/Table_Sort-Priority'))

//User Logs out
'Switch back to default content'
WebUI.switchToDefaultContent()
WebUI.focus(findTestObject('Competitor Behaviour/span_Welcome'))
WebUI.click(findTestObject('Competitor Behaviour/span_Welcome'))
WebUI.focus(findTestObject('Global Objects/a_Logout'))
WebUI.click(findTestObject('Global Objects/a_Logout'))
WebUI.closeBrowser()