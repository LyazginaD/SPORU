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

WebUI.openBrowser('')

String urlText

String searchWord

int i

int ii

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

WebUI.delay(10)

searchWord = 'Вход'

if (urlText.contains(searchWord) == false) {
    for (urlText.contains(searchWord) == false; i < 4; ii++) {
        i = (i + 1)

        WebUI.refresh()

        WebUI.delay(20)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

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

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

        WebUI.delay(10)

        urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
    }
}

'!'
ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(50)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2024 список'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/1 квартал 2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/1 квартал 2024 список'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Январь 2024'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Февраль 2024'))

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Март 2024'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2 квартал 2024'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2 квартал 2024'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/3 квартал 2024 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2024 список'), FailureHandling.CONTINUE_ON_FAILURE)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Июль 2024'))

'Выбрать 1 квартал 2022'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Август 2024'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/Август 2024'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(50)

ZakrytOpoveshenie()

'Открыть фильтр "ДЗО"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))

DzoTest(todaysDate, typeOfData)

WebUI.closeBrowser()

def DzoTest(def todaysDate, def typeOfData) {
    'Выбрать ПАО Россети'
    WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список ПАО Россети в фильтре ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Магистральные сети'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Магистральные сети'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети ФСК ЕЭС'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Общие объекты/Итого по ФСК ЕЭС'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Магистральные сети'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/РаспредКомплекс'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список РаспредКомплекс в фильтре ДЗО'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Тываэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Тываэнерго'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Тываэнерго нижний уровень'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Тываэнерго'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Чеченэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Раскрыть список Чеченэнерго'))

    WebUI.click(findTestObject('Выполнение бизнес-плана/Чеченэнерго нижний уровень'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Волга'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Волга'))

    Change(todaysDate, typeOfData)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Волга'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Мордовэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Мордовэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Оренбургэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Оренбургэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Пензаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Пензаэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Самарские РС'), 30)

    WebUI.click(findTestObject('Общие объекты/Самарские РС'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Саратовские РС'), 30)

    WebUI.click(findTestObject('Общие объекты/Саратовские РС'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ульяновские РС'), 30)

    WebUI.click(findTestObject('Общие объекты/Ульяновские РС'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Чувашэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Чувашэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Кубань'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Кубань'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Кубань'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Кубань'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Кубаньэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Кубаньэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Ленэнерго'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Ленэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'))

    WebUI.scrollToElement(findTestObject('Общие объекты/АО ЦЭК'), 30)

    WebUI.click(findTestObject('Общие объекты/АО ЦЭК'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Курортэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Курортэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/СПб ЭС'), 30)

    WebUI.click(findTestObject('Общие объекты/СПб ЭС'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Россети Ленэнерго ДУ'), 30)

    WebUI.click(findTestObject('Общие объекты/Россети Ленэнерго ДУ'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Ленэнерго нижний уровень'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Ленэнерго нижний уровень'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Московский регион'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Московский регион'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Московская область'), 30)

    WebUI.click(findTestObject('Общие объекты/Московская область'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Москва'), 30)

    WebUI.click(findTestObject('Общие объекты/Москва'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Северный Кавказ'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северный Кавказ'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северный Кавказ'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северный Кавказ'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Дагестанская сетевая компания'), 30)

    WebUI.click(findTestObject('Общие объекты/Дагестанская сетевая компания'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Дагэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Дагэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ингушэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ингушэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Каббалкэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Каббалкэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Карачаево-Черкесскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Карачаево-Черкесскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Севкавказэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Севкавказэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ставропольэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ставропольэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Северо-Запад'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Архангельский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Архангельский филиал'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Архэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Архэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Вологдаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Вологдаэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Вологодский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Вологодский филиал'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Карельский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Карельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Карелэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Карелэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Колэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Колэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Комиэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Комиэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Мурманский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Мурманский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Новгородский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Новгородский филиал'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Новгородэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Новгородэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Псковский филиал'), 30)

    WebUI.click(findTestObject('Общие объекты/Псковский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Псковэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Псковэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/филиал в Республике Коми'), 30)

    WebUI.click(findTestObject('Общие объекты/филиал в Республике Коми'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Сибирь'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Сибирь'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Алтайэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Алтайэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Бурятэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Бурятэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/ГАЭС'), 30)

    WebUI.click(findTestObject('Общие объекты/ГАЭС'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Красноярскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Красноярскэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Кузбассэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Кузбассэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Кузбассэнерго-РЭС'), 30)

    WebUI.click(findTestObject('Общие объекты/Кузбассэнерго-РЭС'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Омскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Омскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Хакасэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Хакасэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Читаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Читаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Томск'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Томск'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Томск'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Томск'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Томская распределительная компания'), 30)

    WebUI.click(findTestObject('Общие объекты/Томская распределительная компания'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Тюмень'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Тюмень'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'))

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Тюмень нижний уровень'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Тюмень нижний уровень'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Урал'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Урал'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Урал'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Урал'))

    WebUI.scrollToElement(findTestObject('Общие объекты/АО ЕЭСК'), 30)

    WebUI.click(findTestObject('Общие объекты/АО ЕЭСК'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Пермэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Пермэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Свердловэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Свердловэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Челябэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Челябэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Центр'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Центр'))

    WebUI.scrollToElement(findTestObject('Общие объекты/Белгородэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Белгородэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Брянскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Брянскэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Воронежэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Воронежэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Костромаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Костромаэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Курскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Курскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Липецкэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Липецкэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Орелэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Орелэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Смоленскэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Смоленскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Тамбовэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Тамбовэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Тверьэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Тверьэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ярэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ярэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Центр и Приволжье'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'))

    WebUI.scrollToElement(findTestObject('Общие объекты/АО Свет'), 30)

    WebUI.click(findTestObject('Общие объекты/АО Свет'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Владимирэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Владимирэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ивэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ивэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Калугаэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Калугаэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Кировэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Кировэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Мариэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Мариэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Нижновэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Нижновэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Рязаньэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Рязаньэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Тулэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Тулэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Удмуртэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Удмуртэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Юг'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Юг'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 0)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Юг'))

    WebUI.scrollToElement(findTestObject('Общие объекты/ВМЭС'), 30)

    WebUI.click(findTestObject('Общие объекты/ВМЭС'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Астраханьэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Астраханьэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Волгоградэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Волгоградэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Калмэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Калмэнерго'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Ростовэнерго'), 30)

    WebUI.click(findTestObject('Общие объекты/Ростовэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Янтарь'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Янтарь'))

    Change(todaysDate, typeOfData)

    WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'), 30)

    WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'))

    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Янтарь нижний уровень'), 30)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Янтарь нижний уровень'))

    'Проскроллить до заголовка фильтра "ДЗО"'
    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

    typeOfData = 'Факт'

    Test(todaysDate, typeOfData)

    typeOfData = 'План'

    WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

    Test(todaysDate, typeOfData)
}

static def Change(def todaysDate, def typeOfData) {
    'Проскроллить до заголовка фильтра "ДЗО"'
    WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

    typeOfData = 'Факт'

    Test(todaysDate, typeOfData)

    typeOfData = 'План'

    WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

    Test(todaysDate, typeOfData)

    WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре ДЗО'))
}

static def Test(def todaysDate, def typeOfData) {
    WebUI.delay(35)

	ZakrytOpoveshenie()
	
    if (WebUI.verifyTextNotPresent('нет данных', false) == true) {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == true) {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == true) {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == true) {
                    } else {
                        WriteToExcel(todaysDate, typeOfData)
                    }
                } else {
                    WriteToExcel(todaysDate, typeOfData)
                }
            } else {
                WriteToExcel(todaysDate, typeOfData)
            }
        } else {
            WriteToExcel(todaysDate, typeOfData)
        }
    } else {
        WriteToExcel(todaysDate, typeOfData)
    }
}

static void ZakrytOpoveshenie() {
    String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

    println(opoveshenie)

    if (opoveshenie == 'Просьба обратить внимание') {
        WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
    }
}

static def WriteToExcel(def todaysDate, def typeOfData) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Выполнение бизнес-плана/Фильтр ДЗО'))

    int i = dZO.indexOf(' - ')

    String dZO1

    String dZO2

    String dZO3

    String dZO4

    if (i > -1) {
        dZO1 = dZO.substring(0, i)

        dZO1 = dZO1.trim()

        println('dZO1:' + dZO1)

        i = (dZO1.length() + 2)

        dZO = dZO.substring(i)

        dZO = dZO.trim()

        println(dZO)

        i = dZO.indexOf(' - ')

        if (i > -1) {
            dZO2 = dZO.substring(0, i)

            dZO2 = dZO2.trim()

            println('dZO2:' + dZO2)

            i = (dZO2.length() + 2)

            dZO = dZO.substring(i)

            dZO = dZO.trim()

            println(dZO)

            i = dZO.indexOf(' - ')

            if (i > -1) {
                dZO3 = dZO.substring(0, i)

                dZO3 = dZO3.trim()

                println('dZO3:' + dZO3)

                i = (dZO3.length() + 2)

                dZO = dZO.substring(i)

                dZO = dZO.trim()

                println(dZO)

                dZO4 = dZO

                println('dZO4:' + dZO4)
            } else {
                dZO3 = dZO

                dZO4 = ''
            }
        } else {
            dZO2 = dZO

            dZO3 = ''

            dZO4 = ''
        }
    } else {
        dZO1 = dZO

        dZO2 = ''

        dZO3 = ''

        dZO4 = ''
    }
    
    String date = WebUI.getText(findTestObject('Выполнение бизнес-плана/Фильтр Дата'))

    println(date)

    String dashboardName = 'Выполнение бизнес-плана'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO1)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, dZO2)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, dZO3)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, dZO4)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, date)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, typeOfData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

