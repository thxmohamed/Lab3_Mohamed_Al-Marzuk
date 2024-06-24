package org.example;

import java.util.List;

public interface SistemInterface {
    public void systemAddChatbot(Chatbot cb);
    public void systemAddUser(User user);
    public void systemLogin(String name);
    public void systemLogout();
    public Chatbot systemFindChatbot(int chatbotID);
    public void systemTalk(String msg);
    public void addMsg(Message msg);
    public void deleteChatbot(int chatbotID);
    public void updateChatbotFlowID(int chatbotID, int flowID);
    public void systemSynthesis(String username);

}
