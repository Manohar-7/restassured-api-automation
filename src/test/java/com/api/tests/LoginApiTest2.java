package com.api.tests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.lessThan;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginApiTest2 {
    @Test(description = "Verify where the login api is working...")
    public void Logintest(){
        Response response=
                given()
                    .baseUri("http://64.227.160.186:8080/")
                    .header("Content-type","Application/json")
                    .body("{\"username\": \"wertghgbvcx\", \"password\": \"manu1234\"}")
                    .log().all()
                    .post("/api/auth/login");
        System.out.println(response.asPrettyString());
    }
}

