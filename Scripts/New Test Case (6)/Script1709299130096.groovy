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


b30 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti'))

i = b30.indexOf('млн.руб.')

if (i>-1) {
	
b30 = b30.substring(0,i)
	
b30 = b30.replaceAll(' ', '')
}

println('b30: '+b30)

b31 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Tyvaenergo'))

b31 = b31.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b31 = b31.replace(',','.').replaceAll('\\s+', '')

b31 = b31.substring(1,(b31.length()-1))
	
println('b31: '+b31)

b32 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Chechenenergo'))

b32 = b32.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b32 = b32.replace(',','.').replaceAll('\\s+', '')

b32 = b32.substring(1,(b32.length()-1))
	
println('b32: '+b32)

b33 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Volga'))

b33 = b33.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b33 = b33.replace(',','.').replaceAll('\\s+', '')

b33 = b33.substring(1,(b33.length()-1))

println('b33:'+ b33)

b34 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Kuban'))

b34 = b34.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b34 = b34.replace(',','.').replaceAll('\\s+', '')

b34 = b34.substring(1,(b34.length()-1))

println('b34:'+ b34)

b35 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Lenenergo'))

b35 = b35.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b35 = b35.replace(',','.').replaceAll('\\s+', '')

b35 = b35.substring(1,(b35.length()-1))

println('b35:'+ b35)

b36 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Moskovskii Region'))

b36 = b36.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b36 = b36.replace(',','.').replaceAll('\\s+', '')

b36 = b36.substring(1,(b36.length()-1))

println('b36:'+ b36)

b37 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Severnii Kavkaz'))

b37 = b37.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b37 = b37.replace(',','.').replaceAll('\\s+', '')

b37 = b37.substring(1,(b37.length()-1))

println('b37:'+ b37)

b38 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Severo-Zapad'))

b38 = b38.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b38 = b38.replace(',','.').replaceAll('\\s+', '')

b38 = b38.substring(1,(b38.length()-1))

println('b38:'+ b38)

b39 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Sibir'))
		
b39 = b39.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b39 = b39.replace(',','.').replaceAll('\\s+', '')

b39 = b39.substring(1,(b39.length()-1))

println('b39:'+ b39)

b310 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Tomsk'))

b310 = b310.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b310 = b310.replace(',','.').replaceAll('\\s+', '')

b310 = b310.substring(1,(b310.length()-1))

println('b310:'+ b310)
			
b311 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Tyumen'))

b311 = b311.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b311 = b311.replace(',','.').replaceAll('\\s+', '')

b311 = b311.substring(1,(b311.length()-1))

println('b311:'+ b311)

b312 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Ural'))

b312 = b312.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b312 = b312.replace(',','.').replaceAll('\\s+', '')

b312 = b312.substring(1,(b312.length()-1))

println('b312:'+ b312)

b313 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Centr'))

b313 = b313.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b313 = b313.replace(',','.').replaceAll('\\s+', '')

b313 = b313.substring(1,(b313.length()-1))

println('b313:'+ b313)

b314 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Centr i Privolzhie'))

b314 = b314.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b314 = b314.replace(',','.').replaceAll('\\s+', '')

b314 = b314.substring(1,(b314.length()-1))

println('b314:'+ b314)

b315 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Ug'))

b315 = b315.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b315 = b315.replace(',','.').replaceAll('\\s+', '')

b315 = b315.substring(1,(b315.length()-1))

println('b315:'+ b315)

b316 = WebUI.getText(findTestObject('Выручка в рублях/Otklonenie Viruchki Rosseti Yantar'))

b316 = b316.findAll(/-?\d+\.\d*|-?\d*\.\d+|-?\d+/ )

b316 = b316.replace(',','.').replaceAll('\\s+', '')

b316 = b316.substring(1,(b316.length()-1))

println('b316:'+ b316)

