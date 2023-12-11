package org.example;

import java.util.List;

public interface FlowInterface_22594262_AlMarzuk {
    public void flowAddOption(Option_22594262_AlMarzuk op);

    public void deleteOption(int optionID);
    public List<Integer> optionIdLinks(int optionID);
    public List<Integer> optionIdLinks(String keyword);
    public Option_22594262_AlMarzuk findOption(int optionID);
}
