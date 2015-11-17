package org.spiritlab.hran.tree;

import java.util.ArrayList;
import java.util.List;

public class NodeImpl implements Node {
    
    private List<Node> nodes = new ArrayList<Node>();
    
    private String title;
    
    @Override
    public Node addChild(Node node) {
        nodes.add(node);
        return node;
    }
    
    @Override
    public List<Node> getChilds() {
        return nodes;
    }
    
    @Override
    public void removeChilds() {
        nodes.clear();
    }
    
    @Override
    public boolean hasChild() {
        return !nodes.isEmpty();
    }
    
    public NodeImpl(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        String result = title;
        for (Node node : nodes) {
            result += "\n " + node.toString();
        }
        return result;
    }
    
}