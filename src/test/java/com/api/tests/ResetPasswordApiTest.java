package com.api.tests;

import com.api.Services.AuthService;
import com.api.models.requests.ResetPwdRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ResetPasswordApiTest {

    @Test(description = "Verifying user able to reset the passowrd through email")
    public void ResetPwd(){
        AuthService authService=new AuthService();
        ResetPwdRequest resetPwdRequest=new ResetPwdRequest.Builder()
                .token("")
                .confirmPassword("")
                .newPassword("")
                .build();
        Response response=authService.resetPassword(resetPwdRequest);
        System.out.println(response.asPrettyString());
    }

}
