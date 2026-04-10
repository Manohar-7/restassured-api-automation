package com.api.Services;

import com.api.models.requests.ProfileRequest;
import com.api.models.requests.changePwdRequest;
import io.restassured.response.Response;

public class UserService extends BaseService{
    private final static String BASE_PATH="/api/users/";

    public Response changePassword(changePwdRequest payload){
        return putRequest(payload,BASE_PATH+"change-password");
    }

    public Response getProfile(String token){
        setAuthToken(token);
        return getRequest(BASE_PATH+"profile");
    }

    public Response updateProfile(String token, ProfileRequest payload){
        setAuthToken(token);
        return putRequest(payload, BASE_PATH+"profile");
    }
}
