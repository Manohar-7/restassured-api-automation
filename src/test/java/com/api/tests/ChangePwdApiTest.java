package com.api.tests;

import com.api.Services.UserService;
import com.api.models.requests.changePwdRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ChangePwdApiTest {

    @Test(description = "Verify the user is able change the password")
    public void changePassword(){
        UserService userService=new UserService();
        changePwdRequest changePwdRequest=new changePwdRequest.Builder()
                .confirmPassword("")
                .newPassword("")
                .currentPassword("")
                .build();
        Response response= userService.changePassword(changePwdRequest);
        System.out.println(response.asPrettyString());
    }
}
