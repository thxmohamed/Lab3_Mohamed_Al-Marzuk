package org.example;
import java.util.List;

public interface ChatbotInterface {
    public void chatbotAddFlow(Flow flow);
    public int chatbotGetID();
    public List<Flow> chatbotGetFlows();
    public Flow chatbotFindFlow(int FlowID);
    public int chatbotGetFlowID();
    public String chatbotGetMsg();
    public String chatbotGetName();
}
