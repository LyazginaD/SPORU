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

'run - показывает, в каком положении переключатель процентов. 1 - Млн, 2 - Проценты'
int run = 1

'vir - показывает, что выбрано в фильтре Выручка. 1 = Все, 2 = Итого, 3 = Внутренний оборот'
int vir = 1

'block - показывает, из какого блока дашборд проверяется. 1 = Блок Руководителя, 2 = Выручка'
int block = 1

String vidget

String nameOfBlock

String typeOfData

String viruchka

String a

String b

String a1

String a2

String a3

String b1

String b2

String b3

for (run = 1; run < 3; run++) {
    ViruchkaChange(run, vir, block, nameOfBlock, typeOfData, viruchka, vidget, todaysDate, a, a1, b1, a2, b, b2, a3, b3)
}

static def ViruchkaChange(def run, def vir, def block, def nameOfBlock, def typeOfData, def viruchka, def vidget, def todaysDate, def a, def a1, def b1, def a2, def b, def b2, def a3, def b3) {
    for (vir = 1; vir < 4; vir++) {
        Blocks(run, vir, block, nameOfBlock, typeOfData, viruchka, vidget, todaysDate, a, a1, b1, a2, b, b2, a3, b3)
    }
}

static def Blocks(def run, def vir, def block, def nameOfBlock, def typeOfData, def viruchka, def vidget, def todaysDate, def a, def a1, def b1, def a2, def b, def b2, def a3, def b3) {
    for (block = 1; block < 3; block++) {
        String c

        if (block == 1) {
            nameOfBlock = ''

            PreSettings(run, vir, block, nameOfBlock, typeOfData, todaysDate, a1, b1, a2, b2, a3, b3)

            Rosseti(nameOfBlock)

            a1 = WebUI.getText(findTestObject('Выручка в рублях/График План'))

            a2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт'))

            a3 = WebUI.getText(findTestObject('Выручка в рублях/График Отклонение выручки'))

            'Приведение к общему виду отображения данных в виджете "Отклонение выручки", если выбрано Млн'
            int i = a3.indexOf('↓')

            if (i > -1) {
                a3 = a3.substring(i, a3.length())
            }
            
            i = a3.indexOf('↑')

            if (i > -1) {
                a3 = a3.substring(i, a3.length())
            }
            
            i = a3.indexOf('Статус данных')

            if (i > -1) {
                a3 = a3.substring(0, i)
            }
            
            i = (a3.lastIndexOf('млн. руб)') + 9)

            if (i > -1) {
                if (run == 1) {
                    c = a3.substring(i, a3.length())
                } else {
                    c = ''
                }
            } else {
                c = ''
            }
            
            println('c:' + c)

            i = a3.indexOf('млн. руб)')

            if (i > -1) {
                a3 = a3.substring(0, i)
            }
            
            i = a3.lastIndexOf('млн. руб)')

            if (i > -1) {
                a3 = a3.substring(0, i)
            }
            
            i = a3.lastIndexOf('млн.руб.')

            if (i > -1) {
                a3 = a3.substring(i, a3.length())
            }
            
            println('a3:' + a3)

            if (run == 2) {
                i = a3.indexOf('⬤Отклонение')

                a3 = a3.substring(i, a3.length())

                i = (a3.indexOf('.') - 2)

                a3 = a3.substring(i, a3.length())
            }
            
            println('a3 - .:' + a3)

            i = a3.lastIndexOf('…')

            if (i > -1) {
                a3 = a3.substring(i, a3.length())
            }
            
            a3 = (a3 + c)

            println('a3 - …:' + a3)

            i = (a3.lastIndexOf('10 %') + 3)

            if (i > -1) {
                a3 = a3.substring(i, a3.length())
            }
            
            println('a3 before cut:' + a3)

            a3 = a3.replaceAll('\\D+', '')
        } else {
            nameOfBlock = ' Выручка'

            PreSettings(run, vir, block, nameOfBlock, typeOfData, todaysDate, a1, b1, a2, b2, a3, b3)

            Rosseti(nameOfBlock)

            b1 = WebUI.getText(findTestObject('Выручка в рублях/График План Выручка'))

            b2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт Выручка'))

            b3 = WebUI.getText(findTestObject('Выручка в рублях/График Отклонение выручки'))

            println('b3:' + b3)

            'Приведение к общему виду отображения данных в виджете "Отклонение выручки", если выбрано Млн'
            int i = b3.indexOf('↓')

            if (i > -1) {
                b3 = b3.substring(i, b3.length())
            }
            
            i = b3.indexOf('↑')

            if (i > -1) {
                b3 = b3.substring(i, b3.length())
            }
            
            i = b3.indexOf('Статус данных')

            if (i > -1) {
                b3 = b3.substring(0, i)
            }
            
            i = (b3.lastIndexOf('млн. руб)') + 9)

            if (i > -1) {
                if (run == 1) {
                    c = b3.substring(i, b3.length())
                } else {
                    c = ''
                }
            } else {
                c = ''
            }
            
            println('c:' + c)

            i = b3.indexOf('млн. руб)')

            if (i > -1) {
                b3 = b3.substring(0, i)
            }
            
            i = b3.lastIndexOf('млн. руб)')

            if (i > -1) {
                b3 = b3.substring(0, i)
            }
            
            i = b3.lastIndexOf('млн.руб.')

            if (i > -1) {
                b3 = b3.substring(i, b3.length())
            }
            
            println('b3:' + b3)

            if (run == 2) {
                i = b3.indexOf('⬤Отклонение')

                b3 = b3.substring(i, b3.length())

                i = (b3.indexOf('.') - 2)

                b3 = b3.substring(i, b3.length())
            }
            
            println('b3 - .:' + b3)

            i = b3.lastIndexOf('…')

            if (i > -1) {
                b3 = b3.substring(i, b3.length())
            }
            
            b3 = (b3 + c)

            println('b3 - …:' + b3)

            i = (b3.lastIndexOf('10 %') + 3)

            if (i > -1) {
                b3 = b3.substring(i, b3.length())
            }
            
            println('b3 before cut:' + b3)

            b3 = b3.replaceAll('\\D+', '')

            println('a1:' + a1)

            println('a2:' + a2)

            println('a3:' + a3)

            println('b1:' + b1)

            println('b2:' + b2)

            println('b3:' + b3)

            if (WebUI.verifyEqual(a1, b1) == true) {
            } else {
                a = a1

                b = b1

                vidget = 'План'

                WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b)
            }
            
            if (WebUI.verifyEqual(a2, b2) == true) {
            } else {
                a = a2

                b = b2

                vidget = 'Факт'

                WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b)
            }
            
            if (WebUI.verifyEqual(a3, b3) == true) {
            } else {
                a = a3

                b = b3

                vidget = 'Отклонения'

                WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b)
            }
            
            (WebUI.verifyEqual(a1, b1) && WebUI.verifyEqual(a2, b2)) && WebUI.verifyEqual(a3, b3)
        }
    }
    
    WebUI.closeBrowser()
}

