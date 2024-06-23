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

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(30)

int c

int numberOfSpaces

int numberOfFilials

int i

int a

int filialNumberInRow = 2

String filialsDzoNames

String p1

String p2

String page1

String page2

a = 84

String page = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

page = page.replaceAll('\\n',' ')

i = page.indexOf('  ')

if (i > -1) {
    page = page.replaceAll('  ', ' ')
}

if (i > -1) {
    page = page.replaceAll('  ', ' ')
}

page = page.trim()

filialsDzoNames = page.replace('.', '')

println(filialsDzoNames)

filialsDzoNames = filialsDzoNames.replaceAll('\\d+', '')

filialsDzoNames = filialsDzoNames.trim()

println(filialsDzoNames)

i = page.indexOf(filialsDzoNames.substring(0, 3))

page = page.substring(0, i).trim()

println(page)

numberOfSpaces = page.count(' ' )//посчитать количество пробелов

println(numberOfSpaces)

numberOfFilials = ((numberOfSpaces + 1) / 2) //посчитать количество пар

println(numberOfFilials)

i = page.indexOf(' ')

page1 = page.substring(0, i)

page2 = page.substring(i, page.length()).trim()

for (c = 1; c < (numberOfFilials + 1); c++) {
    i = page2.indexOf(' ')

    page1 = ((page1 + ' ') + page2.substring(0, i))

    page2 = page.substring(page1.length(), page.length())
}

println(page1)

println(page2)

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

println(page1)

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

println(page2)

