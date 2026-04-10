package com.api.tests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginApiTest {


    @Test(description = "Verify where the login api is working...")
    public void Logintest(){
        RestAssured.baseURI="http://64.227.160.186:8080/";
        RequestSpecification x=RestAssured.given().log().all();
        RequestSpecification y=x.header("Content-type","Application/json");
        RequestSpecification z=y.body("{\"username\": \"wertghgbvcx\", \"password\": \"manu1234\"}");
        Response response=z.post("/api/auth/login");
        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(),200);
    }
}

