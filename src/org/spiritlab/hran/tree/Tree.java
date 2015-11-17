package org.spiritlab.hran.tree;

public class Tree {
    
    private Node root;
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public Node first() {
        return root;
    }
    
    public Node addChild(Node node) {
        return root.addChild(node);
    }
    
    @Override
    public String toString() {
        return root.toString();
    }
    
}