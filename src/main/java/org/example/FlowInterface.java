package org.example;

import java.util.List;

public interface FlowInterface {
    public void flowAddOption(Option op);

    public void deleteOption(int optionID);
    public List<Integer> optionIdLinks(int optionID);
    public List<Integer> optionIdLinks(String keyword);
    public Option findOption(int optionID);
}
