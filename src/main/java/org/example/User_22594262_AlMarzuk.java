package org.example;

public class User_22594262_AlMarzuk {


    protected String username;
    protected boolean isAdmin;

    /**
     *
     * @param user: Nombre del usuario
     *
     * Descripción: RF6 - User (Constructor)
     *            Construye un usuario en base a un string nombre.
     *            Los usuarios son construidos por defecto como
     *            comunes.
     */
    User_22594262_AlMarzuk(String user){
        this.username = user;
        this.isAdmin = false;
    }

    public String getUsername(){return this.username;}
    public boolean userIsAdmin(){return this.isAdmin;}

    public void setAdmin(){
        this.isAdmin = true;
    }
}