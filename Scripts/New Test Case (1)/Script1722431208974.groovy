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

String urlText

String urlByPath

int urlData = 1

int i = 1

int ii = 0

int x

String dZO

boolean pageNotLoaded

String searchWord = 'Вход'

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

if (urlText.contains(searchWord) == false) {
    for (urlText.contains(searchWord) == false; i < 4; ii++) {
        i = (i + 1)

        WebUI.refresh()

        WebUI.delay(20)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

        WebUI.delay(10)

        urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
    }
}

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(50)

ZakrytOpoveshenie()

OpenFilter()

OpenRSK()

dZO = 'Россети Центр'

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр'))

CloseFilter()

ZakrytOpoveshenie()

Filials(dZO)

OpenFilter()

dZO = 'Россети Центр и Приволжье'

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

CloseFilter()

ZakrytOpoveshenie()

WebUI.closeBrowser()

static void ZakrytOpoveshenie() {
    String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

    println(opoveshenie)

    if (opoveshenie == 'Просьба обратить внимание') {
        WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
    }
}

static def Filials(def dZO) {
    int i1

    int c

    String page

    println(dZO)

    String reducedDZO

    reducedDZO = dZO.substring(dZO.indexOf(' ') + 1, dZO.length())

    if (reducedDZO.contains(' ')) {
        reducedDZO = reducedDZO.substring(reducedDZO.indexOf(' ') + 1, reducedDZO.length())

        if (reducedDZO.contains(' ')) {
            reducedDZO = reducedDZO.substring(reducedDZO.indexOf(' ') + 1, reducedDZO.length())
        }
    }
    
    println(reducedDZO)

    String dzoCut

    page = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

    println(page)

    c = page.indexOf(reducedDZO)

    if (c > -1) {
        WebUI.click(findTestObject('Выполнение бизнес-плана/список'))

        WebUI.delay(10)

        WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрытие списка'))

        WebUI.delay(10)

        page = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

        println(page)

        c = page.indexOf(reducedDZO)
    }
}

static void OpenRSK() {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список РаспредКомплекс в фильтре ДЗО'))
}

static void OpenFilter() {
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))
}

static void CloseFilter() {
    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))
}

