package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

public class Sistem_22594262_AlMarzuk implements SistemInterface_22594262_AlMarzuk{
    private String name;
    private int chatbotIDLink;
    private List<Integer> formateo = Arrays.asList(0, 1); //para formatear el sistema una vez que el usuario haya cerrado sesión
    public boolean estaIniciado = false;
    private List<User_22594262_AlMarzuk> registrados = new ArrayList<>();
    private List<User_22594262_AlMarzuk> loggedUser = new ArrayList<>();
    private List<ChatHistory_22594262_AlMarzuk> chatHistories = new ArrayList<>();
    private List<Chatbot_22594262_AlMarzuk> chatbots;

    /**
     *
     * @param name: nombre del sistema
     * @param ID: id del chatbot inicial
     * @param chatbots: lista de chatbots
     *
     * Descripción: RF7 - Sistem (Constructor)
     *                Construye un sistema con los parámetros de entrada.
     */
    public Sistem_22594262_AlMarzuk(String name, int ID, List<Chatbot_22594262_AlMarzuk> chatbots){
        this.name = name;
        this.chatbotIDLink = ID;

        if(chatbots.isEmpty() || chatbots.size() == 1){
            this.chatbots = chatbots;
        }else{
            int auxID, i;
            List<Chatbot_22594262_AlMarzuk> chatbotsSinDuplicados = new ArrayList<>();
            List<Integer> IDList = new ArrayList<>();
            chatbotsSinDuplicados.add(chatbots.get(0));
            IDList.add(chatbots.get(0).chatbotGetID());
            for(i = 1; i < chatbots.size(); i++){
                auxID = chatbots.get(i).chatbotGetID();
                if(!IDList.contains(auxID)){
                    chatbotsSinDuplicados.add(chatbots.get(i));
                    IDList.add(auxID);
                }
            }
            this.chatbots = chatbotsSinDuplicados;
        }
    }
    public String systemGetName(){return this.name;}
    public int systemGetCbID(){
        return this.chatbotIDLink;
    }
    public List<User_22594262_AlMarzuk> systemGetRegistered(){
        return this.registrados;
    }

    public List<User_22594262_AlMarzuk> systemGetLoggedUser() {
        return this.loggedUser;
    }
    public List<ChatHistory_22594262_AlMarzuk> systemGetChatHistory(){ return this.chatHistories;}

    public List<Chatbot_22594262_AlMarzuk> systemGetChatbots() {
        return this.chatbots;
    }

    public void setChatbotIDLink(int ID){
        this.chatbotIDLink = ID;
    }

    /**
     *
     * @param cb: Chatbot a añadir
     *
     * Descripción: RF8 - Sistem (Modificador) - systemAddChatbot
     *          Método que añade chatbots a un sistema
     *          si es que no se repiten en base a sus ids
     */
    public void systemAddChatbot(Chatbot_22594262_AlMarzuk cb){
        int chatbotID = cb.chatbotGetID();
        int i, auxID;
        for (i = 0; i < this.chatbots.size(); i++){
            auxID = this.chatbots.get(i).chatbotGetID();
            if (auxID == chatbotID){
                System.out.println("Ese chatbot no se puede añadir al sistema");
                return;
            }
        }
        this.chatbots.add(cb);
    }

    /**
     *
     * @param user: usuario a añadir
     *
     * Descripción: RF9 - Sistem (Modificador) - systemAddUser
     *            Añade un usuario a un sistema, si es que este no se encuentra registrado con anterioridad
     */
    public void systemAddUser(User_22594262_AlMarzuk user){
        String username = user.getUsername();
        List<User_22594262_AlMarzuk> registrados = this.registrados;
        for (User_22594262_AlMarzuk registrado : registrados) {
            String auxUser = registrado.getUsername();
            if (username.equals(auxUser)) {
                System.out.println("\n¡Ese nombre de usuario ya se encuentra registrado!\n");
                return;
            }
        }
        this.registrados.add(user);
        ChatHistory_22594262_AlMarzuk history = new ChatHistory_22594262_AlMarzuk(user);
        this.chatHistories.add(history);
        System.out.println("\n¡Usuario registrado exitosamente!\n");
    }

