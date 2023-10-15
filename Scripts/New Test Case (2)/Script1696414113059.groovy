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
int filialNumberInRow = 5

String page = '4.36_20.64_30.04_5.77_9.41_10.75_7.58_23.81_5.45_6.95_8.27_2.56_6.01_10.38_7.14_9.60_8.51_4.39_20.90_34.51_5.25_9.08_10.61_7.52_27.06_5.33_6.92_8.23_2.46_5.70_10.13_6.89_9.43_8.48_Россети ФСКЕЭС_АО«Тываэнерго»_АО«Чеченэнерго»_Россети Волга_РоссетиКубань_РоссетиЛенэнерго(ГК)_РоссетиМосковскийрегион_РоссетиСеверныйКавказ_РоссетиСеверо-Запад_РоссетиСибирь_РоссетиТомск_РоссетиТюмень_Россети Урал(ГК)_РоссетиЦентр (ГК)_РоссетиЦентр иПриволжье(ГК)_Россети Юг(ГК)_РоссетиЯнтарь_0_10_20_30_40'

filialsDzoNames = page.replace('.', '')

filialsDzoNames = filialsDzoNames.replaceAll('\\d+', '')

filialsDzoNames = filialsDzoNames.replaceAll('_', '').trim()

i = page.indexOf(filialsDzoNames.substring(0, 3))

page = page.substring(0, i).trim()

numberOfSpaces = page.count('_')

numberOfFilials = (numberOfSpaces / 2)

page = page.replaceAll('_', ' ').trim()
    
i = page.indexOf(' ')

page1 = page.substring(0, i)

page2 = page.substring(i, page.length()).trim()

for (c = 1; c < (numberOfFilials + 1); c++) {
	
	i = page2.indexOf(' ')

	page1 = ((page1 + ' ') + page2.substring(0, i))

	page2 = page.substring(page1.length(), page.length())
}
        
println('page1: '+page1)
	
println('page2: '+page2)

i = page1.indexOf(' ')

if (i > -1) {
	for (c = 1; c < filialNumberInRow; c++) {
		i = page1.indexOf(' ')

		if (i > -1) {
			page1 = page1.substring(i, page1.length()).trim()
		}
	}
}
        
i = page1.indexOf(' ')

if (i > -1) {
	page1 = page1.substring(0, i).trim()
}
        
i = page2.indexOf(' ')

if (i > -1) {
	for (c = 1; c < filialNumberInRow; c++) {
		i = page2.indexOf(' ')

		if (i > -1) {
			page2 = page2.substring(i, page2.length()).trim()
		}
	}
}
        
i = page2.indexOf(' ')

if (i > -1) {
	page2 = page2.substring(0, i).trim()
}
    
println('page1: '+page1)

println('page2: '+page2)