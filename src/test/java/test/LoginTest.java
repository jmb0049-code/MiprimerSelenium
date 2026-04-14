package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

        private WebDriver driver;
        private LoginPage loginPage;

        @BeforeEach
        void setUp() {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.saucedemo.com/");
                loginPage = new LoginPage(driver);
        }

        @AfterEach
        void tearDown() {
                if (driver != null) {
                        driver.quit();
                }
        }

        @Test
        @DisplayName("Prueba de Login Correcto")
        void loginCorrecto() throws InterruptedException {
                loginPage.ingresarUsuario("standard_user");
                Thread.sleep(1000); // Pausa entre acciones como pide la Parte 4

                loginPage.ingresarPassword("secret_sauce");
                Thread.sleep(1000);

                loginPage.clickLogin();
                Thread.sleep(2000); // Pausa para ver el resultado final

                assertTrue(loginPage.obtenerUrlActual().contains("inventory"));
        }

        @Test
        @DisplayName("Prueba de Login con datos incorrectos")
        void loginIncorrecto() throws InterruptedException {

                loginPage.login("standard_user", "clave_incorrecta");

                Thread.sleep(2000);

                assertTrue(loginPage.errorVisible(), "ERROR: El mensaje de error debería ser visible.");
                assertTrue(loginPage.obtenerTextoError().contains("Username and password do not match"),
                        "ERROR: El mensaje de error no es el esperado.");
        }
}