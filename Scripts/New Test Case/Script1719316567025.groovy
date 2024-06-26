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

int ii
int ii1
String y
String y1 = '8.78 8.78/8.77 8.77/1/100'
String y2
String z = 'ПАО Россети/'

ii = y1.indexOf('План/Факт/')
if(ii>-1) {
	y1 = y1.replaceAll('План/Факт/', '')
}
y1 = y1.substring(y1.indexOf('%') + 1, y1.length()).trim()

for(ii=1;ii<3;ii++) {
	y1 = y1.substring(0, y1.lastIndexOf('/'))
	
}
println(y1)

ii = (y1.length() / 2)

y2 = y1.substring(ii, y1.length()).trim()
println(y2)
y1 = y1.substring(0, ii).trim()
println(y1)
ii = (y1.length() / 2)
println(ii)
y1 = y1.substring(0, ii).trim()
println(y1)
ii = (y2.length() / 2)
println(ii)
y2 = y2.substring(ii, y2.length()).trim()
println(y2)
z = (((z + y1) + '/') + y2)

println(z)