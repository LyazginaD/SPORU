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


String todaysDate

String typeOfData

int a = 28

int c

int i

String dZO

WebUI.delay(10)

String page = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

println(page)

page = page.replaceAll('\\n', '_')

println(page)

static void OpenFilter() {
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))
}

static void OpenRSK() {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список РаспредКомплекс в фильтре ДЗО'))
}

static void CloseFilter() {
    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))
}

static void DZO(def a) {
    OpenRSK()

    if (a == 52) {
        WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Раскрыть список Тываэнерго'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Тываэнерго'))
    }
    
    if (a == 72) {
        WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Раскрыть список Чеченэнерго'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Чеченэнерго'))
    }
    
    if (a == 28) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Волга'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Волга'))
    }
    
    if (a == 73) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Кубань'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Кубань'))
    }
    
    if (a == 77) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Ленэнерго'))
    }
    
    if (a == 74) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Московский регион'))
    }
    
    if (a == 65) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северный кавказ'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северный Кавказ'))
    }
    
    if (a == 36) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северо-Запад'))
    }
    
    if (a == 44) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Сибирь'))
    }
    
    if (a == 53) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Томск'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Томск'))
    }
    
    if (a == 80) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Тюмень'))
    }
    
    if (a == 54) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Урал'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Урал'))
    }
    
    if (a == 1) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр'))
    }
    
    if (a == 18) {
        WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'))
    }
    
    if (a == 59) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Юг'))
    }
    
    if (a == 81) {
        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'), 30)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Янтарь'))
    }
}

