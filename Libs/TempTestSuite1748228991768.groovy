import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();

suiteProperties.put('id', 'Test Suites/\u041F\u043D-\u0421\u0440-\u041F\u0442/\u0421\u0432\u0435\u0440\u043A\u0430 \u0434\u0430\u0448\u0431\u043E\u0440\u0434\u043E\u0432 \u0438\u0437 \u0440\u0430\u0437\u043D\u044B\u0445 \u0431\u043B\u043E\u043A\u043E\u0432')
suiteProperties.put('name', '\u0421\u0432\u0435\u0440\u043A\u0430 \u0434\u0430\u0448\u0431\u043E\u0440\u0434\u043E\u0432 \u0438\u0437 \u0440\u0430\u0437\u043D\u044B\u0445 \u0431\u043B\u043E\u043A\u043E\u0432')
suiteProperties.put('description', '')
suiteProperties.put('rerunTestFailImmediately', 'false')
suiteProperties.put('retryCount', '0')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\LIAZGINA-DI\\git\\SPORU\\Reports\\20250526_060951\\\u041F\u043D-\u0421\u0440-\u041F\u0442\\\u0421\u0432\u0435\u0440\u043A\u0430 \u0434\u0430\u0448\u0431\u043E\u0440\u0434\u043E\u0432 \u0438\u0437 \u0440\u0430\u0437\u043D\u044B\u0445 \u0431\u043B\u043E\u043A\u043E\u0432\\20250526_060951\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Пн-Ср-Пт/Сверка дашбордов из разных блоков', suiteProperties, new File("C:\\Users\\LIAZGINA-DI\\git\\SPORU\\Reports\\20250526_060951\\\u041F\u043D-\u0421\u0440-\u041F\u0442\\\u0421\u0432\u0435\u0440\u043A\u0430 \u0434\u0430\u0448\u0431\u043E\u0440\u0434\u043E\u0432 \u0438\u0437 \u0440\u0430\u0437\u043D\u044B\u0445 \u0431\u043B\u043E\u043A\u043E\u0432\\20250526_060951\\testCaseBinding"))
