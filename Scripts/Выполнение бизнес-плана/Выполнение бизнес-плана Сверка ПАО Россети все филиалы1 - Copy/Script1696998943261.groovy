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

println(todaysDate)

String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))

println(opoveshenie)

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

WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Август'), 30)

WebUI.click(findTestObject('Выполнение бизнес-плана/Август'))

'Проскроллить до заголовка фильтра "Дата"'
WebUI.scrollToElement(findTestObject('Выполнение бизнес-плана/Заголовок дашборда'), 30)

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре Дата'))

WebUI.delay(30)

'!'
OpenFilter()

'Выбрать ПАО Россети'
WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

'Нажать "Применить"'
WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

'___________________________________________________________________________________________________'
dZO = 'ПАО Россети'

a = 84

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'Россети ФСК ЕЭС'

a = 83

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

dZO = 'РаспредКомплекс'

a = 82

Numbers(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, dZO)

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

    if (a == 82) {
        OpenFilter()

        WebUI.click(findTestObject('Выполнение бизнес-плана/РаспредКомплекс'))

        CloseFilter()

        WebUI.delay(5)
    }
    
    b = findTestData('PlanFact').getValue(1, a)

    i = b.indexOf(' (ГК)')

    if (i > -1) {
        b = b.substring(0, i)

        b = b.trim()
    }
    
    i = b.indexOf('О "')

    if (i > -1) {
        b = b.substring(i + 3, b.length())

        i = b.indexOf('"')

        b = b.substring(0, i)

        b = b.trim()
    }
    
    i = b.indexOf('О «')

    if (i > -1) {
        b = b.substring(i + 3, b.length())

        i = b.indexOf('»')

        b = b.substring(0, i)

        b = b.trim()
    }
    
    i = b.indexOf('г. ')

    if (i > -1) {
        b = b.substring(i + 3, b.length())

        b = b.trim()
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

            WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, planFact, dZO)
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

            WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, planFact, dZO)
        }
        
        if (planFact == 2) {
            WebUI.click(findTestObject('Выполнение бизнес-плана/Кнопка Факт'))
        }
    }
    
    if (a != 84) {
        if (a != 82) {
            OpenFilter()

            if (a == 83) {
                WebUI.click(findTestObject('Выполнение бизнес-плана/Россети ФСК ЕЭС'))
            }
            
            CloseFilter()

            WebUI.delay(5)
        }
    }
    
    page = WebUI.getText(findTestObject('Выполнение бизнес-плана/textPlanFact'))

    page = page.replace('%', '')

    page = page.replaceAll('\\s+', '')

    page = (page.split('План')[0])

    i = page.indexOf('.')

    if (i > -1) {
        i = (i + 3)

        c = page.substring(0, i)
    }
    
    pagePlan = c.toDouble()

    file = findTestData('PlanFact').getValue(4, a)

    file = file.replace(',', '.')

    filePlan = file.toDouble()

    file = findTestData('PlanFact').getValue(7, a)

    file = file.replace(',', '.')

    i = page.indexOf('.')

    if (i > -1) {
        i = (i + 3)

        page = page.substring(i)

        i = page.indexOf('.')

        if (i > -1) {
            i = (i + 3)

            page = page.substring(i)

            i = page.indexOf('.')

            if (i > -1) {
                i = (i + 3)

                page = page.substring(i)
            }
        }
    }
    
    fileFact = file.toDouble()

    pageFact = page.toDouble()

    if (pageFact == fileFact) {
    } else {
        numberOfErrors = (numberOfErrors + 1)

        pageDouble = pagePlan

        fileDouble = filePlan

        typeOfData = 'План в процентах'

        WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, planFact, dZO)
    }
    
    if (pageFact == fileFact) {
    } else {
        numberOfErrors = (numberOfErrors + 1)

        pageDouble = pageFact

        fileDouble = fileFact

        typeOfData = 'Факт в процентах'

        WriteToExcel(a, typeOfData, todaysDate, pageInt, fileInt, pageDouble, fileDouble, planFact, dZO)
    }
    
    if (WebUI.verifyEqual(numberOfErrors, 0) == false) {
        println(numberOfErrors)

        CheckFilials(a, typeOfData, todaysDate, dZO)
    }
}

static def CheckFilials(def a, def typeOfData, def todaysDate, def dZO) {
}

