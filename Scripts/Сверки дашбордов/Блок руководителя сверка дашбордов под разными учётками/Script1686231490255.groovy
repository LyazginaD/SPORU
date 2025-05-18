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

int run = 1

def data = findTestData('PlanFact')

int n

int urlData

String dashboardName

String a1

String a2

String a3

String a4

String a5

String a6

String a7

String a8

String a9

String user

for (run = 1; run < 4; run++) {
    VipolnenieBiznesPlana(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

for (run = 1; run < 4; run++) {
    ViruchkaVRublyah(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

for (run = 1; run < 4; run++) {
    ObyemPoter(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

for (run = 1; run < 4; run++) {
    OtpuskIzSeti(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

for (run = 1; run < 4; run++) {
    OtpuskVSet(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

//for (run = 1; run < 4; run++) {
//    PokazateliBalansa(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
//}
//for (run = 1; run < 4; run++) {
//    OtpuskIzSeti2006(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
//}
for (run = 1; run < 4; run++) {
    KotlovoyPolezniyOtpusk(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

for (run = 1; run < 4; run++) {
    FaktorniyAnaliz(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

for (run = 1; run < 4; run++) {
    ViruchkaPoDZO(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

for (run = 1; run < 4; run++) {
    PrognozPoDZO(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

WebUI.delay(40)

for (run = 1; run < 4; run++) {
    PrognozPoOtraslyam(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9, urlData)
}

static def CheckPageDownload(def urlData, def run) {
    int i = 1

    int ii = 0

    String urlText

    String searchWord

    WebUI.deleteAllCookies()

    WebUI.refresh()

    WebUI.delay(40)

    WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

    boolean pageLoaded1 = WebUI.verifyElementPresent(findTestObject('Страница авторизации/Text'), 30)

    if (pageLoaded1 == false) {
        WebUI.refresh()

        WebUI.delay(40)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))
    }
    
    urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

    WebUI.delay(40)

    searchWord = 'Вход'

    if (urlText.contains(searchWord) == false) {
        for (urlText.contains(searchWord) == false; i < 4; ii++) {
            i = (i + 1)

            WebUI.refresh()

            WebUI.delay(40)

            WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

            WebUI.delay(40)

            urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
        }
    }
    
    WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, run))

    WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, run))

    WebUI.click(findTestObject('Страница авторизации/button_'))

    WebUI.delay(40)

    searchWord = 'а'

    boolean pageLoaded2 = WebUI.verifyElementPresent(findTestObject('Страница авторизации/Text'), 50)

    if (pageLoaded2 == false) {
        WebUI.refresh()

        WebUI.delay(40)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))
    }
    
    urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

    if (urlText.contains('ошибка') || (urlText.contains(searchWord) == false)) {
        for (urlText.contains(searchWord) == false; i < 10; ii++) {
            i = (i + 1)

            WebUI.refresh()

            WebUI.delay(40)

            WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, urlData))

            WebUI.delay(40)

            urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
        }
    }
}

def VipolnenieBiznesPlana(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    String a10

    String a11

    String a12

    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Выполнение бизнес-плана'

    WebUI.openBrowser('')

    urlData = 1

    CheckPageDownload(urlData, run)

    ZakrytOpoveshenie()

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

    WebUI.delay(40)

    ZakrytOpoveshenie()

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2025 список'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/2025 список'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/1 квартал 2025 список'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/1 квартал 2025'), FailureHandling.CONTINUE_ON_FAILURE)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

    WebUI.delay(40)

    '!'
    ZakrytOpoveshenie()

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

    'Выбрать ПАО Россети'
    WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

    WebUI.delay(40)

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Проценты'))

        a2 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Виджет Итого'))

        a3 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Список ДЗО'))

        a4 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Отклонения за 1 месяц'))

        a5 = WebUI.getText(findTestObject('Выполнение бизнес-плана/table'))

        a6 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Отклонения за 3 месяца'))

        a7 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период ПАО Россети'))

        a7 = (a7 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск из сети за отчётный период ПАО Россети')))

        a7 = (a7 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период ПАО Россети')))

        WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период ПАО Россети')))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск из сети за отчётный период ПАО Россети')))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период ПАО Россети')))

        WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Проценты'))

        a2 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Виджет Итого'))

        a3 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Список ДЗО'))

        a4 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Отклонения за 1 месяц'))

        a5 = WebUI.getText(findTestObject('Выполнение бизнес-плана/table'))

        a6 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Отклонения за 3 месяца'))

        a7 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период ПАО Россети'))

        a7 = (a7 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск из сети за отчётный период ПАО Россети')))

        a7 = (a7 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период ПАО Россети')))

        WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период ПАО Россети')))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск из сети за отчётный период ПАО Россети')))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период ПАО Россети')))

        WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))

        n = (n + 1)

        int b = data.getRowNumbers() + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(6, b), a5)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(7, b), a6)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(8, b), a7)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(9, b), a8)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Проценты'))

        a2 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Виджет Итого'))

        a3 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Список ДЗО'))

        a4 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Отклонения за 1 месяц'))

        a5 = WebUI.getText(findTestObject('Выполнение бизнес-плана/table'))

        a6 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Отклонения за 3 месяца'))

        a7 = WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск в сеть за отчётный период ПАО Россети'))

        a7 = (a7 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Отпуск из сети за отчётный период ПАО Россети')))

        a7 = (a7 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/Факт Потери за отчётный период ПАО Россети')))

        WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск в сеть за отчётный период ПАО Россети')))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Отпуск из сети за отчётный период ПАО Россети')))

        a8 = (a8 + WebUI.getText(findTestObject('Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/План Потери за отчётный период ПАО Россети')))

        WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))

        WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))

        n = (n + 2)

        int b = data.getRowNumbers() + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(6, b), a5)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(7, b), a6)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(8, b), a7)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(9, b), a8)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def ViruchkaVRublyah(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Вырука в рублях'

    WebUI.openBrowser('')

    urlData = 2

    CheckPageDownload(urlData, run)

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр Период'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка в рублях/Снять выделение в фильтре Дата'))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Дата'))

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр Период'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка в рублях/Снять выделение в фильтре Дата'))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/2025 список'), 30)

    WebUI.click(findTestObject('Выручка в рублях/2025 список'))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/1 квартал 2025 список'), 30)

    WebUI.click(findTestObject('Выручка в рублях/1 квартал 2025 выбрать'), FailureHandling.CONTINUE_ON_FAILURE)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Дата'))

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Выручка в рублях/Заголовок дашборда'), 30)

    WebUI.delay(40)

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Выручка в рублях/График План'))

        a2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт'))

        a3 = WebUI.getText(findTestObject('Выручка в рублях/График Отклонение выручки'))

        a3 = a3.substring(a3.lastIndexOf('Отклонение'))

        WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях'))

        a4 = WebUI.getText(findTestObject('Выручка в рублях/График Отклонение выручки'))

        a4 = a4.substring(a4.lastIndexOf('Отклонение'))

        WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с процентов на млн Выручка в рублях'))

        n = (n + 3)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Выручка в рублях/График План'))

        a2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт'))

        a3 = WebUI.getText(findTestObject('Выручка в рублях/График Отклонение выручки'))

        a3 = a3.substring(a3.lastIndexOf('Отклонение'))

        WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях'))

        a4 = WebUI.getText(findTestObject('Выручка в рублях/График Отклонение выручки'))

        a4 = a4.substring(a4.lastIndexOf('Отклонение'))

        WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с процентов на млн Выручка в рублях'))

        n = (n + 4)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Выручка в рублях/График План'))

        a2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт'))

        a3 = WebUI.getText(findTestObject('Выручка в рублях/График Отклонение выручки'))

        a3 = a3.substring(a3.lastIndexOf('Отклонение'))

        WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях'))

        a4 = WebUI.getText(findTestObject('Выручка в рублях/График Отклонение выручки'))

        a4 = a4.substring(a4.lastIndexOf('Отклонение'))

        WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с процентов на млн Выручка в рублях'))

        n = (n + 5)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def ObyemPoter(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Объём потерь'

    WebUI.openBrowser('')

    urlData = 14

    CheckPageDownload(urlData, run)

    a9 = ''

    a3 = ''

    a6 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Объем потерь/divObemPoter'))

        a2 = WebUI.getText(findTestObject('Объем потерь/divUrovenPoter'))

        a3 = WebUI.getText(findTestObject('Объем потерь/divOtkloneniyaObemaPoter'))

        a4 = WebUI.getText(findTestObject('Объем потерь/divOtkloneniyaUrovnyaPoter'))

        n = (n + 6)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Объем потерь/divObemPoter'))

        a2 = WebUI.getText(findTestObject('Объем потерь/divUrovenPoter'))

        a3 = WebUI.getText(findTestObject('Объем потерь/divOtkloneniyaObemaPoter'))

        a4 = WebUI.getText(findTestObject('Объем потерь/divOtkloneniyaUrovnyaPoter'))

        n = (n + 7)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Объем потерь/divObemPoter'))

        a2 = WebUI.getText(findTestObject('Объем потерь/divUrovenPoter'))

        a3 = WebUI.getText(findTestObject('Объем потерь/divOtkloneniyaObemaPoter'))

        a4 = WebUI.getText(findTestObject('Объем потерь/divOtkloneniyaUrovnyaPoter'))

        n = (n + 8)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def OtpuskIzSeti(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Отпуск из сети'

    WebUI.openBrowser('')

    urlData = 15

    CheckPageDownload(urlData, run)

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Отпуск из сети/span1'))

        a2 = WebUI.getText(findTestObject('Отпуск из сети/span2'))

        a3 = WebUI.getText(findTestObject('Отпуск из сети/span3'))

        a4 = WebUI.getText(findTestObject('Отпуск из сети/График1'))

        a5 = WebUI.getText(findTestObject('Отпуск из сети/График2'))

        n = (n + 9)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Отпуск из сети/span1'))

        a2 = WebUI.getText(findTestObject('Отпуск из сети/span2'))

        a3 = WebUI.getText(findTestObject('Отпуск из сети/span3'))

        a4 = WebUI.getText(findTestObject('Отпуск из сети/График1'))

        a5 = WebUI.getText(findTestObject('Отпуск из сети/График2'))

        n = (n + 10)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(6, b), a5)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Отпуск из сети/span1'))

        a2 = WebUI.getText(findTestObject('Отпуск из сети/span2'))

        a3 = WebUI.getText(findTestObject('Отпуск из сети/span3'))

        a4 = WebUI.getText(findTestObject('Отпуск из сети/График1'))

        a5 = WebUI.getText(findTestObject('Отпуск из сети/График2'))

        n = (n + 11)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(6, b), a5)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def OtpuskVSet(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Отпуск в сеть'

    WebUI.openBrowser('')

    urlData = 16

    CheckPageDownload(urlData, run)

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Отпуск в сеть/span1'))

        a2 = WebUI.getText(findTestObject('Отпуск в сеть/span2'))

        a3 = WebUI.getText(findTestObject('Отпуск в сеть/График1'))

        a4 = WebUI.getText(findTestObject('Отпуск в сеть/График2'))

        n = (n + 12)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Отпуск в сеть/span1'))

        a2 = WebUI.getText(findTestObject('Отпуск в сеть/span2'))

        a3 = WebUI.getText(findTestObject('Отпуск в сеть/График1'))

        a4 = WebUI.getText(findTestObject('Отпуск в сеть/График2'))

        n = (n + 13)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Отпуск в сеть/span1'))

        a2 = WebUI.getText(findTestObject('Отпуск в сеть/span2'))

        a3 = WebUI.getText(findTestObject('Отпуск в сеть/График1'))

        a4 = WebUI.getText(findTestObject('Отпуск в сеть/График2'))

        n = (n + 14)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def PokazateliBalansa(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Показатели баланса электроэнергии 2006-2021'

    WebUI.openBrowser('')

    urlData = 8

    CheckPageDownload(urlData, run)

    a2 = ''

    a3 = ''

    a4 = ''

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Показатели баланса электроэнергии 2006-2021/График1'))

        int i = 274

        a1 = a1.substring(i, a1.length())

        n = (n + 15)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Показатели баланса электроэнергии 2006-2021/График1'))

        int i = 274

        a1 = a1.substring(i, a1.length())

        n = (n + 16)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Показатели баланса электроэнергии 2006-2021/График1'))

        int i = 274

        a1 = a1.substring(i, a1.length())

        n = (n + 17)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def OtpuskIzSeti2006(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Отпуск из сети 2006-2021'

    WebUI.openBrowser('')

    urlData = 7

    CheckPageDownload(urlData, run)

    a2 = ''

    a3 = ''

    a4 = ''

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Отпуск из сети 2006-2021/График1'))

        a1 = a1.replaceAll('\\s+', '')

        n = (n + 18)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Отпуск из сети 2006-2021/График1'))

        a1 = a1.replaceAll('\\s+', '')

        n = (n + 19)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        WebUI.refresh()

        WebUI.delay(40)

        a1 = WebUI.getText(findTestObject('Отпуск из сети 2006-2021/График1'))

        a1 = a1.replaceAll('\\s+', '')

        n = (n + 20)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def KotlovoyPolezniyOtpusk(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Котловой полезный отпуск'

    WebUI.openBrowser('')

    urlData = 18

    CheckPageDownload(urlData, run)

    a2 = ''

    a3 = ''

    a4 = ''

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1'))

        a1 = a1.replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').replaceAll('[\\r?\n|\r]', '').replaceAll('\\s+', '')

        if (a1 == '') {
            WebUI.refresh()

            WebUI.delay(40)

            a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1'))

            a1 = a1.replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').replaceAll('[\\r?\n|\r]', '').replaceAll('\\s+', 
                '')

            if (a1 == '') {
                WebUI.refresh()

                WebUI.delay(40)

                a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1')).replaceAll('\\s+', '')
            }
        }
        
        n = (n + 21)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1'))

        a1 = a1.replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').replaceAll('[\\r?\n|\r]', '').replaceAll('\\s+', '')

        if (a1 == '') {
            WebUI.refresh()

            WebUI.delay(40)

            a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1'))

            a1 = a1.replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').replaceAll('[\\r?\n|\r]', '').replaceAll('\\s+', 
                '')

            if (a1 == '') {
                WebUI.refresh()

                WebUI.delay(40)

                a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1')).replaceAll('\\s+', '')
            }
        }
        
        n = (n + 22)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1'))

        a1 = a1.replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').replaceAll('[\\r?\n|\r]', '').replaceAll('\\s+', '')

        if (a1 == '') {
            WebUI.refresh()

            WebUI.delay(40)

            a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1'))

            a1 = a1.replaceAll('[а-яА-Я]', '').replaceAll('\\p{P}', '').replaceAll('[\\r?\n|\r]', '').replaceAll('\\s+', 
                '')

            if (a1 == '') {
                WebUI.refresh()

                WebUI.delay(40)

                a1 = WebUI.getText(findTestObject('Котловой полезный отпуск/График 1')).replaceAll('\\s+', '')
            }
        }
        
        n = (n + 23)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def FaktorniyAnaliz(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Факторный анализ'

    WebUI.openBrowser('')

    urlData = 3

    CheckPageDownload(urlData, run)

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

    WebUI.scrollToElement(findTestObject('Факторный анализ/2025 список'), 30)

    WebUI.click(findTestObject('Факторный анализ/2025 список'))

    WebUI.scrollToElement(findTestObject('Факторный анализ/1 квартал 2025 список'), 30)

    WebUI.click(findTestObject('Факторный анализ/1 квартал 2025 выбрать'), FailureHandling.CONTINUE_ON_FAILURE)

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Факторный анализ/span1 Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Факторный анализ/span2 Блок руководителя'))

        a3 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Блок руководителя'))

        WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц Выручка'))

        a4 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Блок руководителя'))

        n = (n + 24)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Факторный анализ/span1 Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Факторный анализ/span2 Блок руководителя'))

        a3 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Блок руководителя'))

        WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц Выручка'))

        a4 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Блок руководителя'))

        n = (n + 25)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Факторный анализ/span1 Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Факторный анализ/span2 Блок руководителя'))

        a3 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Блок руководителя'))

        WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц Выручка'))

        a4 = WebUI.getText(findTestObject('Факторный анализ/График Всего отклонения по факторам Блок руководителя'))

        n = (n + 26)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def ViruchkaPoDZO(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Выручка по ДЗО'

    WebUI.openBrowser('')

    urlData = 5

    CheckPageDownload(urlData, run)

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

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/2025 список'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/2025 список'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/1 квартал 2025 список'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/1 квартал 2025 выбрать'), FailureHandling.CONTINUE_ON_FAILURE)

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Дата'))

    a3 = ''

    a4 = ''

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Выручка по ДЗО/График1 Выполнение плановых показателей Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Выручка по ДЗО/График2 Выполнение плановых показателей Блок руководителя'))

        a2 = a2.substring(0, a2.indexOf('АО «Тываэнерго»')).replaceAll('[а-яА-Я]', '')

        n = (n + 27)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Выручка по ДЗО/График1 Выполнение плановых показателей Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Выручка по ДЗО/График2 Выполнение плановых показателей Блок руководителя'))

        a2 = a2.substring(0, a2.indexOf('АО «Тываэнерго»')).replaceAll('[а-яА-Я]', '')

        n = (n + 28)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Выручка по ДЗО/График1 Выполнение плановых показателей Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Выручка по ДЗО/График2 Выполнение плановых показателей Блок руководителя'))

        a2 = a2.substring(0, a2.indexOf('АО «Тываэнерго»')).replaceAll('[а-яА-Я]', '')

        n = (n + 29)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def PrognozPoDZO(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Прогноз по ДЗО'

    WebUI.openBrowser('')

    urlData = 19

    CheckPageDownload(urlData, run)

    a3 = ''

    a4 = ''

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Прогноз по ДЗО/График1'))

        int i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 26, a1.length()))
        }
        
        i = a1.indexOf('Динамика электропотребления, млн. кВт.ч.')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 40, a1.length()))
        }
        
        a1 = a1.trim()

        a2 = WebUI.getText(findTestObject('Прогноз по ДЗО/График2'))

        a3 = WebUI.getText(findTestObject('Прогноз по ДЗО/График3'))

        a4 = WebUI.getText(findTestObject('Прогноз по ДЗО/График4'))

        WebUI.click(findTestObject('Прогноз по ДЗО/Переключить отображение с процентов на абс Блок руководителя'))

        a5 = WebUI.getText(findTestObject('Прогноз по ДЗО/График5'))

        a6 = WebUI.getText(findTestObject('Прогноз по ДЗО/График6'))

        WebUI.click(findTestObject('Прогноз по ДЗО/Переключить отображение с абс на проценты'))

        n = (n + 30)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Прогноз по ДЗО/График1'))

        int i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 26, a1.length()))
        }
        
        i = a1.indexOf('Динамика электропотребления, млн. кВт.ч.')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 40, a1.length()))
        }
        
        a1 = a1.trim()

        a2 = WebUI.getText(findTestObject('Прогноз по ДЗО/График2'))

        a3 = WebUI.getText(findTestObject('Прогноз по ДЗО/График3'))

        a4 = WebUI.getText(findTestObject('Прогноз по ДЗО/График4'))

        WebUI.click(findTestObject('Прогноз по ДЗО/Переключить отображение с процентов на абс Блок руководителя'))

        a5 = WebUI.getText(findTestObject('Прогноз по ДЗО/График5'))

        a6 = WebUI.getText(findTestObject('Прогноз по ДЗО/График6'))

        WebUI.click(findTestObject('Прогноз по ДЗО/Переключить отображение с абс на проценты'))

        n = (n + 31)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(6, b), a5)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(7, b), a6)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Прогноз по ДЗО/График1'))

        int i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 26, a1.length()))
        }
        
        i = a1.indexOf('Динамика электропотребления, млн. кВт.ч.')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 40, a1.length()))
        }
        
        a1 = a1.trim()

        a2 = WebUI.getText(findTestObject('Прогноз по ДЗО/График2'))

        a3 = WebUI.getText(findTestObject('Прогноз по ДЗО/График3'))

        a4 = WebUI.getText(findTestObject('Прогноз по ДЗО/График4'))

        WebUI.click(findTestObject('Прогноз по ДЗО/Переключить отображение с процентов на абс Блок руководителя'))

        a5 = WebUI.getText(findTestObject('Прогноз по ДЗО/График5'))

        a6 = WebUI.getText(findTestObject('Прогноз по ДЗО/График6'))

        WebUI.click(findTestObject('Прогноз по ДЗО/Переключить отображение с абс на проценты'))

        n = (n + 32)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(4, b), a3)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(5, b), a4)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(6, b), a5)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(7, b), a6)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

