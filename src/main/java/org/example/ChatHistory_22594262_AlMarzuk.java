package org.example;
import java.util.ArrayList;
import java.util.List;

public class ChatHistory_22594262_AlMarzuk{
    private User_22594262_AlMarzuk user;
    private List<Message_22594262_AlMarzuk> mensajes = new ArrayList<>();

    /**
     *
     * @param user: Es el usuario al que pertenece el historial
     *
     * Descripción: Crea un chat history de un usuario.
     */
    public ChatHistory_22594262_AlMarzuk(User_22594262_AlMarzuk user){
        this.user = user;
    }

    public User_22594262_AlMarzuk getUser(){
        return this.user;
    }
    public List<Message_22594262_AlMarzuk> getMensajes(){
        return this.mensajes;
    }

    public void chatAddMsg(Message_22594262_AlMarzuk msg){
        this.mensajes.add(msg);
    }
}