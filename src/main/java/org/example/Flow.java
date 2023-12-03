
package org.example;
import java.util.ArrayList;
import java.util.List;

public class Flow implements FlowInterface{
    private int flowID;
    private String flowName;
    private List<Option> options;

    public Flow(int flowID, String flowName, List<Option> options){
        this.flowID = flowID;
        this.flowName = flowName;
        if(options.isEmpty() || options.size() == 1){
            this.options = options;
        }else{
            int auxID, i;
            List<Option> optionsSinDuplicados = new ArrayList<>();
            List<Integer> IDList = new ArrayList<>();
            optionsSinDuplicados.add(options.get(0));
            IDList.add(options.get(0).optionGetID());
            for (i = 1; i < options.size(); i++){
                auxID = options.get(i).optionGetID();
                if(!IDList.contains(auxID)){
                    optionsSinDuplicados.add(options.get(i));
                    IDList.add(auxID);
                }
            }
            this.options = optionsSinDuplicados;}
    }

    public void flowAddOption(Option op){
        int opID = op.optionGetID();
        int i, auxopID;
        for(i = 0; i < this.options.size() ; i++){
            auxopID = this.options.get(i).optionGetID();
            if (opID == auxopID){
                return;
            }
        }
        this.options.add(op);
    }

    public int flowGetID(){
        return this.flowID;
    }
    public String flowGetName(){
        return this.flowName;
    }
    public List<Option> flowGetOptions(){
        return this.options;
    }
}

