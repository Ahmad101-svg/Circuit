/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ahmad
 */
public class UserMain implements UserInterface{
    String input = "";
    ArrayList<Object> cirElement = new ArrayList<>();
    Scanner userIn = new Scanner(System.in);
    
    public void start()
    {
        display();
        run();
    }
    
    public void run()
    {
        while(true){
            input = userIn.nextLine().trim();
            if(input.equals("end")) 
            {
                System.out.println("All done");
                break;
            }
            else if(input.equals("spice"))
            {
                spice();
            }
            else
            {
                String[] user_input = input.split(" ");
                if(user_input.length != 4)
                {
                    System.out.println("Please review the format of your inputs");
                }
                else
                {
                    if(input.toLowerCase().startsWith("v"))
                    {
                        double temp;
                        Node one = new Node(Integer.parseInt(user_input[1]));
                        Node two = new Node(Integer.parseInt(user_input[2]));
                        temp = Double.parseDouble(user_input[3]);
                        VoltageSource v = new VoltageSource(temp,  one, two);
                        cirElement.add(v);
                    }
                    else if (input.toLowerCase().startsWith("r"))
                    {
                       double temp;
                       Node one = new Node(Integer.parseInt(user_input[1]));
                       Node two = new Node((Integer.parseInt(user_input[2])));
                       temp = Double.parseDouble(user_input[3]);
                        Resistor r = new Resistor(temp, one, two);
                        cirElement.add(r);                              
                    }
                }
            }
            
        }
    }
    
    public void display()
    {
        System.out.println("Enter your input:");
    }
    
   public void spice()
   {
       for(Object o : cirElement)
       {
           System.out.println(o);
       }
    }
   
   public static void main(String[] args)
   {
       UserMain m = new UserMain();
       m.start();
   }
}