static void Rosseti(def nameOfBlock) {
    println('nameOfBlock:' + nameOfBlock)

    'Выбрать ПАО Россети'
    WebUI.click(findTestObject('Выручка в рублях/ПАО Россети' + nameOfBlock))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре ДЗО' + nameOfBlock))
}

static def PreSettings(def run, def vir, def block, def nameOfBlock, def typeOfData, def todaysDate, def a1, def b1, def a2, def b2, def a3, def b3) {
    WebUI.delay(30)

    WebUI.openBrowser('')

    println('run:' + run)

    println('vir:' + vir)

    println('block:' + block)

    if (block == 1) {
        nameOfBlock = ''
    } else {
        nameOfBlock = ' Выручка'
    }
    
    println('nameOfBlock:' + nameOfBlock)

    println('typeOfData:' + typeOfData)

    println('todaysDate:' + todaysDate)

    Autorization(block, nameOfBlock)

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр Период' + nameOfBlock))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка в рублях/Снять выделение в фильтре Дата' + nameOfBlock))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Дата' + nameOfBlock))

    'Раскрыть фильтр "Дата"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр Период' + nameOfBlock))

    'Нажать "Снять выделение"'
    WebUI.click(findTestObject('Выручка в рублях/Снять выделение в фильтре Дата' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/2024 список' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/2024 список' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/1 квартал 2024 список' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/1 квартал 2024 список' + nameOfBlock))

    WebUI.click(findTestObject('Выручка в рублях/Январь 2024' + nameOfBlock))

    'Проскроллить до заголовка дашборда'
    WebUI.scrollToElement(findTestObject('Выручка в рублях/Заголовок дашборда' + nameOfBlock), 30)

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Дата' + nameOfBlock))

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр ДЗО' + nameOfBlock))

    'Нажать "Снять выделение в фильтре ДЗО"'
    WebUI.click(findTestObject('Выручка в рублях/Снять выделение в фильтре ДЗО' + nameOfBlock))

    'Нажать "Применить"'
    WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре ДЗО' + nameOfBlock))

    Tumbler(run, vir, block, nameOfBlock)

    'Открыть фильтр "ДЗО"'
    WebUI.click(findTestObject('Выручка в рублях/Фильтр ДЗО' + nameOfBlock))
}

