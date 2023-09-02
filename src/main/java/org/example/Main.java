package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\clase1calidad\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        String usuario = "standard_user";
        String contrasena = "secret_sauce";

        //localizador de elemento

        WebElement usuarioentrada = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement contrasenaentrada = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement btnlgn = driver.findElement(By.xpath("//input[@id='login-button']"));

        usuarioentrada.sendKeys((usuario));
        contrasenaentrada.sendKeys(contrasena);
        btnlgn.click();

        WebElement agregar1 = driver.findElement(By.xpath("//div[@class='inventory_list']/div[2]//button[@class='btn_primary btn_inventory']"));
        WebElement agregar2 = driver.findElement(By.xpath("//div[5]//button[@class='btn_primary btn_inventory']"));

        agregar1.click();
        agregar2.click();

        WebElement carrito = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
        carrito.click();

        WebElement check = driver.findElement(By.xpath("//a[.='CHECKOUT']"));
        check.click();

        String nom = "Lady";
        String ape = "Gomez";
        String direc = "Zipaquira";

        WebElement nombre = driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement apellido = driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement direccion = driver.findElement(By.xpath("//input[@id='postal-code']"));
        WebElement btncontinuar = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));

        nombre.sendKeys(nom);
        apellido.sendKeys(ape);
        direccion.sendKeys(direc);
        btncontinuar.click();

        WebElement btnFinish = driver.findElement(By.xpath("//a[.='FINISH']"));
        btnFinish.click();

        JavascriptExecutor scrool = (JavascriptExecutor) driver;
        scrool.executeAsyncScript("window.scrollTo(0, document.body.scrollHeight)");


    }
}