package com.api.tests;

import com.api.Services.AuthService;
import com.api.models.requests.SignupRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreationtest {
    @Test(description = "new user registration..")
    public void RegisterUser(){
        AuthService authService=new AuthService();
        SignupRequest registerRequest=new SignupRequest.Builder()
                .username("manu981")
                .firstName("manu981")
                .email("manu981@gmail.com")
                .mobileNumber("9876543457")
                .lastName("man1")
                .password("manu9871")
                .confirmPassword("manu9871")
                .build();
        System.out.println(registerRequest);
        Response response=authService.signup(registerRequest);

        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asString(),"User registered successfully!");
        Assert.assertEquals(response.statusCode(),200);


    }

}
