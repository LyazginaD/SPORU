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


RunConfiguration.setExecutionSettingFile('C:\\Users\\LIAZGI~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\\u0421\u0432\u0435\u0440\u043A\u0438 \u0434\u0430\u0448\u0431\u043E\u0440\u0434\u043E\u0432\\\u0412\u044B\u043F\u043E\u043B\u043D\u0435\u043D\u0438\u0435 \u0431\u0438\u0437\u043D\u0435\u0441-\u043F\u043B\u0430\u043D\u0430 \u0441\u0432\u0435\u0440\u043A\u0430 \u0434\u0430\u0448\u0431\u043E\u0440\u0434\u043E\u0432 - Copy\\20231127_104930\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Сверки дашбордов/Выполнение бизнес-плана сверка дашбордов - Copy', new TestCaseBinding('Test Cases/Сверки дашбордов/Выполнение бизнес-плана сверка дашбордов - Copy',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
