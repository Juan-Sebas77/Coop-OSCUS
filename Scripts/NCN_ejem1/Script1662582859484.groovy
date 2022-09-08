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

WebUI.waitForPageLoad(20)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('ObjXpath/AccederATuCuenta'), 20)

WebUI.setText(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Usuario_username'), 'csantamaria')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Contrasea_password'), 'pFvlI3x3p6lG056Re0KmbA==')

WebUI.click(findTestObject('Object Repository/Page_Inicia sesin en Oscus QA/input_Contrasea_login'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/img_Num. Cliente_imgNuevoClienteNatural'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Pasaporte'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Es menor de edad_txtIdentificacion'), 'PR129')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Con Disolucin Conyugal_txtApellidosPasaporte'), 
    'PEREEZZ')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Con Disolucin Conyugal_txtNombresPasaporte'), 
    'FERNANDOOO')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Soltero(a)'))

//WebUI.click(findTestObject('Object Repository/ObjXpath/FechaPasaporte'), '12/09/1990')
//WebUI.setText(findTestObject('Object Repository/ObjXpath/FechaPasaporte'), '12/09/1990')
WebUI.click(findTestObject('Object Repository/ObjXpath/IconoCalendario'))

WebUI.click(findTestObject('Object Repository/ObjXpath/ClicAnioCalendario'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Anio1990Calendario'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/ObjXpath/ClicAnioCalendario'), '1990', true)
WebUI.click(findTestObject('Object Repository/ObjXpath/Dia12Calendario'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label_Hombre'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Mujer_v'), '1')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Ecuador')

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Ecuador'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Mestizoa'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_DIRECCIN'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4'))

WebUI.scrollToElement(findTestObject('Object Repository/ObjXpath/Pestana_direccion'), 5)

//WebUI.scrollToElement(findTestObject('Page_OSCUS Business/div_AZUAY                                  _a9a002'), 5)
WebUI.click(findTestObject('Object Repository/ObjXpath/Provincia_Ecuador'))

//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Pichincha')
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/ul_AZUAY                                   _249295'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Provincia_chosen-search'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_PICHINCHA'))
WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5'))

//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Distrito')
WebUI.click(findTestObject('Object Repository/ObjXpath/Canto_DISTRITOMETROPOLITANODEQUITO'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6'))

//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Puerto')
WebUI.click(findTestObject('Object Repository/ObjXpath/Parroquia_PuertoQuito'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtDireccion'), 'General Rumiñahui')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtCalleSecundaria'), 'VELASCO IBARRA')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtNumCasa'), 'F17-122')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtReferenciaDireccion'), 'PEDRO LÓPEZ')

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Parroquia reside_txtCelular1'), '0999456987')

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label_NO'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Propia no hipotecada'))

//Ocupación
WebUI.scrollToElement(findTestObject('Object Repository/ObjXpath/Pestana_Ocupacion'), 5)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_OCUPACIN'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/ObjXpath/Educacion_Universitaria'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/ObjXpath/ProfesiónSBS'))

//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Arquitectos y afinesCiencias Administra_256785'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Profesin_chosen-search'))
//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Ingeniería')
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Ingeniera y Ciencias exactas'))
WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10'))

//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), '')
WebUI.click(findTestObject('Object Repository/ObjXpath/Ocupacion_Auditor'))

//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_ABACERO                                _2e7786'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Ocupacin_chosen-search'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/input'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Ocupacin_chosen-search'))
//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input'), 'Auditor')
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_AUDITOR'))
//Object Repository/ObjXpath/Boton_OrigenIngresos
WebUI.click(findTestObject('Object Repository/ObjXpath/Boton_OrigenIngresos'))

WebUI.click(findTestObject('Object Repository/ObjXpath/OrigenIngresos_Rentista'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/ObjXpath/GrupoEconomico_ActividadAdministrativa'))

////WebUI.click(findTestObject('Object Repository/ObjXpath/OrigenIngresos_Rentista'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_ACTIVIDADES ADMINISTRATIVAS Y DE APOYO _053880'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Grupo_chosen-search'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_ACTIVIDADES ADMINISTRATIVAS Y DE APOYO D_c035ea'))
WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/ObjXpath/ClasificacionActividad_ActividadDePrestacion'))

//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Actividades de prestacin de una serie d_b8db33'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/div_Actividad_chosen-search'))
//WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_Actividades de prestacin de una serie de_bbf9c0'))
WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtDescripcionActividadEconomicaActual'), 
    'Auditor')

//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtDescripcionActividadEconomicaActual_1'), 
//    'Auditor')
WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtTiempoTrabajo'), '5')

//WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Cantn_txtTiempoTrabajo_1'), '5')
WebUI.scrollToElement(findTestObject('Object Repository/ObjXpath/Pestana_direccion'), 5)

WebUI.click(findTestObject('Object Repository/ObjXpath/Pestana_SituacionEconomica'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/label'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/a_Ingresos Mes_panel-tool-collapse panel-to_71da54'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Propios_txtValorIngreso0'), '5')

WebUI.click(findTestObject('Object Repository/ObjXpath/SE_GastosMes'))

WebUI.setText(findTestObject('Object Repository/Page_OSCUS Business/input_Alimentacin_txtValorGasto0'), '5')

//Referencia
WebUI.scrollToElement(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/h1_REFERENCIAS'), 5)

WebUI.click(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/h1_REFERENCIAS'))

WebUI.setText(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtNombrePersonal'), 
    'CARLOS')

WebUI.setText(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtDireccionPersonal'), 
    'FLORESTA')

WebUI.setText(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtTelefonoCelular'), 
    '0999456654')

WebUI.click(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtParentesco'))

WebUI.setText(findTestObject('Object Repository/PruebasOSCUS_TC/Page_OSCUS Business/input_REFERENCIAS PERSONALES_txtParentesco_1'), 
    'TÍO')

//Otros
WebUI.scrollToElement(findTestObject('Object Repository/Page_OSCUS Business/h1_OTROS'), 5)

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/h1_OTROS'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/b_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/li_AHORROS'))

WebUI.click(findTestObject('Object Repository/Page_OSCUS Business/img_PEP_imgGuardarNuevoCliente'))

WebUI.click(findTestObject('Object Repository/ObjXpath/PrimerAceptar_FP'))

WebUI.click(findTestObject('Object Repository/ObjXpath/SegundoAceptar_FP'))

WebUI.click(findTestObject('Object Repository/ObjXpath/TercerAceptar_FP'))

WebUI.closeBrowser()

