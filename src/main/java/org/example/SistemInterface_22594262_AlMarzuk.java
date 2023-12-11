package org.example;

import java.util.List;

public interface SistemInterface_22594262_AlMarzuk {
    public void systemAddChatbot(Chatbot_22594262_AlMarzuk cb);
    public void systemAddUser(User_22594262_AlMarzuk user);
    public void systemLogin(String name);
    public void systemLogout();
    public Chatbot_22594262_AlMarzuk systemFindChatbot(int chatbotID);
    public void systemTalk(String msg);
    public void addMsg(Message_22594262_AlMarzuk msg);
    public void deleteChatbot(int chatbotID);
    public void updateChatbotFlowID(int chatbotID, int flowID);
    public void systemSynthesis(String username);

}
