/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author ahmad
 */
public class Node {
    public int nodeId;
    static public int node_number = 0;
    public Node(){
        this.nodeId = node_number;
        node_number++;
    }
    
    public Node(int node){
        this.nodeId = node;
    
    }
    @Override
    public String toString(){
        return ("" + this.nodeId);
     
    }
    
}
