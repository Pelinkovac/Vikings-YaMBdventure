package com.vikinzi.vikingsyambdventure.models;

public class User {

    public String prezime;
    public String ime;
    public String nickname;

    public User(String dateOfBirth, String fullName, String nickName) {
        prezime = dateOfBirth;
        ime = fullName;
        nickname = nickName;
    }

    //public User(String dateOfBirth, String fullName, String nickname) {
    //    date_of_birth = dateOfBirth;
    //    full_name = fullName;
    //    this.nickname = nickname;
    //}

}