package Lr4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

    String login, password, email, answer;
    ChromeDriver driver;

    RegistrationPage(String login, String password, String email, String answer){
        this.login = login;
        this.password = password;
        this.email = email;
        this.answer = answer;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://online.anidub.com/?do=register");
    }

    RegistrationPage(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://online.anidub.com/?do=register");
    }

    public ChromeDriver getDriver(){
        return this.driver;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void SetLoginByInputName(String name){
        WebElement login = driver.findElement(By.name(name));
        login.sendKeys(this.login);
    }

    public void SetPasswordByInputName(String password1Name, String password2Name){
        WebElement pass1 = driver.findElement(By.name(password1Name));
        pass1.sendKeys(this.password);
        WebElement pass2 = driver.findElement(By.name(password2Name));
        pass2.sendKeys(this.password);
    }

    public void SetEmailByInputName(String emailName){
        WebElement email = driver.findElement(By.name(emailName));
        email.sendKeys(this.email);
    }

    public void SetAnswerByInputName(String answerName){
        WebElement answer = driver.findElement(By.name(answerName));
        answer.sendKeys(this.answer);
    }

    public void ClickButtonByInputName(String buttonName){
        WebElement button = driver.findElement(By.name(buttonName));
        button.click();
    }
}
