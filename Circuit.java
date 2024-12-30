/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;

/**
 *
 * @author ahmad
 */
public class Circuit {
    ArrayList<Resistor> resistor;
    ArrayList<VoltageSource> voltage;
    private static Circuit instance = null;
    public static Circuit getInstance() {
    if (instance == null) {
    instance = new Circuit();
    }
    return instance;
    }
    private Circuit() {
        this.resistor =new ArrayList<Resistor>();
        this.voltage =new ArrayList<VoltageSource>();
    } 
    @Override
    public String toString(){
        String circuit = new String();
        for (int i = 0; i<this.resistor.size(); i++){
            circuit += this.resistor.get(i).toString() + "\n";
        }
        for (int i = 0; i<this.voltage.size(); i++){
            circuit += this.voltage.get(i).toString() + "\n";
        }        
        return (circuit);
    }
}
