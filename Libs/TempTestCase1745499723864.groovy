import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\LIAZGI~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\\u0412\u044B\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435 \u0431\u0438\u0437\u043D\u0435\u0441-\u043F\u043B\u0430\u043D\u0430\\\u0412\u044B\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435 \u0431\u0438\u0437\u043D\u0435\u0441-\u043F\u043B\u0430\u043D\u0430 \u043E\u0442\u043E\u0431\u0440\u0430\u0436\u0435\u043D\u0438\u0435 \u0434\u0430\u043D\u043D\u044B\u0445 \u0432\u0441\u0435 \u0444\u0438\u043B\u0438\u0430\u043B\u044B - Copy\\20250424_160203\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Выполнение бизнес-плана/Выполнение бизнес-плана отображение данных все филиалы - Copy', new TestCaseBinding('Test Cases/Выполнение бизнес-плана/Выполнение бизнес-плана отображение данных все филиалы - Copy',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
