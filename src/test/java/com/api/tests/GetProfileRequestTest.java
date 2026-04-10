package com.api.tests;

import com.api.Services.AuthService;
import com.api.Services.UserService;
import com.api.models.requests.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileRequestTest {

    @Test(description = "Get details of the user")
    public void GetUserProfile(){
        UserService userService=new UserService();
        AuthService authService=new AuthService();
        Response response=authService.login(new LoginRequest("uday1234","uday12345"));
        LoginResponse loginResponse=response.as(LoginResponse.class);

        response=userService.getProfile(loginResponse.getToken());
        UserProfileResponse userProfileResponse=response.as(UserProfileResponse.class);
        System.out.println(userProfileResponse.getMobileNumber());
    }
}
