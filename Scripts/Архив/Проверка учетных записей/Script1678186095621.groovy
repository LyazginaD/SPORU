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

//if (WebUI.verifyTextPresent('Просьба обратить внимание', false) == true) {
//	WebUI.click(findTestObject('Выполнение бизнес-плана/Закрыть оповещение'))
//}
int a = 1

def data = findTestData('PlanFact')

int i = data.getRowNumbers() + 1

println(i)

String login

String password

String dzo

String filial

for (a = 365; a < i; a++) {
    println(a)

    login = findTestData('PlanFact').getValue(2, a)

    login = (login.split('@')[0])

    password = findTestData('PlanFact').getValue(9, a)

    dzo = findTestData('PlanFact').getValue(7, a)

    filial = findTestData('PlanFact').getValue(7, a)

    println(((login + password) + dzo) + filial)

    int b = 17
	
    String url = 'https://bi.rosseti.digital/viewer?dashboardGuid=5ed11b2f4eb2434fa5c5ff1537a71532&sheetGuid=d0b782666e9944f289041e3678bfb954&fit=true'
						
	Open(url, a, b, login, password)
	
	if (WebUI.verifyTextNotPresent('Неправильное имя пользователя или пароль', false) == true) {
	
		if (WebUI.verifyTextNotPresent('Неизвестная ошибка', false) == true) {
						
		ListTest(a, b)	
		
		}else {
		
			String result = 'Отсутствует доступ к дашборду'
	
			WriteToExcel(a, b, result)
								
		}


		b = 18

		url = 'https://bi.rosseti.digital/viewer?dashboardGuid=5ed11b2f4eb2434fa5c5ff1537a71532&sheetGuid=e0690bf1f33b410e8e6511a1443504a1&fit=true'
											
		Open(url, a, b, login, password)

		if (WebUI.verifyTextNotPresent('Неизвестная ошибка', false) == true) {
			
		ListTest(a, b)	
		
		}else {
			
			String result = 'Отсутствует доступ к дашборду'
		
			WriteToExcel(a, b, result)
				
		}	

		b = 19

		url = 'https://bi.rosseti.digital/viewer?dashboardGuid=c7ea1eba30b54fb8a2ae52da5de46c95&sheetGuid=48f5397bd28f42d68897b2ecc872294e&fit=true'

		Open(url, a, b, login, password)
				
		if (WebUI.verifyTextNotPresent('Неизвестная ошибка', false) == true) {
					
		ListTest(a, b)	
		
		}else {
				
			String result = 'Отсутствует доступ к дашборду'
			
			WriteToExcel(a, b, result)
				
		}
			
		b = 20
			
		url = 'https://bi.rosseti.digital/viewer?dashboardGuid=c7ea1eba30b54fb8a2ae52da5de46c95&sheetGuid=be02fcbc736f4776ad2b7007851fe7a6&fit=true'
														
		Open(url, a, b, login, password)

		if (WebUI.verifyTextNotPresent('Неизвестная ошибка', false) == true) {
			
		ListTest(a, b)
						
		}else {
					
			String result = 'Отсутствует доступ к дашборду'
			
			WriteToExcel(a, b, result)
				
		}
				
	}else {
					
			String result = 'Неправильное имя пользователя или пароль'
			
			WriteToExcel(a, b, result)
				
		}
				
    println(a)

    WebUI.deleteAllCookies()
       
}

static def Open(def url, def a, def b, def login, def password) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(url)

    WebUI.setText(findTestObject('Страница авторизации/input__username'), login)

    WebUI.setText(findTestObject('Страница авторизации/input__password'), password)

    WebUI.click(findTestObject('Страница авторизации/button_'))

    WebUI.delay(10)

}

static def ListTest(def a, def b) {
    String list

    String result

    WebUI.click(findTestObject('Уровень потерь ээ/Balances organizatsiya'))

    WebUI.click(findTestObject('Уровень потерь ээ/Снять выделение'))

	WebUI.click(findTestObject('Уровень потерь ээ/ShowList'))

    WebUI.click(findTestObject('Уровень потерь ээ/ListElement1'))

    list = WebUI.getText(findTestObject('Уровень потерь ээ/listPage'))

    println(list)

    int i = list.indexOf('РаспредКомплекс')

    int ii = list.indexOf('Магистральные сети')

    if (i > -1) {
        if (ii > -1) {
            list = 'ПАО Россети'
        } else {
            WebUI.click(findTestObject('Уровень потерь ээ/ListElement2'))

            if (WebUI.verifyElementPresent(findTestObject('Уровень потерь ээ/ListElement3'), 30) == true) {
                WebUI.click(findTestObject('Уровень потерь ээ/ListElement3'))

                list = WebUI.getText(findTestObject('Уровень потерь ээ/listPage'))

                list = list.substring(list.lastIndexOf('РаспредКомплекс') + 16)
            }
        }
    }
    
    if (i == -1) {
        if (ii > -1) {
            WebUI.click(findTestObject('Уровень потерь ээ/ListElement2'))

            if (WebUI.verifyElementPresent(findTestObject('Уровень потерь ээ/ListElement3'), 30) == true) {
                WebUI.click(findTestObject('Уровень потерь ээ/ListElement3'))

                list = WebUI.getText(findTestObject('Уровень потерь ээ/listPage'))

                list = list.substring(list.lastIndexOf('Магистральные сети') + 19)
            }
        }
    }
    
    result = list

    println(result)

    WriteToExcel(a, b, result)
}

static def WriteToExcel(def a, def b, def result) {
    String excelFilePath = 'C:\\Users\\LIAZGINA-DI\\Тестирование\\СПОРУ\\СПОРУ\\Data Files\\Копия Общий_список_пользователей_СПОРУ.xlsx'

    String sheetName = 'Основной список'

    def workbook01 = ExcelKeywords.getWorkbook(excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, a, b, result)

    ExcelKeywords.saveWorkbook(excelFilePath, workbook01)
}
