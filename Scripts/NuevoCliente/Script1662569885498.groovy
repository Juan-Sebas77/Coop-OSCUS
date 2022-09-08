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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Usuario_username'), 'csantamaria')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Contrasea_password'), 'pFvlI3x3p6lG056Re0KmbA==')

WebUI.click(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Contrasea_login'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/img_Num. Cliente_imgNuevoClienteNatural'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Pasaporte'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Es menor de edad_txtIdentificacion'), 'PR125')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Con Disolucin Conyugal_txtApellidosPasaporte'), 
    'PEREZ')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Con Disolucin Conyugal_txtNombresPasaporte'), 
    'FERNANDO')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Soltero(a)'))

/*WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/img_Unin libre_ui-datepicker-trigger'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OSCUS Business/select_182318241825182618271828182918301831_431581'), 
    '1990', true)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/a_12'))*/

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label_Hombre'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Mujer_v'), '1')

//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Mujer_v_1'), '1')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Ecuador')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Ecuador'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Mestizoa'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_DIRECCIN'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Provincia_chosen-search'))

WebUI.scrollToElement(findTestObject(null), 0)

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'PICHINCHA')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_PICHINCHA'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Cantn_chosen-search'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'DISTRITO METROPOLITANO DE QUITO')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_DISTRITO METROPOLITANO DE QUITO'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Parroquia_chosen-search'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'PUERTO QUITO')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_PUERTO QUITO'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtDireccion'), 'General Rumiñahui')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtCalleSecundaria'), 'VELASCO IBARRA')

WebUI.scrollToPosition(0, 400)

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtNumCasa'), 'F17-122')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtReferenciaDireccion'), 'PEDRO LÓPEZ')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtCelular1_1'), '0999456987')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label_NO'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Propia no hipotecada'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_OCUPACIN'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Universitaria'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Profesin_chosen-search'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Ingeniería y Ciencias exactas')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Ingeniera y Ciencias exactas'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Ocupacin_chosen-search'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'AUDITOR')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_AUDITOR'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Rentista'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Grupo_chosen-search'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_ACTIVIDADES ADMINISTRATIVAS Y DE APOYO D_c035ea'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Actividad_chosen-search'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Actividades de prestacin de una serie de_bbf9c0'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtDescripcionActividadEconomicaActual'), 
    'AUDITOR')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtDescripcionActividadEconomicaActual_1'), 
    'AUDITOR')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtTiempoTrabajo'), '5')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtTiempoTrabajo_1'), '5')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_SITUACIN ECONMICA'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/a_Ingresos Mes_panel-tool-collapse panel-to_71da54'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Propios_txtValorIngreso0'), '5')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/a_Ingresos Mes_panel-tool-collapse panel-to_71da54'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Alimentacin_txtValorGasto0'), '5')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_REFERENCIAS'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtNombrePersonal'), 'CARLOS')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtDireccionPersonal'), 
    'FLORESTA')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtTelefonoCelular_1'), 
    '0999456654')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtParentesco'), 'TÍO')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtParentesco_1'), 'TÍO')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_OTROS'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_AHORROS'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/img_PEP_imgGuardarNuevoCliente'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/a_Aceptar'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/a_Aceptar'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/a_Aceptar'))

