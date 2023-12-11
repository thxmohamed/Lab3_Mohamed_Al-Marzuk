
package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
*
*
* */
public class Flow_22594262_AlMarzuk implements FlowInterface_22594262_AlMarzuk{
    private int flowID;
    private String flowName;
    private List<Option_22594262_AlMarzuk> options;

    /**
     *
     * @param flowID: Id del flujo
     * @param flowName: nombre de flujo
     * @param options: lista de opciones del flujo.
     *
     * Descripción: RF2 - Flow (Constructor)
     *               Construye un flujo con los parametros de entrada.
     *               Elimina las opciones repetidas.
     */
    public Flow_22594262_AlMarzuk(int flowID, String flowName, List<Option_22594262_AlMarzuk> options){
        this.flowID = flowID;
        this.flowName = flowName;
        if(options.isEmpty() || options.size() == 1){
            this.options = options;
        }else{
            int auxID, i;
            List<Option_22594262_AlMarzuk> optionsSinDuplicados = new ArrayList<>();
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

    /**
     *
     * @param op: opción a agregar
     *
     * Descripción: RF3 - Flow (Modificador) - flowAddOption
     *          Añade una opción a un flujo si es que esta no está duplicada en base a su id.
     */
    public void flowAddOption(Option_22594262_AlMarzuk op){
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
    public List<Option_22594262_AlMarzuk> flowGetOptions(){
        return this.options;
    }

    /**
     *
     * @param optionID: id opción a eliminar
     *
     * Descripción: Elimina una opción de un flujo en base a su ID.
     */
    public void deleteOption(int optionID){
        int i, auxID;
        for(i = 0; i < this.flowGetOptions().size(); i++){
            auxID = this.flowGetOptions().get(i).optionGetID();
            if (auxID == optionID){
                this.flowGetOptions().remove(i);
                return;
            }
        }
        System.out.println("No hay una opción con ese ID en el flujo\n");
    }

    /**
     *
     * @param optionID: ID de la opción a buscar
     * @return: Lista de enteros con el id del chatbot y el id del flujo de la opción
     *
     * Descripción: Busca el ID de la opción y extrae el ID del chatbot y del flujo.
     */
    public List<Integer> optionIdLinks(int optionID){
        List<Option_22594262_AlMarzuk> options = this.options;
        for(int i = 0; i < options.size(); i++){
            if(options.get(i).optionGetID() == optionID){
                int chatbotID = options.get(i).optionGetChatbotID();
                int flowID = options.get(i).optionGetFlowID();
                return Arrays.asList(chatbotID, flowID);
            }
        }
        System.out.println("El id de esa opción no se encuentra en el flujo");
        return Arrays.asList();
    }

    /**
     *
     * @param keyword: Keyword de la opcion a buscar.
     * @return: Lista de enteros con el id del chatbot y el id del flujo de la opción
     *
     * Descripción: Busca la keyword en la opción y extrae el ID del chatbot y del flujo.
     */
    public List<Integer> optionIdLinks(String keyword){
        List<Option_22594262_AlMarzuk> options = this.options;
        for(int i = 0; i < options.size(); i++){
            List<String> keywords = options.get(i).optionGetKeywords();
            if(keywords.contains(keyword)){
                int chatbotID = options.get(i).optionGetChatbotID();
                int flowID = options.get(i).optionGetFlowID();
                return Arrays.asList(chatbotID, flowID);
            }
        }
        System.out.println("Esa palabra no se encuentra en el flujo");
        return Arrays.asList();
    }

    /**
     *
     * @param optionID: id a buscar
     * @return: opción encontrada
     *
     * Descripción: busca una opción en base a su ID.
     */
    public Option_22594262_AlMarzuk findOption(int optionID){
        int i, auxID;
        for (i = 0; i < this.flowGetOptions().size(); i++){
            auxID = this.flowGetOptions().get(i).optionGetID();
            if(auxID == optionID){
                return this.flowGetOptions().get(i);
            }
        }
        return null;
    }
}

