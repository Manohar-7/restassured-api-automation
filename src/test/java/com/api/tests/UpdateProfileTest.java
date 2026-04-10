package com.api.tests;

import com.api.Services.AuthService;
import com.api.Services.UserService;
import com.api.models.requests.LoginRequest;
import com.api.models.requests.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test
    public void updateprofile(){
        AuthService authService=new AuthService();
        Response response=authService.login(new LoginRequest("manu1234", "manu12345"));
        LoginResponse loginResponse=response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());

        System.out.println("--------------------------------------------------------------");

        UserService userService=new UserService();
        response=userService.getProfile(loginResponse.getToken());
        System.out.println(response.asPrettyString());
        UserProfileResponse userProfileResponse=response.as(UserProfileResponse.class);
        Assert.assertEquals(userProfileResponse.getUsername(),"manu1234");

        System.out.println("--------------------------------------------------------------");

        ProfileRequest profileRequest=new ProfileRequest.Builder()
                .firstName("likki")
                .lastName("Mogga")
                .mobileNumber("8340821018")
                .email("lucky78@gmail.com")
                .build();
        response=userService.updateProfile(loginResponse.getToken(),profileRequest);
        System.out.println(response.asPrettyString());

    }
}
