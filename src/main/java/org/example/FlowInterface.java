package org.example;

import java.util.List;

public interface FlowInterface {
    public void flowAddOption(Option op);
    public int flowGetID();
    public String flowGetName();
    public List<Option> flowGetOptions();
}
