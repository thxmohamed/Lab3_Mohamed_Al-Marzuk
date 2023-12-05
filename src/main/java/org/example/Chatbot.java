package org.example;
import java.util.ArrayList;
import java.util.List;

public class Chatbot implements ChatbotInterface{
    int chatbotID;
    String chatbotName;
    String welcomeMsg;
    int startFlowID;
    private List<Flow> flows;

    //OJO AQUI, se puede caer el for porque está cambiando el tamaño de la lista. modificar
    public Chatbot(int ID, String Name, String wellcomeMsg, int startFlowID, List<Flow> flows){
        this.chatbotID = ID;
        this.chatbotName = Name;
        this.welcomeMsg = wellcomeMsg;
        this.startFlowID = startFlowID;
        if(flows.isEmpty() || flows.size() == 1){
            this.flows = flows;
        }else{
            int auxID;
            List<Flow> flowsSinDuplicados = new ArrayList<>();
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
    public void chatbotAddFlow(Flow flow){
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
    public List<Flow> chatbotGetFlows(){
        return this.flows;
    }

    public Flow chatbotFindFlow(int FlowID){
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
