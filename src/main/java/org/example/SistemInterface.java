package org.example;

import java.util.List;

public interface SistemInterface {
    public int systemGetCbID();
    public List<User> systemGetRegistered();
    public List<User> systemGetLoggedUser();
    public List<Chatbot> systemGetChatbots();
    public void systemAddChatbot(Chatbot cb);
    public void systemAddUser(User user);
    public void systemLogin(String name);
    public void systemLogout();
    public Chatbot systemFindChatbot(int chatbotID);
    public void systemTalk(String msg);

}