    /**
     *
     * @param name: Nombre del usuario a loggearse
     *
     * Descripción: Descripción: RF10 - Sistem (Modificador) - systemLogin
     *            Se loggea en el sistema si es que se encuentra registrado
     *            o no hay nadie loggeado con anterioridad.
     */
    public void systemLogin(String name){
        if(!systemGetLoggedUser().isEmpty()){
            return;
        }
        for(int i = 0; i < this.systemGetRegistered().size(); i++){
            if(name.equals(this.systemGetRegistered().get(i).getUsername())){
                User_22594262_AlMarzuk user = this.systemGetRegistered().get(i);
                this.systemGetLoggedUser().add(user);
                return;
            }
        }
        System.out.println("\nNo se pudo iniciar sesión\n¡Ingrese un usuario válido!\n");
    }

    /**
     * Descripción: RF11 - Sistem (Modificador) - systemLogout
     *             Se cierra la sesión del usuario actual
     */
    public void systemLogout(){
        this.loggedUser = new ArrayList<>();
        this.estaIniciado = false;
        this.chatbotIDLink = this.formateo.get(0);
        this.updateChatbotFlowID(this.chatbotIDLink, this.formateo.get(1));
    }

    public Chatbot_22594262_AlMarzuk systemFindChatbot(int chatbotID){
        int i, auxID;
        for(i = 0; i < this.systemGetChatbots().size();i++){
            auxID = this.systemGetChatbots().get(i).chatbotGetID();
            if (auxID == chatbotID){
                return  this.systemGetChatbots().get(i);
            }
        }
        System.out.println("No existe ese ID de chatbot en el sistema");
        return null;
    }
    public void addMsg(Message_22594262_AlMarzuk msg){
        User_22594262_AlMarzuk user = this.systemGetLoggedUser().get(0);
        for(int i = 0; i < this.systemGetChatHistory().size(); i++){
            if(user.equals(this.systemGetChatHistory().get(i).getUser())){
                this.systemGetChatHistory().get(i).chatAddMsg(msg);
            }
        }
    }

    public void deleteChatbot(int chatbotID){
        int i, auxID;
        for(i = 0; i < this.systemGetChatbots().size();i++){
            auxID = this.systemGetChatbots().get(i).chatbotGetID();
            if (auxID == chatbotID){
                this.systemGetChatbots().remove(i);
                return;
            }
        }
        System.out.println("No hay un chatbot con ese ID en el sistema\n");
    }

    public void updateChatbotFlowID(int chatbotID, int flowID){
        int i, auxID;
        for(i = 0; i < this.systemGetChatbots().size(); i++){
            auxID = this.systemGetChatbots().get(i).chatbotGetID();
            if (auxID == chatbotID){
                this.systemGetChatbots().get(i).setStartFlowID(flowID);
                return;
            }
        }
        System.out.println("No se pudo actualizar");
    }

    //RF 12
    @Override

