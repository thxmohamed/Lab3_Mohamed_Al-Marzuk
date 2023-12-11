package org.example;
import java.util.ArrayList;
import java.util.List;

public class Chatbot_22594262_AlMarzuk implements ChatbotInterface_22594262_AlMarzuk{
    private int chatbotID;
    private String chatbotName;
    private String welcomeMsg;
    private int startFlowID;
    private List<Flow_22594262_AlMarzuk> flows;


    /**
     *
     * @param ID: un entero
     * @param Name: un string
     * @param welcomeMsg: un string
     * @param startFlowID: un entero, es el flujo actual del chatbot
     * @param flows: una lista de flujos.
     *
     * Descripción: RF4 - Chatbot (Constructor)
     *             Recibe todos los parámetros de entrada, e inicializa los
     *             valores de la clase con lo que se le entregue.
     *             Además, borra los flujos repetidos en caso de que lo estén,
     *             en base a su ID.
     */
    public Chatbot_22594262_AlMarzuk(int ID, String Name, String welcomeMsg, int startFlowID, List<Flow_22594262_AlMarzuk> flows){
        this.chatbotID = ID;
        this.chatbotName = Name;
        this.welcomeMsg = welcomeMsg;
        this.startFlowID = startFlowID;
        if(flows.isEmpty() || flows.size() == 1){
            this.flows = flows;
        }else{
            int auxID;
            List<Flow_22594262_AlMarzuk> flowsSinDuplicados = new ArrayList<>();
            List<Integer> IDList = new ArrayList<>();
            flowsSinDuplicados.add(flows.get(0));
            IDList.add(flows.get(0).flowGetID());

            for(int i = 1; i < flows.size(); i++){
                auxID = flows.get(i).flowGetID();
                if(!IDList.contains(auxID)){
                    flowsSinDuplicados.add(flows.get(i));
                    IDList.add(auxID);
                }
            }
            this.flows = flowsSinDuplicados;
        }
    }

    /**
     *
     * @param flow: flujo a añádir
     *
     * Descripción: RF5 - Chatbot (Modificador) - chatbotAddFlow
     *            Añade un flujo a un chatbot, siempre y cuando
     *            este no se repita en base a su ID.
     */
    public void chatbotAddFlow(Flow_22594262_AlMarzuk flow){
        int flowID = flow.flowGetID();
        int i, auxID;
        for(i = 0; i < this.flows.size(); i++){
            auxID = this.flows.get(i).flowGetID();
            if(auxID == flowID){
                return;
            }
        }
        this.flows.add(flow);
    }

    public int chatbotGetID(){
        return this.chatbotID;
    }
    public String chatbotGetName(){
        return this.chatbotName;
    }
    public String chatbotGetMsg(){
        return this.welcomeMsg;
    }
    public int chatbotGetFlowID(){
        return this.startFlowID;
    }
    public List<Flow_22594262_AlMarzuk> chatbotGetFlows(){
        return this.flows;
    }

    /**
     *
     * @param flowID: ID del flujo a modificar
     *
     * Descripción: Se le entrega un ID, y cambia el ID del flujo actual
     */
    public void setStartFlowID(int flowID){
        this.startFlowID = flowID;
    }

    /**
     *
     * @param flowID: ID flujo a eliminar
     *
     * Descripción: Busca el ID en el chatbot y elimina ese flujo.
     *              Si no lo encuentra, manda un mensaje avisando que
     *              no lo encontró.
     */
    public void deleteFlow(int flowID){
        int i, auxID;
        for(i = 0; i < this.chatbotGetFlows().size();i++){
            auxID = this.chatbotGetFlows().get(i).flowGetID();
            if (auxID == flowID){
                this.chatbotGetFlows().remove(i);
                return;
            }
        }
        System.out.println("No hay un flujo con ese ID en el chatbot\n");
    }

    /**
     *
     * @param FlowID: ID flujo a encontrar
     * @return: Flujo encontrado
     *
     * Descripción: Busca un flujo en base a su ID.
     */
    public Flow_22594262_AlMarzuk chatbotFindFlow(int FlowID){
        int auxID, i;
        for(i = 0; i < this.chatbotGetFlows().size(); i++){
            auxID = this.chatbotGetFlows().get(i).flowGetID();
            if(auxID == FlowID){
                return this.chatbotGetFlows().get(i);
            }
        }
        return null;
    }
}
