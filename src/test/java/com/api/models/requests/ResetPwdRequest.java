package com.api.models.requests;

public class ResetPwdRequest {
    private String token;
    private String newPassword;
    private String confirmPassword;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public ResetPwdRequest(String token, String newPassword, String confirmPassword) {
        this.token = token;
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "ResetPwdRequest{" +
                "token='" + token + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }

    public static class Builder{
        private String token;
        private String newPassword;
        private String confirmPassword;

        public Builder token(String token){
            this.token=token;
            return this;
        }

        public Builder newPassword(String newPassword){
            this.newPassword=newPassword;
            return this;
        }

        public Builder confirmPassword(String confirmPassword){
            this.confirmPassword=confirmPassword;
            return this;
        }

        public ResetPwdRequest build(){
            ResetPwdRequest resetPwdRequest=new ResetPwdRequest(token,newPassword,confirmPassword);
            return resetPwdRequest;
        }

    }
}