def PrognozPoOtraslyam(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9, def urlData) {
    n = (data.getRowNumbers() + 1)

    println(n)

    dashboardName = 'Прогноз по отраслям'

    WebUI.openBrowser('')

    urlData = 6

    CheckPageDownload(urlData, run)

    a3 = ''

    a4 = ''

    a5 = ''

    a6 = ''

    a7 = ''

    a8 = ''

    a9 = ''

    if (run == 1) {
        user = 'админ'

        a1 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

        WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с процентов на абс Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

        WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с абс на проценты'))

        int i = a1.indexOf('млрд. кВт.ч.')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 12, a1.length()))
        }
        
        i = a1.indexOf('Выручка')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 8, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        i = a1.indexOf('Отклонения')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 11, a1.length()))
        }
        
        n = (n + 33)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 2) {
        user = 'Андреева'

        a1 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

        WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с процентов на абс Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

        WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с абс на проценты'))

        int i = a1.indexOf('млрд. кВт.ч.')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 12, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        i = a1.indexOf('Выручка')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 8, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        i = a1.indexOf('Отклонения по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 38, a1.length()))
        }
        
        i = a1.indexOf('Отклонения')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 11, a1.length()))
        }
        
        n = (n + 34)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    if (run == 3) {
        user = 'Попова'

        a1 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

        WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с процентов на абс Блок руководителя'))

        a2 = WebUI.getText(findTestObject('Прогноз по отраслям/Виджеты дашборда'))

        WebUI.click(findTestObject('Прогноз по отраслям/Переключить отображение с абс на проценты'))

        int i = a1.indexOf('млрд. кВт.ч.')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 12, a1.length()))
        }
        
        i = a1.indexOf('Выручка, млрд. руб.')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 20, a1.length()))
        }
        
        i = a1.indexOf('Выручка')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 8, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        i = a1.indexOf('Отклонения')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 11, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        i = a1.indexOf('по ПАО Россети на 2023 год')

        if (i > -1) {
            a1 = (a1.substring(0, i) + a1.substring(i + 27, a1.length()))
        }
        
        println(a1)

        n = (n + 35)

        int b = (n - run) + 1

        WebUI.verifyEqual(findTestData('PlanFact').getValue(2, b), a1)

        WebUI.verifyEqual(findTestData('PlanFact').getValue(3, b), a2)

        WriteToExcel(user, dashboardName, n, data, run, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    }
    
    WebUI.closeBrowser()
}

static void ZakrytOpoveshenie() {
    String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

    println(opoveshenie)

    if (opoveshenie == 'Просьба обратить внимание') {
        WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
    }
}

static def WriteToExcel(def user, def dashboardName, def n, def data, def run, def a1, def a2, def a3, def a4, def a5, def a6, def a7, def a8, def a9) {
    String sheetName = 'Sheet1'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 10, user)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, a1)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, a2)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, a3)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, a4)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, a5)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, a6)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, a7)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 8, a8)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 9, a9)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

