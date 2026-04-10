package com.api.models.requests;

public class SignupRequest {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public SignupRequest(String username, String password, String confirmPassword, String email, String firstName, String lastName, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String username;
        private String password;
        private String confirmPassword;
        private String email;
        private String firstName;
        private String lastName;
        private String mobileNumber;

        public Builder username(String username){
            this.username=username;
            return this; //current object
        }

        public Builder password(String password){
            this.password=password;
            Builder x=this;
            return x;
        }

        public Builder email(String email){
            this.email=email;
            return this;
        }

        public Builder confirmPassword(String confirmPassword){
            this.confirmPassword=confirmPassword;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public Builder mobileNumber(String mobileNumber){
            this.mobileNumber=mobileNumber;
            return this;
        }

        public SignupRequest build(){
            SignupRequest signupRequest=new SignupRequest(username,password,confirmPassword,email,firstName,lastName,mobileNumber);
            return signupRequest;
        }


    }
}
