package org.example;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Message_22594262_AlMarzuk{
    private Date fecha = new Date();
    private String username;
    private String msg;

    /**
     *
     * @param fecha: la fecha en la que se envia el mensaje
     * @param user: el usuario que la envia
     * @param msg: el mensaje enviado
     *
     * Descripción: Constructor de un mensaje de un usuario utilizando los parametros de entrada.
     */
    public Message_22594262_AlMarzuk(Date fecha, String user, String msg){
            this.fecha = fecha;
            this.username = user;
            this.msg = msg;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getUsername() {
        return this.username;
    }

    public String getMsg(){
        return this.msg;
    }
}
