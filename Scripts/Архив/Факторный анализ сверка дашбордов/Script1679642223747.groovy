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

Date date = new Date()

String todaysDate = date.format('dd.MM.yyyy')

String typeOfData

String otobrajeniyeDannyh

println(todaysDate)

WebUI.openBrowser('')

int run = 1

for (run = 1; run < 3; run++) {
    Test(run, todaysDate, typeOfData, otobrajeniyeDannyh)
}

//Notice(run)
WebUI.closeBrowser()

static def Test(def run, def todaysDate, def typeOfData, def otobrajeniyeDannyh) {
    WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 3))

    Autorization(run)

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Факторный анализ/Фильтр Период'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата'))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Факторный анализ/Фильтр Период'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата'))

    WebUI.scrollToElement(findTestObject('Факторный анализ/2024 список'), 30)

    WebUI.click(findTestObject('Факторный анализ/2024 список'))

    WebUI.scrollToElement(findTestObject('Факторный анализ/1 квартал 2024 список'), 30)

    WebUI.click(findTestObject('Факторный анализ/1 квартал 2024 список'))

    WebUI.click(findTestObject('Факторный анализ/Январь 2024'))

    WebUI.click(findTestObject('Факторный анализ/Февраль 2024'))

    WebUI.click(findTestObject('Факторный анализ/Март 2024'))

    WebUI.scrollToElement(findTestObject('Факторный анализ/2 квартал 2024 список'), 30)

    WebUI.click(findTestObject('Факторный анализ/2 квартал 2024 список'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Факторный анализ/Апрель 2024'), FailureHandling.CONTINUE_ON_FAILURE)

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

    String a1

    String a2

    if (run == 1) {
        a = WebUI.getText(findTestObject('Факторный анализ/Отклонения выручки по факторам Блок руководителя'))

        a = a.replaceAll('[а-яА-Я]', '')

        a = a.substring(0, a.indexOf('(')).trim()

        a = a.replaceAll('\\s+', '')
    } else {
        WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц Выручка'))

        a1 = WebUI.getText(findTestObject('Факторный анализ/span1 Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Факторный анализ/span2 Блок руководителя'))

        a = (a1 + a2)

        a = a.replaceAll('\\s+', '').trim()
    }
    
    println(a)

    WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 11))

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Факторный анализ/Фильтр Дата Выручка'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата Выручка'))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата Выручка'))

    WebUI.delay(10)

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Факторный анализ/Фильтр Дата Выручка'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре Дата Выручка'))

    WebUI.scrollToElement(findTestObject('Факторный анализ/2024 список Выручка'), 30)

    WebUI.click(findTestObject('Факторный анализ/2024 список Выручка'))

    WebUI.scrollToElement(findTestObject('Факторный анализ/1 квартал 2024 список Выручка'), 30)

    WebUI.click(findTestObject('Факторный анализ/1 квартал 2024 список Выручка'))

    WebUI.click(findTestObject('Факторный анализ/Январь 2024 Выручка'))

    WebUI.click(findTestObject('Факторный анализ/Февраль 2024 Выручка'))

    WebUI.click(findTestObject('Факторный анализ/Март 2024 Выручка'))

    WebUI.scrollToElement(findTestObject('Факторный анализ/2 квартал 2024 список Выручка'), 30)

    WebUI.click(findTestObject('Факторный анализ/2 квартал 2024 список Выручка'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Факторный анализ/Апрель 2024 Выручка'), FailureHandling.CONTINUE_ON_FAILURE)

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда Выручка'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата Выручка'))

    String b

    String b1

    String b2

    if (run == 1) {
        b = WebUI.getText(findTestObject('null'))

        b = b.replaceAll('[а-яА-Я]', '')

        b = b.substring(0, b.indexOf('(')).trim()

        b = b.replaceAll('\\s+', '')
    } else {
        WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц Выручка'))

        b1 = WebUI.getText(findTestObject('Факторный анализ/span1 Выручка'))

        b2 = WebUI.getText(findTestObject('Факторный анализ/span2 Выручка'))

        b = (b1 + b2)

        b = b.replaceAll('\\s+', '').trim()
    }
    
    println(b)

    if (WebUI.verifyEqual(a, b) == true) {
    } else {
        typeOfData = 'Отклонение (объём услуг)'

        if (run == 1) {
            otobrajeniyeDannyh = 'Филиал'

            WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh)
        } else {
            otobrajeniyeDannyh = 'Месяц'

            WriteToExcel(todaysDate, typeOfData, otobrajeniyeDannyh)
        }
    }
}

static def Autorization(def run) {
    WebUI.delay(10)

    if (run == 1) {
        WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

        WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

        WebUI.click(findTestObject('Страница авторизации/button_'))

        WebUI.delay(10)
    }
}

static def Notice(def run) {
    if (run == 1) {
        if (WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение')) == true) {
            WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
        }
    }
}

static def WriteToExcel(def todaysDate, def typeOfData, def otobrajeniyeDannyh) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Факторный анализ/Фильтр ДЗО Выручка'))

    if (dZO == 'Все') {
        dZO = 'ПАО Россети'
    }
    
    String period = WebUI.getText(findTestObject('Факторный анализ/Фильтр Период'))

    println(period)

    String dashboardName = 'Факторный анализ'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, typeOfData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, otobrajeniyeDannyh)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

