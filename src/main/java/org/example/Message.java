package org.example;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Message{
    private Date fecha = new Date();
    private User user;
    private String msg;

    public Message(Date fecha, User user, String msg){
            this.fecha = fecha;
            this.user = user;
            this.msg = msg;
        }
}