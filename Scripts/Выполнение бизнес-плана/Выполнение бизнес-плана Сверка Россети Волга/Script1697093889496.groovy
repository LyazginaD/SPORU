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

Date date = new Date()

String todaysDate = date.format('dd.MM.yyyy')

String dZO

int a

double fileperc

double pageperc

int pageInt

int fileInt

double pageDouble

double fileDouble

String typeOfData

WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 1))

WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

WebUI.click(findTestObject('Страница авторизации/button_'))

WebUI.delay(30)

'!'

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(30)

ZakrytOpoveshenie()

'Раскрыть фильтр "Дата"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Фильтр Дата'))

'Нажать "Снять выделение"'
WebUI.click(findTestObject('Выполнение бизнес-плана/Снять выделение в фильтре Дата'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2023 список'), 30)

'Выбрать 1 квартал 2022'
WebUI.click(findTestObject('Выполнение бизнес-плана/2023 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/1 квартал 2023 список'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/1 квартал 2023'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/2 квартал 2023 список'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/2 квартал 2023'))

WebUI.click(findTestObject('Выполнение бизнес-плана/3 квартал 2023 список'))

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Июль'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Июль'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(30)

OpenFilter()

CloseFilter()

OpenFilter()

OpenRSK()

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Россети Волга'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Россети Волга'))

CloseFilter()

dZO = 'Россети Волга'

a = 28

String percents = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

println(percents)

int ii = percents.indexOf(dZO)

int ic

for (ic == 1; (ii > -1) && (ic < 5); ic++) {
    OpenFilter()

    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

    OpenFilter()

    DZO(a)

    CloseFilter()

    percents = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

    ii = percents.indexOf(dZO)

    println(ii)
}

dZO = 'Мордовэнерго'

a = 29

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

FilialPercents(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Оренбургэнерго'

a = 30

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

FilialPercents(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Пензаэнерго'

a = 31

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

FilialPercents(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Самарские РС'

a = 32

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

FilialPercents(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Саратовские РС'

a = 33

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

FilialPercents(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Ульяновские РС'

a = 34

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

FilialPercents(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Чувашэнерго'

a = 35

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

FilialPercents(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

WebUI.closeBrowser() 

static def Numbers(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def dZO) {
    int planFact

    String page

    String file

    String otpusk

    String poteri

    String dataFolder = 'Выполнение бизнес-плана/Значения со страницы Выполнение бизнес-плана/'

    String path

    String typeOfDataMain

    int fileOtpuskVSet

    int pageOtpuskVSet

    int filePoteri

    int pagePoteri

    int compare

    double filePlan

    double fileFact

    double pagePlan

    double pageFact

    String b

    int i

    String c

    int numberOfErrors = 0

    b = findTestData('PlanFact').getValue(1, a)

    i = b.indexOf(' (ГК)')

    if (i > -1) {
        b = b.substring(0, i).trim()
    }
    
    i = b.indexOf('О "')

    if (i > -1) {
        b = b.substring(i + 3, b.length())

        i = b.indexOf('"').substring(0, i).trim()
    }
    
    i = b.indexOf('О «')

    if (i > -1) {
        b = b.substring(i + 3, b.length())

        i = b.indexOf('»').substring(0, i).trim()
    }
    
    i = b.indexOf('г. ')

    if (i > -1) {
        b = b.substring(i + 3, b.length()).trim()
    }
    
    println(b)

    for (planFact = 1; planFact < 3; planFact++) {
        if (planFact == 1) {
            typeOfDataMain = 'Факт'

            otpusk = findTestData('PlanFact').getValue(5, a)

            poteri = findTestData('PlanFact').getValue(6, a)
        } else if (planFact == 2) {
            WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка План'))

            typeOfDataMain = 'План'

            otpusk = findTestData('PlanFact').getValue(2, a)

            poteri = findTestData('PlanFact').getValue(3, a)
        }
        
        otpusk = otpusk.replaceAll('\\s+', '')

        poteri = poteri.replaceAll('\\s+', '')

        typeOfData = (typeOfDataMain + ' Отпуск в сеть')

        path = (((dataFolder + typeOfData) + ' за отчётный период ') + b)

        println(path)

        page = WebUI.getText(findTestObject(path))

        page = page.replaceAll('\\s+', '')

        fileOtpuskVSet = otpusk.toInteger()

        pageOtpuskVSet = page.toInteger()

        typeOfData = (typeOfDataMain + ' Потери')

        path = (((dataFolder + typeOfData) + ' за отчётный период ') + b)

        page = WebUI.getText(findTestObject(path))

        page = page.replaceAll('\\s+', '')

        filePoteri = poteri.toInteger()

        pagePoteri = page.toInteger()

        compare = pageOtpuskVSet

        if (compare == fileOtpuskVSet) {
        } else if (compare > fileOtpuskVSet) {
            compare = (compare - 1)
        } else if (compare < fileOtpuskVSet) {
            compare = (compare + 1)
        }
        
        if (compare == fileOtpuskVSet) {
        } else {
            numberOfErrors = (numberOfErrors + 1)

            pageInt = pageOtpuskVSet

            fileInt = fileOtpuskVSet

            typeOfData = (typeOfDataMain + ' Отпуск в сеть')

            WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
        }
        
        compare = pagePoteri

        if (compare == filePoteri) {
        } else if (compare > filePoteri) {
            compare = (compare - 1)
        } else if (compare < filePoteri) {
            compare = (compare + 1)
        }
        
        if (compare == filePoteri) {
        } else {
            numberOfErrors = (numberOfErrors + 1)

            pageInt = pagePoteri

            fileInt = filePoteri

            typeOfData = (typeOfDataMain + ' Потери')

            WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
        }
        
        if (planFact == 2) {
            WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))
        }
    }
}

static def FilialPercents(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def dZO) {
    int c

    int numberOfSpaces

    int numberOfFilials

    int i

    int filialNumberInRow

    String filialsDzoNames

    String p1

    String p2

    String percentsPlan

    String percentsFact

    String filePlan

    String fileFact

    String percents = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

    percents = percents.replaceAll('\\n', ' ')

    println(percents)

    if (a == 29) {
        filialNumberInRow = 1
    } else if (a == 30) {
        filialNumberInRow = 2
    } else if (a == 31) {
        filialNumberInRow = 3
    } else if (a == 32) {
        filialNumberInRow = 4
    } else if (a == 33) {
        filialNumberInRow = 5
    } else if (a == 34) {
        filialNumberInRow = 6
    } else if (a == 35) {
        filialNumberInRow = 7
    }
    
    i = percents.indexOf('  ')

    if (i > -1) {
        percents = percents.replaceAll('  ', ' ')
    }
    
    if (i > -1) {
        percents = percents.replaceAll('  ', ' ')
    }
    
    percents = percents.trim()

    filialsDzoNames = percents.replace('.', '')

    println(filialsDzoNames)

    filialsDzoNames = filialsDzoNames.replaceAll('\\d+', '')

    filialsDzoNames = filialsDzoNames.trim()

    println(filialsDzoNames)

    i = percents.indexOf(filialsDzoNames.substring(0, 3))

    percents = percents.substring(0, i).trim()

    println(percents)

    numberOfSpaces = percents.count(' ')

    println(numberOfSpaces)

    numberOfFilials = ((numberOfSpaces + 1) / 2)

    println(numberOfFilials)

    i = percents.indexOf(' ')

    percentsPlan = percents.substring(0, i)

    percentsFact = percents.substring(i, percents.length()).trim()

    for (c = 1; c < (numberOfFilials + 1); c++) {
        i = percentsFact.indexOf(' ')

        percentsPlan = ((percentsPlan + ' ') + percentsFact.substring(0, i))

        percentsFact = percents.substring(percentsPlan.length(), percents.length())
    }
    
    println(percentsPlan)

    println(percentsFact)

    i = percentsPlan.indexOf(' ')

    if (i > -1) {
        for (c = 1; c < filialNumberInRow; c++) {
            i = percentsPlan.indexOf(' ')

            if (i > -1) {
                percentsPlan = percentsPlan.substring(i, percentsPlan.length()).trim()
            }
        }
    }
    
    i = percentsPlan.indexOf(' ')

    if (i > -1) {
        percentsPlan = percentsPlan.substring(0, i).trim()
    }
    
    println(percentsPlan)

    i = percentsFact.indexOf(' ')

    if (i > -1) {
        for (c = 1; c < filialNumberInRow; c++) {
            i = percentsFact.indexOf(' ')

            if (i > -1) {
                percentsFact = percentsFact.substring(i, percentsFact.length()).trim()
            }
        }
    }
    
    i = percentsFact.indexOf(' ')

    if (i > -1) {
        percentsFact = percentsFact.substring(0, i).trim()
    }
    
    println(percentsFact)

    filePlan = findTestData('PlanFact').getValue(4, a)

    filePlan = filePlan.replace(',', '.')

    typeOfData = 'План в процентах'

    fileDouble = filePlan.toDouble()

    pageDouble = percentsPlan.toDouble()

    if (fileDouble != pageDouble) {
        WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
    
    filePlan = findTestData('PlanFact').getValue(7, a)

    filePlan = filePlan.replace(',', '.')

    fileDouble = filePlan.toDouble()

    typeOfData = 'Факт в процентах'

    pageDouble = percentsFact.toDouble()

    if (fileDouble != pageDouble) {
        WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)
    }
}

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

static void ZakrytOpoveshenie() {
    String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

    println(opoveshenie)

    if (opoveshenie == 'Просьба обратить внимание') {
        WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
    }
}

static def WriteToExcel(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def dZO) {
    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String year = todaysDate.substring(todaysDate.length() - 4, todaysDate.length())

    int y = year.toInteger()

    String m = WebUI.getText(findTestObject('Выполнение бизнес-плана/Период'))

    m = m.substring(0, m.indexOf(year))

    m = m.trim()

    String dashboardName = 'Выполнение бизнес-плана'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, typeOfData)

    if ((typeOfData == 'Факт в процентах') || (typeOfData == 'План в процентах')) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, fileDouble)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, pageDouble)
    } else {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, fileInt)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, pageInt)
    }
    
    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, m)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, y)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

