package Lr4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class TestRegistration {
    CloseableHttpClient client;
    CloseableHttpResponse response;

    RegistrationPage reg1;

    @BeforeMethod
    public void setup(){
        client = HttpClientBuilder.create().build();

        reg1 = new RegistrationPage("abcdif234","qazwerty12", "example@gmail.com", "16");
    }

    @AfterMethod
    public void closeResources() throws IOException {
        client.close();
        response.close();

        reg1.ClickButtonByInputName("submit");
    }

    @Test
    public void PositiveTest() throws IOException {
        reg1.SetLoginByInputName("name");
        reg1.SetPasswordByInputName("password1", "password2");
        reg1.SetEmailByInputName("email");
        reg1.SetAnswerByInputName("question_answer");

    }

    @Test
    public void NegativeTest() throws  IOException{
        reg1.setLogin("@&**/'qwe");

        reg1.SetLoginByInputName("name");
        reg1.SetPasswordByInputName("password1", "password2");
        reg1.SetEmailByInputName("email");
        reg1.SetAnswerByInputName("question_answer");

    }
}