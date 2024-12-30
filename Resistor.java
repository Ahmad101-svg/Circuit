/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author ahmad
 */
public class Resistor {
    Node node1;
    Node node2;
    double Resistance;
    int resistanceID = 1;
    int resistance_number;
    public Resistor (double Resistance, Node node1, Node node2){
        if (Resistance<0){
            throw new IllegalArgumentException("Resistance can't be negative");
        }
        if (node1==null||node2==null){
            throw new IllegalArgumentException("node must have value");
        }
        this.node1 = node1;
        this.node2=node2;
        this.Resistance=Resistance;
        this.resistanceID=resistance_number;
        resistance_number++;
        
        
    }
    public Node [] getNodes(){
        Node[] node={node1, node2};
        return (node);
    }
    @Override
    public String toString(){
        return ("R" + resistance_number + " " + node1 + " " + node2 + " " + Resistance);
    }
}
