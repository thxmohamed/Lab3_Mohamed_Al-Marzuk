package org.example;
import java.util.List;

public class Option_22594262_AlMarzuk implements OptionInterface_22594262_AlMarzuk{
    private int optionID;
    private String optionMsg;
    private int chatbotID;
    private int flowID;

    private List<String> keywords;

    /**
     *
     * @param optionID: id de la opcion
     * @param optionMsg: string con el nombre de la opción
     * @param chatbotID: entero, ID del chatbot asociado
     * @param flowID: entero, ID del flujo asociado
     * @param keywords: Lista de keywords
     *
     * Descripción: RF1 - Option (Constructor)
     *                Crea una opción con los parametros de entrada
     */
    public Option_22594262_AlMarzuk(int optionID, String optionMsg, int chatbotID, int flowID, List<String> keywords) {
        this.optionID = optionID;
        this.optionMsg = optionMsg;
        this.chatbotID = chatbotID;
        this.flowID = flowID;
        this.keywords = keywords;
    }
    public int optionGetID() {
       return optionID;
    }
    public String optionGetMsg(){
        return optionMsg;
    }
    public int optionGetChatbotID(){
        return chatbotID;
    }
    public int optionGetFlowID(){
        return flowID;
    }
    public List<String> optionGetKeywords(){
        return keywords;
    }
    
}
