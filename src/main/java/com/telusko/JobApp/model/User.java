package com.telusko.JobApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name = "users")
@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    public String setUsername(){
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }


//    public String setPassword(String encode) {
//        return encode;
//    }

}