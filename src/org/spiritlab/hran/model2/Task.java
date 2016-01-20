package org.spiritlab.hran.model2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
    
    private TaskLevel level = TaskLevel.INCOMING;
    
    private String title;
    
    private Map<Category, String> properties;
    
    private List<Objective> objectives;
    
    public Task(String title) {
        this.title = title;
    }
    
    public Task addProperty(Category category, String value) {
        if (properties == null) {
            properties = new HashMap<Category, String>();
        }
        properties.put(category, value);
        return this;
    }
    
    public Task addObjective(Objective objective) {
        if (objectives == null) {
            objectives = new ArrayList<Objective>();
        }
        objectives.add(objective);
        return this;
    }
    
}