static void Autorization(def block, def nameOfBlock) {
    println('block:' + block)

    if (block == 1) {
        nameOfBlock = ''
    } else {
        nameOfBlock = ' Выручка'
    }
    
    println('nameOfBlock:' + nameOfBlock)

    if (block == 1) {
        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 2))
    } else {
        WebUI.navigateToUrl(findTestData('PlanFact').getValue(10, 9))
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Страница авторизации/button_'), 30) == true) {
        WebUI.setText(findTestObject('Страница авторизации/input__username'), findTestData('PlanFact').getValue(8, 1))

        WebUI.setText(findTestObject('Страница авторизации/input__password'), findTestData('PlanFact').getValue(9, 1))

        WebUI.click(findTestObject('Страница авторизации/button_'))
    }
    
    WebUI.delay(30)

    if (block == 2) {
        String opoveshenie = WebUI.getText(findTestObject('Выручка в рублях/Просьба обратить внимание'))

        if (opoveshenie == 'Просьба обратить внимание') {
            WebUI.click(findTestObject('Выручка в рублях/Закрыть оповещение'))
        }
    }
}

static def Tumbler(def run, def vir, def block, def nameOfBlock) {
    println('run:' + run)

    println('vir:' + vir)

    println('block:' + block)

    println('nameOfBlock:' + nameOfBlock)

    if (vir == 1) {
        if (run == 1) {
        } else if (run == 2) {
            WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях' + nameOfBlock))
        }
    } else if (vir == 2) {
        if (run == 1) {
        } else if (run == 2) {
            WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях' + nameOfBlock))
        }
        
        WebUI.click(findTestObject('Выручка в рублях/Фильтр Выручка' + nameOfBlock))

        WebUI.click(findTestObject('Выручка в рублях/Итого в фильтре Выручка' + nameOfBlock))

        WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Выручка' + nameOfBlock))
    } else if (vir == 3) {
        if (run == 1) {
        } else if (run == 2) {
            WebUI.click(findTestObject('Выручка в рублях/Переключить отображение с млн на проценты Выручка в рублях' + nameOfBlock))
        }
        
        WebUI.click(findTestObject('Выручка в рублях/Фильтр Выручка' + nameOfBlock))

        WebUI.click(findTestObject('Выручка в рублях/Внутренний оборот в фильтре Выручка' + nameOfBlock))

        WebUI.click(findTestObject('Выручка в рублях/Применить в фильтре Выручка' + nameOfBlock))
    }
}

static def WriteToExcel(def todaysDate, def run, def vir, def block, def typeOfData, def viruchka, def vidget, def nameOfBlock, def a, def b) {
    println(run)

    if (run == 1) {
        typeOfData = 'Млн'
    } else if (run == 2) {
        typeOfData = 'Проценты'
    }
    
    println('todaysDate:' + todaysDate)

    println('typeOfData:' + typeOfData)

    viruchka = WebUI.getText(findTestObject('Выручка в рублях/Фильтр Выручка' + nameOfBlock))

    println('viruchka' + viruchka)

    println('vidget' + vidget)

    println('a' + a)

    println('b' + b)

    String sheetName = 'Sheet1'

    def data = findTestData('PlanFact')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Выручка в рублях/Фильтр ДЗО'))

    String period = WebUI.getText(findTestObject('Выручка в рублях/Фильтр Период'))

    println(period)

    String dashboardName = 'Выручка в рублях'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, a)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, b)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, vidget)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, viruchka)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, typeOfData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 8, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

