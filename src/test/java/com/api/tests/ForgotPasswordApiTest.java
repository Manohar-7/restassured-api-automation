package com.api.tests;

import com.api.Services.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordApiTest extends AuthService {

    @Test(description = "forgotting password..")
    public void forgotpwd(){
        AuthService authService=new AuthService();
        Response response =authService.forgotPassword("manumogga117@gmail");
        System.out.println(response.asPrettyString());
    }
}
