package org.spiritlab.hran.model;

import org.spiritlab.hran.tree.Node;
import org.spiritlab.hran.tree.NodeImpl;


public class Obkar {
    
    public static void main(String[] args) {
        System.out.println("-1-");
        
        Node tree = new NodeImpl("Root");
        tree.addChild(new NodeImpl("Second")).addChild(new NodeImpl("Third"));
        
        //tree.getChilds().get(0).addChild(new NodeImpl("Forc"));
        
        //Tree tree = new Tree();
        //tree.addChild(new NodeImpl("Root element"));
        
        System.out.println(tree.toString());
        
    }
        
}