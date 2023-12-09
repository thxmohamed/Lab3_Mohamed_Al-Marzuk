package org.example;
import java.util.ArrayList;
import java.util.List;

public class ChatHistory implements ChatHistoryInterface{
    private User user;
    private List<Message> mensajes = new ArrayList<>();

    public ChatHistory(User user){
        this.user = user;
    }

    public void chatAddMsg(Message msg){
        this.mensajes.add(msg);
    }
}