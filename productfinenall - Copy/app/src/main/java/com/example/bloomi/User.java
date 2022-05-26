package com.example.bloomi;

public class User {
    String firstName,lastName;
    String birthDay;
    Boolean Sex; // 0 male, 1 female;
    String phone;
    String email;
    String password;

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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Boolean getSex() {
        return Sex;
    }

    public void setSex(Boolean sex) {
        Sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String firstName, String lastName, String birthDay, Boolean sex, String phone, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        Sex = sex;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
}
