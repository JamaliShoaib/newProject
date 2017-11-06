package com.example.shoaib.baseline;

/**
 * Created by SHOAIB on 10/20/2017.
 */
public class ChatMessage {
    String name;
    String message;
    String user;
    String passward;


 public void setName(String name){
this.name=name;
 }
public void setMessage(String message){
this.message=message;
}
public void setUser(String user){
this.user=user;
}

    public void setPassward(String passward){
        this.passward=passward;
    }

    public String getPassward(){
        return name;

    }


    public String getName(){
        return name;

    }
    public String getMessage(){

        return message;

    }
public String getUser(){

    return user;
}
}