static void ZakrytOpoveshenie() {
	String opoveshenie = WebUI.getText(findTestObject('Выполнение бизнес-плана/Просьба обратить внимание'))
	
	println(opoveshenie)
	
    if (opoveshenie == 'Просьба обратить внимание') {
    WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
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

static def Change(def a, def typeOfData, def todaysDate, def dZO) {
    CloseFilter()

    WebUI.delay(10)

    if ((((((((((a == 28) || (a == 77)) || (a == 74)) || (a == 65)) || (a == 36)) || (a == 44)) || (a == 54)) || (a == 1)) || 
    (a == 18)) || (a == 59)) {
        Filials(a, typeOfData, todaysDate, dZO)
    }
    
    OpenFilter()

    WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))
}

static def Filials(def a, def typeOfData, def todaysDate, def dZO) {
    WebUI.delay(30)

    String b

    int c

    int d

    int e

    int f

    int i

    double page

    double file

    String partOfString1

    String partOfString2

    String partOfString3

    String percents = WebUI.getText(findTestObject('Object Repository/Выполнение бизнес-плана/Filials'))

    i = percents.indexOf(dZO)

    if (i == -1) {
        OpenFilter()

        WebUI.click(findTestObject('Выполнение бизнес-плана/ПАО Россети'))

        WebUI.click(findTestObject('Object Repository/Выполнение бизнес-плана/Применить в фильтре ДЗО'))

        b = findTestData('PlanFact').getValue(1, a)

        i = b.indexOf(' (ГК)')

        if (i > -1) {
            b = b.substring(0, i)

            b = b.trim()
        }
        
        i = b.indexOf('О "')

        if (i > -1) {
            b = b.substring(i + 3, b.length())

            i = b.indexOf('"')

            b = b.substring(0, i)

            b = b.trim()
        }
        
        i = b.indexOf('О «')

        if (i > -1) {
            b = b.substring(i + 3, b.length())

            i = b.indexOf('»')

            b = b.substring(0, i)

            b = b.trim()
        }
        
        if (i > -1) {
            b = b.substring(i + 3, b.length())

            b = b.trim()
        }
        
        OpenFilter()

        WebUI.scrollToElement(findTestObject('Общие объекты/Раскрыть список ' + b), 30)

        WebUI.click(findTestObject('null' + b))

        CloseFilter()
    }
    
    i = percents.indexOf('')

    i = b.indexOf('г. ')

    if (i > -1) {
        percents = percents.substring(0, i)
    }
    
    percents = percents.replaceAll('[а-яА-Я]', '')

    percents = percents.replaceAll('-', '')

    percents = percents.trim()

    if ((a == 28) || (a == 44)) {
        d = 8
    } else if ((a == 77) || (a == 74)) {
        d = 3

        i = (percents.indexOf('.') + 3)

        partOfString1 = percents.substring(0, i)

        percents = percents.substring(i, percents.length()).trim()

        i = (percents.indexOf('.') + 3)

        partOfString2 = percents.substring(0, i)

        percents = percents.substring(i, percents.length()).trim()

        i = (percents.indexOf('.') + 3)

        partOfString3 = percents.substring(0, i)

        percents = percents.substring(i, percents.length()).trim()

        percents = ((((((partOfString2 + ' ') + partOfString1) + ' ') + percents) + ' ') + partOfString3)
    } else if (a == 65) {
        d = 7
    } else if (a == 36) {
    } else if (a == 44) {
    } else if (a == 54) {
    } else if (a == 1) {
    } else if (a == 18) {
    } else if (a == 59) {
    }
    
    for (e = 1; e < 3; e++) {
        for (c = (a + 1); c < (a + d); c++) {
            if (e == 1) {
                typeOfData = 'План в процентах'

                f = 4
            } else if (e == 2) {
                typeOfData = 'Факт в процентах'

                f = 7
            }
            
            i = (percents.indexOf('.') + 3)

            page = percents.substring(0, i).toDouble()

            percents = percents.substring(i, percents.length()).trim()

            dZO = findTestData('PlanFact').getValue(1, c)

            String fileFact = findTestData('PlanFact').getValue(f, c)

            file = fileFact.replace(',', '.').toDouble()

            TestPercents(a, page, file, typeOfData, todaysDate, dZO)
        }
    }
}

static def WriteToExcel(def a, def typeOfData, def todaysDate, def pageInt, def fileInt, def pageDouble, def fileDouble, def planFact, def dZO) {
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

