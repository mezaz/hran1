package org.spiritlab.hran.model2;

import java.util.Map;

public class Task {
    
    private TaskLevel level = TaskLevel.INCOMING;
    
    private String title;
    
    private Map<Category, String> properties;
    
}