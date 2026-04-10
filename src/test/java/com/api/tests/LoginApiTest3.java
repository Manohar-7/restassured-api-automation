package com.api.tests;

import com.api.Services.AuthService;
import com.api.models.requests.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListener.class)

public class LoginApiTest3 {

    @Test(description = "Verifying whether user is able to login..")
    public void LoginTest(){
        AuthService authService=new AuthService();
        LoginRequest loginRequest=new LoginRequest("manu1234","manu12345");
        Response response=authService.login(loginRequest);
        LoginResponse loginResponse=response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getRoles());
        System.out.println(loginResponse.getEmail());
        System.out.println(loginResponse.getId());
        System.out.println(loginResponse.getUsername());
        System.out.println(loginResponse.getType());

        Assert.assertTrue(loginResponse.getToken()!=null);
        Assert.assertEquals(loginResponse.getEmail(),"lucky78@gmail.com");
        Assert.assertEquals(loginResponse.getId(),4715);
    }

}
