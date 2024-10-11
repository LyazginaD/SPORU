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

//substring()
String a = '123 Аа Аа%'

String b

String c

String d

int i1 = a.indexOf('Аа')

int i = a.lastIndexOf('Аа')

println(i)

b = a.substring(i)

println(b)

c = a.substring(0,i)

println(c)

d = a.substring(i1,i)

println(d)

//.split()

b = a.split('A')[0]

println(b)

//.replaceAll('\\s+', '')

b = a.replace('[A]', '')

println(b)

//length()

c = a.length()

println(c)

//Дата

Date date = new Date()
String todaysDate = date.format("dd.MM.yyyy")
println(todaysDate)

'удаление переносов'
String percents1

String percents = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

println(percents)

percents1 = percents.replaceAll('[\\r?\n|\r]','')

println(percents1)

percents1 = percents.replaceAll('\\n','')

println(percents1)

percents1 = percents.replaceAll('\\v','')

println(percents1)

//length()



c = a.length()

println(c)

//Дата

Date date = new Date()
String todaysDate = date.format("dd.MM.yyyy")
println(todaysDate)

a = a.replaceAll('[а-яА-Я]', '')//удалить все буквы

a = a.replaceAll('\\d+','')//удалить все цифры

c = a.count(' ')//посчитать количество пробелов

a = a.replace('.','')//удалить все точки

.replaceAll("\\p{P}", "")//удалятся все знаки пунктуации
