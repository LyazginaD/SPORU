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

println(todaysDate)

WebUI.openBrowser('')

String urlText

String searchWord

int i

int ii

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 5))

urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

WebUI.delay(10)

searchWord = 'Вход'

if (urlText.contains(searchWord) == false) {
    for (urlText.contains(searchWord) == false; i < 4; ii++) {
        i = (i + 1)

        WebUI.refresh()

        WebUI.delay(20)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 5))

        WebUI.delay(10)

        urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
    }
}

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(50)

searchWord = 'ДЗО'

urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

if (urlText.contains('ошибка') || (urlText.contains(searchWord) == false)) {
    for (urlText.contains(searchWord) == false; i < 4; ii++) {
        i = (i + 1)

        WebUI.refresh()

        WebUI.delay(20)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 5))

        WebUI.delay(10)

        urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
    }
}

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

DzoTest(todaysDate)

WebUI.closeBrowser()

def DzoTest(def todaysDate) {
    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре ДЗО'))

    Change(todaysDate)

    'Выбрать ПАО Россети'
    WebUI.click(findTestObject('Выручка по ДЗО/ПАО Россети Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.click(findTestObject('Выручка по ДЗО/Раскрыть список ПАО Россети'))

    WebUI.click(findTestObject('Выручка по ДЗО/Магистральные сети'))

    Change(todaysDate)

    WebUI.click(findTestObject('Выручка по ДЗО/Раскрыть список Магистральные сети'))

    WebUI.click(findTestObject('Выручка по ДЗО/Россети ФСК ЕЭС Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.click(findTestObject('Выручка по ДЗО/Раскрыть список Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Выручка по ДЗО/ИА ФСК ЕЭС'))

    Change(todaysDate)

    WebUI.click(findTestObject('Выручка по ДЗО/РаспредКомплекс Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Волга Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Волга Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Волга'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Мордовэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Мордовэнерго'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Оренбургэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Оренбургэнерго'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Пензаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Пензаэнерго'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Самарские РС'), 30)

    WebUI.click(findTestObject('Общие объекты/Самарские РС'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Саратовские РС'), 30)

    WebUI.click(findTestObject('Общие объекты/Саратовские РС'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ульяновские РС'), 30)

    WebUI.click(findTestObject('Общие объекты/Ульяновские РС'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Чувашэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Чувашэнерго'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Кубань Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Кубань Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    Change(todaysDate)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Кубань'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Кубаньэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Кубаньэнерго'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Ленэнерго Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Ленэнерго Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    Change(todaysDate)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Ленинградская область'), 30)

    WebUI.click(findTestObject('Общие объекты/Ленинградская область'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Санкт-Петербург'), 30)

    WebUI.click(findTestObject('Общие объекты/Санкт-Петербург'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Московский регион Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Московский регион Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Московская область'), 30)

    WebUI.click(findTestObject('Общие объекты/Московская область'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Москва'), 30)

    WebUI.click(findTestObject('Общие объекты/Москва'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Северный Кавказ Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Северный Кавказ Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северный Кавказ'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северный Кавказ'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Дагестанская сетевая компания'), 30)

    WebUI.click(findTestObject('Общие объекты/Дагестанская сетевая компания'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Дагэнергосеть01'), 30)

    WebUI.click(findTestObject('Общие объекты/Дагэнергосеть01'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Дагэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Дагэнерго'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ингушэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ингушэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Каббалкэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Каббалкэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Карачаево-Черкесскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Карачаево-Черкесскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Севкавказэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Севкавказэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ставропольэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ставропольэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Северо-Запад Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Северо-Запад Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Архангельский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Архангельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Вологодский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Вологодский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Карельский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Карельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Мурманский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Мурманский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Новгородский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Новгородский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Псковский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Псковский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/филиал в Республике Коми'), 30)

    WebUI.click(findTestObject('Общие объекты/филиал в Республике Коми'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Сибирь Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Сибирь Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Алтайэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Алтайэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Бурятэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Бурятэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/ГАЭС'), 30)

    WebUI.click(findTestObject('Общие объекты/ГАЭС'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Красноярскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Красноярскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Кузбассэнерго-РЭС'), 30)

    WebUI.click(findTestObject('Общие объекты/Кузбассэнерго-РЭС'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Омскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Омскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Хакасэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Хакасэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Читаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Читаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Томск Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Томск Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Томск'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Томск'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Томская распределительная компания'), 30)

    WebUI.click(findTestObject('Общие объекты/Томская распределительная компания'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Тюмень Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Тюмень Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Тюмень нижний уровень'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Тюмень нижний уровень'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Урал Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Урал Выручка по ДЗО'))

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Фильтр ДЗО'), 30)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Урал'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Урал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Общие объекты/Пермэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Пермэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Свердловэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Свердловэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Челябэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Челябэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Центр Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Центр Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Центр'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Общие объекты/Белгородэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Белгородэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Брянскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Брянскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Воронежэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Воронежэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Костромаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Костромаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Курскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Курскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Липецкэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Липецкэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Орелэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Орелэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Смоленскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Смоленскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Тамбовэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Тамбовэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Тверьэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Тверьэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ярэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ярэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Центр и Приволжье Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Общие объекты/Владимирэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Владимирэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ивэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ивэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Калугаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Калугаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Кировэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Кировэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Мариэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Мариэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Нижновэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Нижновэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Рязаньэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Рязаньэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Тулэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Тулэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Удмуртэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Удмуртэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Юг Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Юг Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Юг'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Общие объекты/ВМЭС'), 30)

    WebUI.click(findTestObject('Общие объекты/ВМЭС'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Астраханьэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Астраханьэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Волгоградэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Волгоградэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Калмэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Калмэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ростовэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ростовэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Янтарь Выручка по ДЗО'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Янтарь Выручка по ДЗО'))

    Change(todaysDate)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Россети Янтарь нижний уровень'), 30)

    WebUI.click(findTestObject('Выручка по ДЗО/Россети Янтарь нижний уровень'), FailureHandling.CONTINUE_ON_FAILURE)

    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре ДЗО'))

    Tumbler(todaysDate)
}

static void Tumbler(def todaysDate) {
    Test(todaysDate)

    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Внутренний оборот в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Выручка'))

    Test(todaysDate)

    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/По передаче в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Выручка'))

    Test(todaysDate)

    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/По передаче в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Выручка'))

    Test(todaysDate)

    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре Выручка'))

    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре Выручка'))
}

static def Change(def todaysDate) {
    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Выручка по ДЗО/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка по ДЗО/Применить в фильтре ДЗО'))

    Tumbler(todaysDate)

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка по ДЗО/Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка по ДЗО/Снять выделение в фильтре ДЗО'))
}

static def Test(def todaysDate) {
    WebUI.delay(10)

    if (WebUI.verifyTextNotPresent('нет данных', false) == true) {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == true) {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == true) {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    } else {
                        WriteToExcel(todaysDate)
                    }
                } else {
                    WriteToExcel(todaysDate)
                }
            } else {
                WriteToExcel(todaysDate)
            }
        } else {
            WriteToExcel(todaysDate)
        }
    } else {
        WriteToExcel(todaysDate)
    }
}

static def WriteToExcel(def todaysDate) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Выручка по ДЗО/Фильтр ДЗО'))

    String period = WebUI.getText(findTestObject('Выручка по ДЗО/Фильтр Дата'))

    String viruchka = WebUI.getText(findTestObject('Выручка по ДЗО/Фильтр Выручка'))

    if (viruchka == 'Выбрано: 2') {
        viruchka = 'Выбраны оба пункта'
    }
    
    if (viruchka == 'Все') {
        viruchka = 'Не выбран ни один пункт'
    }
    
    println(period)

    String dashboardName = 'Выручка по ДЗО'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, viruchka)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

