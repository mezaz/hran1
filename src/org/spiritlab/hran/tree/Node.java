package org.spiritlab.hran.tree;

import java.util.List;

public interface Node {
    
    public Node addChild(Node node);
    
    public List<Node> getChilds();
    
    public void removeChilds();
    
    public String toString();
    
    public boolean hasChild();
    
}