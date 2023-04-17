package StepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class registrarSteps {

    WebDriver driver = null;
    @Dado("que el  cliente se encuentra en la página de inicio")
    public void queElClienteSeEncuentraEnLaPaginaDeInicio() {
        System.out.println("test1");
        System.getProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

    }

    @Cuando("diligencia cada uno de los campos obligatorios")
    public void diligenciaCadaUnoDeLosCamposObligatorios() {
        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]")).sendKeys(Keys.ENTER);

        //llenar formulario User information
        driver.findElement(By.name("username")).sendKeys("userTest");
        driver.findElement(By.name("password")).sendKeys("userPassword");
        driver.findElement(By.name("repeatedPassword")).sendKeys("userPassword");

        //formulario Account information
        driver.findElement(By.name("account.firstName")).sendKeys("user");
        driver.findElement(By.name("account.lastName")).sendKeys("test");
        driver.findElement(By.name("account.email")).sendKeys("usertest@mail.com");
        driver.findElement(By.name("account.phone")).sendKeys("3188623770");
        driver.findElement(By.name("account.address1")).sendKeys("cz 11 #0");
        driver.findElement(By.name("account.city")).sendKeys("Armenia");
        driver.findElement(By.name("account.state")).sendKeys("Latinoamerica");
        driver.findElement(By.name("account.zip")).sendKeys("123");
        driver.findElement(By.name("account.country")).sendKeys("Armenia");


    }

    @Y("da clic en el botón “Save Account Information”")
    public void daClicEnElBotonSaveAccountInformation() {
        driver.findElement(By.name("newAccount")).sendKeys(Keys.ENTER);
    }

    @Entonces("el usuario queda registrado correctamente")
    public void elUsuarioQuedaRegistradoCorrectamente() {

        driver.getPageSource().contains("Demo");

        driver.close();
        driver.quit();
    }


    //caso2
    @Cuando("ingresa su usuario")
    public void ingresaSuUsuario() {
        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("username")).sendKeys("userTest");
    }

    @Y("ingresa su contraseña")
    public void ingresaSuContrasena() {
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("userPassword");
    }

    @Y("da clic en el botón ingresar")
    public void daClicEnElBotonIngresar() {
        driver.findElement(By.name("signon")).sendKeys(Keys.ENTER);
    }

    @Entonces("el usuario queda logueado en la página")
    public void elUsuarioQuedaLogueadoEnLaPagina() {
        driver.getPageSource().contains("ho");
        webElementfacade nombre elemento
                con un if .ispresent

        driver.close();
        driver.quit();
    }
}
