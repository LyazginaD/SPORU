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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 5))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(10)

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Дата'))

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Дата'))

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/2023 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выручка по ДЗО/2023 список'))

WebUI.scrollToElement(findTestObject('Выручка по ДЗО/1 квартал 2023 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выручка по ДЗО/1 квартал 2023 выбрать'))

WebUI.click(findTestObject('Выручка по ДЗО/2 квартал 2023 список'))

WebUI.click(findTestObject('Выручка по ДЗО/Апрель'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Дата'))

def dzoTest = DzoTest()

WebUI.closeBrowser()

def DzoTest() {
    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр ДЗО'))

    'Нажать "Снять выделение в фильтре ДЗО"'
    WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре ДЗО'))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре ДЗО'))

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр ДЗО'))

    WebUI.click(findTestObject('Выручка по ДЗО/Раскрыть список ПАО Россети'))

    WebUI.click(findTestObject('Общие объекты/Раскрыть список РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Московский регион Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Московский регион Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    def change = Change()

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Московская область'), 30)

    WebUI.click(findTestObject('Общие объекты/Московская область'))

    change = Change()

    WebUI.scrollToElement(findTestObject('Общие объекты/Москва'), 30)

    WebUI.click(findTestObject('Общие объекты/Москва'))

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Заголовок дашборда'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре ДЗО'))

    def test = Tumbler()
}

static void Tumbler() {
    def test = Test()

    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Внутренний оборот в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Выручка'))

    test = Test()

    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/По передаче в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Выручка'))

    test = Test()

    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/По передаче в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Выручка'))

    test = Test()

    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Выручка'))
}

static def Change() {
    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре ДЗО'))

    def tumbler = Tumbler()

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре ДЗО'))
}

static def Test() {
    if (WebUI.verifyTextNotPresent('нет данных', false) == true) {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == true) {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == true) {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    } else {
                        def write = WriteToExcel()
                    }
                } else {
                    def write = WriteToExcel()
                }
            } else {
                def write = WriteToExcel()
            }
        } else {
            def write = WriteToExcel()
        }
    } else {
        def write = WriteToExcel()
    }
}

static def WriteToExcel() {

    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Выручка по ДЗО/Фильтр ДЗО'))

    String date = WebUI.getText(findTestObject('Выручка по ДЗО/Фильтр Дата'))

    String viruchka = WebUI.getText(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    if (viruchka == 'Выбрано: 2') {
        viruchka = 'Выбраны оба пункта'
    }
    
    if (viruchka == 'Все') {
        viruchka = 'Не выбран ни один пункт'
    }
    
    println(date)

    String dashboardName = 'Выручка по ДЗО'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, date)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, viruchka)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

