package org.example;
import java.util.List;

public class Option {
    private int optionID;
    private String optionMsg;
    private int chatbotID;
    private int flowID;
    private List<String> keywords;
    public Option(int optionID, String optionMsg, int chatbotID, int flowID, List<String> keywords) {
        this.optionID = optionID;
        this.optionMsg = optionMsg;
        this.chatbotID = chatbotID;
        this.flowID = flowID;
        this.keywords = keywords;
    }
}
