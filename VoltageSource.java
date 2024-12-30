/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author ahmad
 */
public class VoltageSource {
    Node node1;
    Node node2;
    double Voltage;
    int VoltageID = 1;
    int Voltage_number;
    String Source;
    public VoltageSource (double Voltage, Node node1, Node node2){
        if (node1==null||node2==null){
            throw new IllegalArgumentException("node must have value");
        }
        this.node1 = node1;
        this.node2=node2;
        this.Voltage=Voltage;
        this.VoltageID=Voltage_number;
        Voltage_number++;
        
        
    }
    public Node [] getNodes(){
        Node[] node={node1, node2};
        return (node);
    }
    @Override
    public String toString(){
        return ("v" + Voltage_number + " DC " + node1 + " " + node2 + " " + Voltage);
    }
}
