package org.example;
import java.util.ArrayList;
import java.util.List;

public class ChatHistory{
    private User user;
    private List<Message> mensajes = new ArrayList<>();

    public ChatHistory(User user){
        this.user = user;
    }

    public User getUser(){
        return this.user;
    }
    public List<Message> getMensajes(){
        return this.mensajes;
    }

    public void chatAddMsg(Message msg){
        this.mensajes.add(msg);
    }
}