    /**
     * @param msg: Es el mensaje entregado por el usuario, puede ser una keyword o un numero
     *
     * Descripción: RF12 - Sistem (Modificador) - systemTalk
     *           Método que sirve para interactuar con un chatbot
     */
    public void systemTalk(String msg) {
        msg = msg.toLowerCase();
        if(this.systemGetLoggedUser().isEmpty()){
            return;
        }else if(!this.estaIniciado){
            String user = this.systemGetLoggedUser().get(0).getUsername();
            int chatbotID = systemGetCbID();
            Chatbot_22594262_AlMarzuk chatbot = systemFindChatbot(chatbotID); //chatbot actual
            int i, flowID = chatbot.chatbotGetFlowID();
            Flow_22594262_AlMarzuk flow = chatbot.chatbotFindFlow(flowID); //flow actual
            String respuesta = chatbot.chatbotGetMsg() + "\n";
            for(i = 0; i < flow.flowGetOptions().size(); i++){
                respuesta = respuesta + flow.flowGetOptions().get(i).optionGetMsg() + "\n";
            }
            String chatbotName = chatbot.chatbotGetName();
            Date fecha = new Date();
            Message_22594262_AlMarzuk messageU = new Message_22594262_AlMarzuk(fecha, user, msg);
            Message_22594262_AlMarzuk messageR = new Message_22594262_AlMarzuk(fecha, chatbotName, respuesta);
            this.addMsg(messageU);
            this.addMsg(messageR);
            System.out.println(respuesta);
            this.estaIniciado = true;
        }else{
            try{
                int opID = Integer.parseInt(msg); // id de la opcion entregada
                int chatbotID = systemGetCbID(); // id del chatbot actualmente linkeado en el sistema
                Chatbot_22594262_AlMarzuk chatbot = this.systemFindChatbot(chatbotID); //chatbot actual
                int i, flowID = chatbot.chatbotGetFlowID();
                Flow_22594262_AlMarzuk flow = chatbot.chatbotFindFlow(flowID); //flow actual
                List<Integer> newLinks = flow.optionIdLinks(opID);
                if(newLinks.equals(Arrays.asList())){
                    System.out.println("No se pudo interactuar con el Chatbot.\nIngresa un mensaje válido");
                    return;
                }
                Chatbot_22594262_AlMarzuk newChatbot = this.systemFindChatbot(newLinks.get(0));
                Flow_22594262_AlMarzuk newFlow  = newChatbot.chatbotFindFlow(newLinks.get(1));
                this.setChatbotIDLink(newLinks.get(0));
                this.updateChatbotFlowID(newLinks.get(0), newLinks.get(1));

                String respuesta = newFlow.flowGetName() + "\n";
                for(i = 0; i < newFlow.flowGetOptions().size(); i++ ){
                    respuesta = respuesta + newFlow.flowGetOptions().get(i).optionGetMsg() + "\n";
                }
                Date fecha = new Date();
                String user = this.systemGetLoggedUser().get(0).getUsername();
                String chatbotName = chatbot.chatbotGetName();
                Message_22594262_AlMarzuk messageU = new Message_22594262_AlMarzuk(fecha, user, msg);
                Message_22594262_AlMarzuk messageR = new Message_22594262_AlMarzuk(fecha, chatbotName, respuesta);
                this.addMsg(messageU);
                this.addMsg(messageR);
                System.out.println(respuesta);

            } catch (NumberFormatException e){
                int chatbotID = systemGetCbID(); // id del chatbot actualmente linkeado en el sistema
                //System.out.println("No se puede conversar con el chatbots sin usar numeros");
                Chatbot_22594262_AlMarzuk chatbot = this.systemFindChatbot(chatbotID); //chatbot actual
                int i, flowID = chatbot.chatbotGetFlowID();
                Flow_22594262_AlMarzuk flow = chatbot.chatbotFindFlow(flowID); //flow actual
                List<Integer> newLinks = flow.optionIdLinks(msg);
                if(newLinks.equals(Arrays.asList())){
                    System.out.println("No se pudo interactuar con el Chatbot.\nIngresa un mensaje válido");
                    return;
                }
                Chatbot_22594262_AlMarzuk newChatbot = this.systemFindChatbot(newLinks.get(0));
                Flow_22594262_AlMarzuk newFlow  = newChatbot.chatbotFindFlow(newLinks.get(1));
                this.setChatbotIDLink(newLinks.get(0));
                this.updateChatbotFlowID(newLinks.get(0), newLinks.get(1));

                String respuesta = newFlow.flowGetName() + "\n";
                for(i = 0; i < newFlow.flowGetOptions().size(); i++ ){
                    respuesta = respuesta + newFlow.flowGetOptions().get(i).optionGetMsg() + "\n";
                }
                Date fecha = new Date();
                String user = this.systemGetLoggedUser().get(0).getUsername();
                String chatbotName = chatbot.chatbotGetName();
                Message_22594262_AlMarzuk messageU = new Message_22594262_AlMarzuk(fecha, user, msg);
                Message_22594262_AlMarzuk messageR = new Message_22594262_AlMarzuk(fecha, chatbotName, respuesta);
                this.addMsg(messageU);
                this.addMsg(messageR);
                System.out.println(respuesta);

            }
        }
    }

    /**
     *
     * @param username: Nombre del usuario a ver el historial
     *
     * Descripción: RF13 - Sistem - systemSynthesis
     *                Muestra la síntesis del historial de un usuario
     */
    public void systemSynthesis(String username){
        String historial = "";
        for(int i = 0; i < this.systemGetChatHistory().size(); i++){
            if(username.equals(this.systemGetChatHistory().get(i).getUser().getUsername())){
                System.out.println("#######################\nEl historial del usuario " + username + " es:\n#######################");
                for(int j = 0; j < this.systemGetChatHistory().get(i).getMensajes().size(); j++){
                    String fecha = this.systemGetChatHistory().get(i).getMensajes().get(j).getFecha().toString();
                    String sender = this.systemGetChatHistory().get(i).getMensajes().get(j).getUsername();
                    String msg = this.systemGetChatHistory().get(i).getMensajes().get(j).getMsg();
                    historial = historial + fecha + " - " + sender + ": " + msg + "\n";
                }
            }
        }
        System.out.println(historial);
    }
}