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

String page
String page1
String page2
int i

page =  """%
4.89 4.89
7.65 7.65
План
Факт
1
100
"""
page = page.replaceAll('\\n', '_')

i = page.indexOf('%')

if(i>-1) {

	page = page.substring(2, page.length())
}

page1 = page.substring(page.indexOf(" ")+1).trim()

page1 = page1.substring(0, page1.indexOf("_"))

page2 = page.substring(page.lastIndexOf(page1) + page1.length() + 1, page.length())

page2 = page2.substring(page2.indexOf(' ') + 1, page2.indexOf('_'))
		
println("page1: " + page1 + "\n" + "page2: " + page2)

