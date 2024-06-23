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

Double a

Double b

String dZO = 'ПАО Россети'

for (run = 1; run < 3; run++) {
    ViruchkaChange(run, vir, block, nameOfBlock, typeOfData, viruchka, vidget, todaysDate, a, b, dZO)
}

static def ViruchkaChange(def run, def vir, def block, def nameOfBlock, def typeOfData, def viruchka, def vidget, def todaysDate, def a, def b, def dZO) {
    for (vir = 1; vir < 4; vir++) {
        Blocks(run, vir, block, nameOfBlock, typeOfData, viruchka, vidget, todaysDate, a, b, dZO)
    }
}

static def Blocks(def run, def vir, def block, def nameOfBlock, def typeOfData, def viruchka, def vidget, def todaysDate, def a, def b, def dZO) {
    int i

    String perc = ''

    String c

    String a1

    String a2

    String a30

    String a31

    String a32

    String a33

    String a34

    String a35

    String a36

    String a37

    String a38

    String a39

    String a310

    String a311

    String a312

    String a313

    String a314

    String a315

    String a316

    String b1

    String b2

    String b30

    String b31

    String b32

    String b33

    String b34

    String b35

    String b36

    String b37

    String b38

    String b39

    String b310

    String b311

    String b312

    String b313

    String b314

    String b315

    String b316

    block = 1

    nameOfBlock = ''

    PreSettings(run, vir, block, nameOfBlock, typeOfData, todaysDate)

    Rosseti(nameOfBlock)

    if (run == 2) {
        perc = ' Perc'
    }
    
    a1 = WebUI.getText(findTestObject('Выручка в рублях/График План'))

    a1 = a1.replaceAll(' ', '')

    println('a1: ' + a1)

    a2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт'))

    a2 = a2.replaceAll(' ', '')

    println('a2: ' + a2)

    a30 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti' + perc))

    i = a30.indexOf('млн.руб.')

    if (i > -1) {
        a30 = a30.substring(0, i)

        a30 = a30.replaceAll(' ', '')
    }
	
	if(a30.contains('%')) {
		a30 = a30.replaceAll('%', '')
	}
	
    println('a30: ' + a30)

    a31 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Tyvaenergo' + perc))

    a31 = a31.replaceAll(' ', '').replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a31 = a31.replace(',', '.')

    a31 = a31.substring(1, a31.length() - 1)

    println('a31: ' + a31)

    a32 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Chechenenergo' + perc))

    a32 = a32.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a32 = a32.replace(',', '.')

    a32 = a32.substring(1, a32.length() - 1)

    println('a32: ' + a32)

    a33 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Volga' + perc))

    a33 = a33.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a33 = a33.replace(',', '.')

    a33 = a33.substring(1, a33.length() - 1)

    println('a33:' + a33)

    a34 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Kuban' + perc))

    a34 = a34.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a34 = a34.replace(',', '.')

    a34 = a34.substring(1, a34.length() - 1)

    println('a34:' + a34)

    a35 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Lenenergo' + perc))

    a35 = a35.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a35 = a35.replace(',', '.')

    a35 = a35.substring(1, a35.length() - 1)

    println('a35:' + a35)

    a36 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Moskovskii Region' + perc))

    a36 = a36.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a36 = a36.replace(',', '.')

    a36 = a36.substring(1, a36.length() - 1)

    println('a36:' + a36)

    a37 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Severnii Kavkaz' + perc))

    a37 = a37.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a37 = a37.replace(',', '.')

    a37 = a37.substring(1, a37.length() - 1)

    println('a37:' + a37)

    a38 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Severo-Zapad' + perc))

    a38 = a38.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a38 = a38.replace(',', '.')

    a38 = a38.substring(1, a38.length() - 1)

    println('a38:' + a38)

    a39 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Sibir' + perc))

    a39 = a39.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a39 = a39.replace(',', '.')

    a39 = a39.substring(1, a39.length() - 1)

    println('a39:' + a39)

    a310 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Tomsk' + perc))

    a310 = a310.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a310 = a310.replace(',', '.')

    a310 = a310.substring(1, a310.length() - 1)

    println('a310:' + a310)

    a311 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Tyumen' + perc))

    a311 = a311.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a311 = a311.replace(',', '.')

    a311 = a311.substring(1, a311.length() - 1)

    println('a311:' + a311)

    a312 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Ural' + perc))

    a312 = a312.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a312 = a312.replace(',', '.')

    a312 = a312.substring(1, a312.length() - 1)

    println('a312:' + a312)

    a313 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Centr' + perc))

    a313 = a313.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a313 = a313.replace(',', '.')

    a313 = a313.substring(1, a313.length() - 1)

    println('a313:' + a313)

    a314 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Centr i Privolzhie' + perc))

    a314 = a314.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a314 = a314.replace(',', '.')

    a314 = a314.substring(1, a314.length() - 1)

    println('a314:' + a314)

    a315 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Ug' + perc))

    a315 = a315.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a315 = a315.replace(',', '.')

    a315 = a315.substring(1, a315.length() - 1)

    println('a315:' + a315)

    a316 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Yantar' + perc))

    a316 = a316.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    a316 = a316.replace(',', '.')

    a316 = a316.substring(1, a316.length() - 1)

    println('a316:' + a316)

    block = 2

    nameOfBlock = ' Выручка'

    PreSettings(run, vir, block, nameOfBlock, typeOfData, todaysDate)

    Rosseti(nameOfBlock)

    b1 = WebUI.getText(findTestObject('Выручка в рублях/График План Выручка'))

    b1 = b1.replaceAll(' ', '')

    println('b1: ' + b1)

    b2 = WebUI.getText(findTestObject('Выручка в рублях/График Факт Выручка'))

    b2 = b2.replaceAll(' ', '')

    println('b2: ' + b2)

    b30 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti' + perc))

    i = b30.indexOf('млн.руб.')

    if (i > -1) {
        b30 = b30.substring(0, i)

        b30 = b30.replaceAll(' ', '')
    }
	
    if(b30.contains('%')) {
		b30 = b30.replaceAll('%', '')
	}
	
    println('b30: ' + b30)

    b31 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Tyvaenergo' + perc))

    b31 = b31.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b31 = b31.replace(',', '.')

    b31 = b31.substring(1, b31.length() - 1)

    println('b31: ' + b31)

    b32 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Chechenenergo' + perc))

    b32 = b32.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b32 = b32.replace(',', '.')

    b32 = b32.substring(1, b32.length() - 1)

    println('b32: ' + b32)

    b33 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Volga' + perc))

    b33 = b33.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b33 = b33.replace(',', '.')

    b33 = b33.substring(1, b33.length() - 1)

    println('b33:' + b33)

    b34 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Kuban' + perc))

    b34 = b34.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b34 = b34.replace(',', '.')

    b34 = b34.substring(1, b34.length() - 1)

    println('b34:' + b34)

    b35 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Lenenergo' + perc))

    b35 = b35.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b35 = b35.replace(',', '.')

    b35 = b35.substring(1, b35.length() - 1)

    println('b35:' + b35)

    b36 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Moskovskii Region' + perc))

    b36 = b36.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b36 = b36.replace(',', '.')

    b36 = b36.substring(1, b36.length() - 1)

    println('b36:' + b36)

    b37 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Severnii Kavkaz' + perc))

    b37 = b37.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b37 = b37.replace(',', '.')

    b37 = b37.substring(1, b37.length() - 1)

    println('b37:' + b37)

    b38 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Severo-Zapad' + perc))

    b38 = b38.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b38 = b38.replace(',', '.')

    b38 = b38.substring(1, b38.length() - 1)

    println('b38:' + b38)

    b39 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Sibir' + perc))

    b39 = b39.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b39 = b39.replace(',', '.')

    b39 = b39.substring(1, b39.length() - 1)

    println('b39:' + b39)

    b310 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Tomsk' + perc))

    b310 = b310.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b310 = b310.replace(',', '.')

    b310 = b310.substring(1, b310.length() - 1)

    println('b310:' + b310)

    b311 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Tyumen' + perc))

    b311 = b311.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b311 = b311.replace(',', '.')

    b311 = b311.substring(1, b311.length() - 1)

    println('b311:' + b311)

    b312 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Ural' + perc))

    b312 = b312.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b312 = b312.replace(',', '.')

    b312 = b312.substring(1, b312.length() - 1)

    println('b312:' + b312)

    b313 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Centr' + perc))

    b313 = b313.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b313 = b313.replace(',', '.')

    b313 = b313.substring(1, b313.length() - 1)

    println('b313:' + b313)

    b314 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Centr i Privolzhie' + perc))

    b314 = b314.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b314 = b314.replace(',', '.')

    b314 = b314.substring(1, b314.length() - 1)

    println('b314:' + b314)

    b315 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Ug' + perc))

    b315 = b315.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b315 = b315.replace(',', '.')

    b315 = b315.substring(1, b315.length() - 1)

    println('b315:' + b315)

    b316 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Yantar' + perc))

    b316 = b316.replaceAll(' ', '').findAll('-?\\d+\\.\\d*|-?\\d*\\.\\d+|-?\\d+')

    b316 = b316.replace(',', '.')

    b316 = b316.substring(1, b316.length() - 1)

    println('b316:' + b316)

    if (WebUI.verifyEqual(a1, b1) == true) {
    } else {
        if (a1.isEmpty() != true) {
            a = a1.toDouble()
        }
        
        if (b1.isEmpty() != true) {
            b = b1.toDouble()
        }
        
        vidget = 'План'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a2, b2) == true) {
    } else {
        if (a2.isEmpty() != true) {
            a = a2.toDouble()
        }
        
        if (b2.isEmpty() != true) {
            b = b2.toDouble()
        }
        
        vidget = 'Факт'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a30, b30) == true) {
    } else {
        if (a30.isEmpty() != true) {
            a = a30.toDouble()
        }
        
        if (b30.isEmpty() != true) {
            b = b30.toDouble()
        }
        
        vidget = 'Отклонения'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a31, b31) == true) {
    } else {
        if (a31.isEmpty() != true) {
            a = a31.toDouble()
        }
        
        if (b31.isEmpty() != true) {
            b = b31.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'АО «Тываэнерго»'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a32, b32) == true) {
    } else {
        if (a32.isEmpty() != true) {
            a = a32.toDouble()
        }
        
        if (b32.isEmpty() != true) {
            b = b32.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'АО «Чеченэнерго»'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a33, b33) == true) {
    } else {
        if (a33.isEmpty() != true) {
            a = a33.toDouble()
        }
        
        if (b33.isEmpty() != true) {
            b = b33.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Волга'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a34, b34) == true) {
    } else {
        if (a34.isEmpty() != true) {
            a = a34.toDouble()
        }
        
        if (b34.isEmpty() != true) {
            b = b34.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Кубань'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a35, b35) == true) {
    } else {
        if (a35.isEmpty() != true) {
            a = a35.toDouble()
        }
        
        if (b35.isEmpty() != true) {
            b = b35.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Ленэнерго (ГК)'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a36, b36) == true) {
    } else {
        if (a36.isEmpty() != true) {
            a = a36.toDouble()
        }
        
        if (b36.isEmpty() != true) {
            b = b36.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Московский регион'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a37, b37) == true) {
    } else {
        if (a37.isEmpty() != true) {
            a = a37.toDouble()
        }
        
        if (b37.isEmpty() != true) {
            b = b37.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Северный Кавказ (ГК)'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a38, b38) == true) {
    } else {
        if (a38.isEmpty() != true) {
            a = a38.toDouble()
        }
        
        if (b38.isEmpty() != true) {
            b = b38.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Северо-Запад'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a39, b39) == true) {
    } else {
        if (a39.isEmpty() != true) {
            a = a39.toDouble()
        }
        
        if (b39.isEmpty() != true) {
            b = b39.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Сибирь (ГК)'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a310, b310) == true) {
    } else {
        if (a310.isEmpty() != true) {
            a = a310.toDouble()
        }
        
        if (b310.isEmpty() != true) {
            b = b310.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Томск'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a311, b311) == true) {
    } else {
        if (a311.isEmpty() != true) {
            a = a311.toDouble()
        }
        
        if (b311.isEmpty() != true) {
            b = b311.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Тюмень'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a312, b312) == true) {
    } else {
        if (a312.isEmpty() != true) {
            a = a312.toDouble()
        }
        
        if (b312.isEmpty() != true) {
            b = b312.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Урал (ГК)'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a313, b313) == true) {
    } else {
        if (a313.isEmpty() != true) {
            a = a313.toDouble()
        }
        
        if (b313.isEmpty() != true) {
            b = b313.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Центр'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a314, b314) == true) {
    } else {
        if (a314.isEmpty() != true) {
            a = a314.toDouble()
        }
        
        if (b314.isEmpty() != true) {
            b = b314.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Центр и Приволжье (ГК)'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a315, b315) == true) {
    } else {
        if (a315.isEmpty() != true) {
            a = a315.toDouble()
        }
        
        if (b315.isEmpty() != true) {
            b = b315.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Юг (ГК)'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
    }
    
    if (WebUI.verifyEqual(a316, b316) == true) {
    } else {
        if (a316.isEmpty() != true) {
            a = a316.toDouble()
        }
        
        if (b316.isEmpty() != true) {
            b = b316.toDouble()
        }
        
        vidget = 'Отклонения'

        dZO = 'Россети Янтарь'

        WriteToExcel(todaysDate, run, vir, block, typeOfData, viruchka, vidget, nameOfBlock, a, b, dZO)

        a = null

        b = null
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

static def PreSettings(def run, def vir, def block, def nameOfBlock, def typeOfData, def todaysDate) {
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

    WebUI.click(findTestObject('Выручка в рублях/Февраль 2024' + nameOfBlock))

    WebUI.click(findTestObject('Выручка в рублях/Март 2024' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/2 квартал 2024 список' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/2 квартал 2024 список' + nameOfBlock))

    WebUI.scrollToElement(findTestObject('Выручка в рублях/Апрель 2024' + nameOfBlock), 30)

    WebUI.click(findTestObject('Выручка в рублях/Апрель 2024' + nameOfBlock))

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

static def WriteToExcel(def todaysDate, def run, def vir, def block, def typeOfData, def viruchka, def vidget, def nameOfBlock, def a, def b, def dZO) {
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

    String period = WebUI.getText(findTestObject('Выручка в рублях/Фильтр Период'))

    println(period)

    String dashboardName = 'Выручка в рублях'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, vidget)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, viruchka)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, typeOfData)

    if (a == null) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, '')
    } else {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, a)
    }
    
    if (b == null) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, '')
    } else {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, b)
    }
    
    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, period)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 8, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

