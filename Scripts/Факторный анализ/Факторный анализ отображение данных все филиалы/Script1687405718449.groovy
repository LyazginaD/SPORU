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

String typeOfData

String urlText

String searchWord

int i

int ii

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 3))

urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))

WebUI.delay(10)

searchWord = 'Вход'

if (urlText.contains(searchWord) == false) {
    for (urlText.contains(searchWord) == false; i < 4; ii++) {
        i = (i + 1)

        WebUI.refresh()

        WebUI.delay(20)

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 3))

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

        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 3))

        WebUI.delay(10)

        urlText = WebUI.getText(findTestObject('Страница авторизации/Text'))
    }
}

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

WebUI.scrollToElement(findTestObject('Факторный анализ/1 квартал 2024 выбрать'), 30)

WebUI.click(findTestObject('Факторный анализ/1 квартал 2024 выбрать'))

WebUI.scrollToElement(findTestObject('Факторный анализ/1 квартал 2024 выбрать'), 30)

WebUI.click(findTestObject('Факторный анализ/2 квартал 2024 выбрать'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Факторный анализ/3 квартал 2024 список'), 30)

WebUI.click(findTestObject('Факторный анализ/3 квартал 2024 выбрать'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Факторный анализ/4 квартал 2024 список'), 30)

WebUI.click(findTestObject('Факторный анализ/4 квартал 2024 список'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Факторный анализ/Октябрь 2024'), 30)

WebUI.click(findTestObject('Факторный анализ/Октябрь 2024'), FailureHandling.CONTINUE_ON_FAILURE)

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок фильтра Период'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Факторный анализ/Применить в фильтре Дата'))

'Открыть фильтр "ДЗО"'
WebUI.click(findTestObject('Факторный анализ/Фильтр ДЗО'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Факторный анализ/Снять выделение в Фильтре ДЗО'))

WebUI.click(findTestObject('Факторный анализ/ПАО Россети'))

Change(todaysDate, typeOfData)

WebUI.doubleClick(findTestObject('Факторный анализ/Раскрыть список ПАО Россети'))

WebUI.click(findTestObject('Факторный анализ/Магистральные сети'))

Change(todaysDate, typeOfData)

WebUI.click(findTestObject('Общие объекты/Развернуть элемент Магистральные сети'))

WebUI.click(findTestObject('Факторный анализ/Россети ФСК ЕЭС'))

Change(todaysDate, typeOfData)

WebUI.click(findTestObject('Общие объекты/Развернуть элемент Россети ФСК ЕЭС'))

WebUI.click(findTestObject('Факторный анализ/Итого по ФСК ЕЭС'))

Change(todaysDate, typeOfData)

WebUI.click(findTestObject('Общие объекты/Развернуть элемент Магистральные сети'))

WebUI.click(findTestObject('Факторный анализ/РаспредКомплекс'))

Change(todaysDate, typeOfData)

WebUI.click(findTestObject('Общие объекты/Раскрыть список РаспредКомплекс'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список РаспредКомплекс'))

WebUI.scrollToElement(findTestObject('Факторный анализ/АО Тываэнерго'), 30)

WebUI.click(findTestObject('Факторный анализ/АО Тываэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Тываэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Тываэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Факторный анализ/Тываэнерго нижний уровень'), FailureHandling.CONTINUE_ON_FAILURE)

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Факторный анализ/АО Чеченэнерго'), 30)

WebUI.click(findTestObject('Факторный анализ/АО Чеченэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Факторный анализ/Раскрыть список Чеченэнерго'), 30)

WebUI.click(findTestObject('Факторный анализ/Раскрыть список Чеченэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Факторный анализ/Раскрыть список Чеченэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Факторный анализ/Чеченэнерго нижний уровень'), FailureHandling.CONTINUE_ON_FAILURE)

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Факторный анализ/Россети Волга'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Волга'))

Change(todaysDate, typeOfData)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Волга'))

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

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Кубань'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Кубань'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Кубань'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Кубань'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Кубань'))

WebUI.scrollToElement(findTestObject('Общие объекты/Кубаньэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Кубаньэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Ленэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Ленэнерго'))

WebUI.scrollToElement(findTestObject('Общие объекты/Ленинградская область'), 30)

WebUI.click(findTestObject('Общие объекты/Ленинградская область'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Санкт-Петербург'), 30)

WebUI.click(findTestObject('Общие объекты/Санкт-Петербург'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Московский регион'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Московский регион'))

WebUI.click(findTestObject('Общие объекты/Московская область'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Москва'), 30)

WebUI.click(findTestObject('Общие объекты/Москва'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северный Кавказ'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Северный Кавказ'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северный Кавказ'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северный Кавказ'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северный Кавказ'))

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

WebUI.click(findTestObject('Общие объекты/Карачаево-Черкесскэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Севкавказэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Севкавказэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Ставропольэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Ставропольэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Северо-Запад'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Северо-Запад'))

WebUI.click(findTestObject('Общие объекты/Архангельский филиал'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Вологодский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Вологодский филиал'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Карельский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Карельский филиал'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Мурманский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Мурманский филиал'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Новгородский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Новгородский филиал'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Псковский филиал'), 30)

WebUI.click(findTestObject('Общие объекты/Псковский филиал'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/филиал в Республике Коми'), 30)

WebUI.click(findTestObject('Общие объекты/филиал в Республике Коми'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Сибирь'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Сибирь'))

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

WebUI.scrollToElement(findTestObject('Общие объекты/Кузбассэнерго-РЭС'), 30)

WebUI.click(findTestObject('Общие объекты/Кузбассэнерго-РЭС'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Омскэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Омскэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Хакасэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Хакасэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Читаэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Читаэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Томск'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Томск'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Томск'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Томск'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Томск'))

WebUI.scrollToElement(findTestObject('Общие объекты/Томская распределительная компания'), 30)

WebUI.click(findTestObject('Общие объекты/Томская распределительная компания'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Тюмень'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Тюмень'))

WebUI.click(findTestObject('Факторный анализ/Россети Тюмень нижний уровень'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Урал'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Урал'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Урал'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Урал'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Урал'))

WebUI.scrollToElement(findTestObject('Общие объекты/Пермэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Пермэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Свердловэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Свердловэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Челябэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Челябэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Центр'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Центр'))

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

WebUI.click(findTestObject('Общие объекты/Курскэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Липецкэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Липецкэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Орелэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Орелэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Смоленскэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Смоленскэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Тамбовэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Тамбовэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Тверьэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Тверьэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Ярэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Ярэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Центр и Приволжье'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Центр и Приволжье'))

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

WebUI.click(findTestObject('Общие объекты/Кировэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Мариэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Мариэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Нижновэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Нижновэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Рязаньэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Рязаньэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Тулэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Тулэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Удмуртэнерго'), 30)

WebUI.click(findTestObject('Общие объекты/Удмуртэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Юг'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Юг'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Юг'))

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

WebUI.click(findTestObject('Общие объекты/Ростовэнерго'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Янтарь'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'), 30)

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'))

WebUI.click(findTestObject('Общие объекты/Раскрыть список Россети Янтарь'))

WebUI.scrollToElement(findTestObject('Факторный анализ/Восточные электрические сети'), 30)

WebUI.click(findTestObject('Факторный анализ/Восточные электрические сети'))

Change(todaysDate, typeOfData)

WebUI.scrollToElement(findTestObject('Факторный анализ/Россети Янтарь нижний уровень'), 30)

WebUI.click(findTestObject('Факторный анализ/Россети Янтарь нижний уровень'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Факторный анализ/Применить в фильтре ДЗО'))

typeOfData = 'Филиал'

Test(todaysDate, typeOfData)

WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц'))

typeOfData = 'Месяц'

Test(todaysDate, typeOfData)

WebUI.closeBrowser()

static def Change(def todaysDate, def typeOfData) {
    'Проскроллить до заголовка фильтра "Дата"'
    WebUI.scrollToElement(findTestObject('Факторный анализ/Заголовок дашборда'), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Факторный анализ/Применить в фильтре ДЗО'))

    typeOfData = 'Филиал'

    Test(todaysDate, typeOfData)

    WebUI.click(findTestObject('Факторный анализ/Переключить отображение с филиала на месяц'))

    typeOfData = 'Месяц'

    Test(todaysDate, typeOfData)

    WebUI.click(findTestObject('Факторный анализ/Переключить отображение с месяца на филиал'))

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Факторный анализ/Фильтр ДЗО'))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Факторный анализ/Снять выделение в фильтре ДЗО'))
}

static def Test(def todaysDate, def typeOfData) {
    WebUI.delay(10)

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

static def WriteToExcel(def todaysDate, def typeOfData) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Факторный анализ/Фильтр ДЗО'))

    String period = WebUI.getText(findTestObject('Факторный анализ/Фильтр Период'))

    println(period)

    String dashboardName = 'Факторный анализ'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, typeOfData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

