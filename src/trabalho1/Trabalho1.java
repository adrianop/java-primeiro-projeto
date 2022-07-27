/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import twitter4j.Twitter;

/**
 *
 * @author mauri.ferrandin
 */
public class Trabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // TODO code application logic here
        
        Sensor s = (Sensor)Class.forName("trabalho1.SensorRand").newInstance();
      
        //Sensor s = new SensorRand2();
        
        
        while (true){
            System.out.println(s.getValue());
        }
        
        
    }
    
}
