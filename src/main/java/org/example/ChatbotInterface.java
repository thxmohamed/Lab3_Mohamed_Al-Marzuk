package org.example;
import java.util.List;

public interface ChatbotInterface {
    public void chatbotAddFlow(Flow flow);
    public void deleteFlow(int flowID);
    public Flow chatbotFindFlow(int FlowID);
}
