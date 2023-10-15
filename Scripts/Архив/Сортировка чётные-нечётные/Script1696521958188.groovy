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

int c
int numberOfSpaces
int numberOfFilials
int i
int a

String filialsDzoNames

String p1

String p2

String percents1 = ''

String percents2 = ''

a = 84

String percents = '4.33 19.78 30.16 5.64 9.52 10.46 7.30 23.54 5.39 6.83 8.10    2.56 5.82 10.11 7.00 9.45 8.59 4.34 20.07 34.97 5.11 9.21 10.36 7.31 26.58 5.29 6.79 8.06 2.50 5.55 9.88 6.74 9.24 8.51 Россети ФСКЕЭС Россети ФСКЕЭС 021515'

percents = percents.replaceAll('  ','')

percents = percents.trim()

filialsDzoNames = percents.replace('.','')//удалить все точки

println(filialsDzoNames)

filialsDzoNames = filialsDzoNames.replaceAll('\\d+','')//удалить все цифры

filialsDzoNames = filialsDzoNames.trim()

println(filialsDzoNames)

i = percents.indexOf(filialsDzoNames.substring(0, 3))

percents = percents.substring(0, i).trim()

println(percents)

numberOfSpaces = percents.count(' ')//посчитать количество пробелов

println(numberOfSpaces)

numberOfFilials = (numberOfSpaces+1)/2 //посчитать количество пар

println(numberOfFilials)

i = percents.indexOf(' ')

percents1 = percents.substring(0, i)

println(percents1)

percents2 = percents.substring(i, percents.length()).trim()

println(percents2)


for (c=1;c<numberOfFilials+1;c++) {
	
i = percents2.indexOf(' ')

percents1 = percents1 + ' ' + percents2.substring(0, i)

println(percents1)

percents2 = percents.substring(percents1.length(), percents.length())

println(percents2)
}

println(percents1)

println(percents2)
