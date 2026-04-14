# Ejercicio Práctico: Automatización de Login con Selenium y JUnit 5 🧪

Este proyecto forma parte de un ejercicio práctico para aprender las bases del testing automatizado y el patrón de diseño Page Object Model (POM).

## 📋 Descripción de la Tarea
El objetivo principal es automatizar las pruebas de flujo de inicio de sesión en la web [SauceDemo](https://www.saucedemo.com/). La tarea se divide en las siguientes fases:

1.  **Parte 1: Implementación de la Clase LoginPage**: Mapeo de elementos HTML (usuario, contraseña, botón de login) utilizando localizadores `By.id` y `By.cssSelector`.
2.  **Parte 2: Test de Login Correcto**: Creación de una prueba automatizada que utilice credenciales válidas (`standard_user` / `secret_sauce`) y verifique que el navegador navega a la página de inventario.
3.  **Parte 3: Test de Login Incorrecto**: Creación de una prueba que introduzca datos erróneos y verifique que la página muestra un mensaje de error específico.
4.  **Parte 4: Control de Tiempo**: Implementación de pausas (`Thread.sleep`) para ralentizar la ejecución del robot y permitir la observación humana de las acciones en el navegador.
5.  **Parte 5: Refactorización (Mejora del Diseño)**: Creación de métodos de alto nivel en la página (como `login()`) para simplificar el código de los tests y mejorar la mantenibilidad.

---

## 📚 Cuestiones Respondidas

### 1. ¿Qué hace la anotación `@BeforeEach`?
Es una anotación de JUnit 5 que indica que el método marcado debe ejecutarse **antes de cada test** individual. Se utiliza para configurar el entorno (inicializar el driver, abrir el navegador y cargar la URL) para que cada prueba sea independiente.

### 2. ¿Para qué sirve `assertTrue`?
Es una **aserción** que valida si una condición es verdadera. Si la condición es falsa, el test se marca como fallido. Es fundamental para confirmar que el software se comporta como esperamos.

### 3. ¿Qué diferencia hay entre `findElement()` y `findElements()`?
* **`findElement()`**: Busca un único elemento. Si no existe, lanza una excepción (`NoSuchElementException`) y detiene el test.
* **`findElements()`**: Busca todos los elementos que coincidan y devuelve una lista. Si no hay coincidencias, devuelve una lista vacía sin dar error, lo que permite verificar la existencia de elementos de forma segura.

### 4. ¿Por qué utilizamos una clase `LoginPage` en lugar de escribir todo en el test?
Por el principio de **Mantenibilidad (Page Object Model)**. Si la web cambia un ID o un selector, solo tenemos que modificar la clase de la página en un solo lugar, en lugar de corregir decenas de tests que usen ese mismo elemento. Además, hace que el código sea más legible y reutilizable.

---

## 🚀 Cómo ejecutar el proyecto
1. Clonar este repositorio.
2. Abrir con IntelliJ IDEA o Eclipse.
3. Asegurarse de que el archivo `pom.xml` haya descargado las dependencias (Selenium, WebDriverManager y JUnit 5).
4. Ejecutar la clase `LoginTest.java`.



---
<img width="369" height="170" alt="image" src="https://github.com/user-attachments/assets/c54f5027-6bbd-439f-8067-7fd013c045fa" />
