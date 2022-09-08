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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://srvsoftde.oscus.int/oscus.aplicacion')

WebUI.setText(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Usuario_username'), 'csantamaria')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Contrasea_password'), 'pFvlI3x3p6lG056Re0KmbA==')

WebUI.click(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Contrasea_login'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/img_Num. Cliente_imgNuevoClienteNatural'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Pasaporte'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_DIRECCIN'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/ul_AZUAY                                   _249295'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Pichincha')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/em_PICHINCHA'))

WebUI.closeBrowser()

