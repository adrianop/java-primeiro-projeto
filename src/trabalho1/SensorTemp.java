/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author almei
 */
public class SensorTemp implements Sensor{
    
    
    
     public static String VENDOR = "XY Corp";
    protected String id;
    protected String name;
    protected double value = 0;
    protected int updateInterval = 10;
    protected double minValue = 0;
    protected double maxValeu = 100;
    private static final Random RND = new Random();

    @Override
    public String getVendor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getValue() {
        while(true){
     final String SYM = "sensor temp";
        URL url = null;
        
            try {
                url = new URL("http://alertablu.cob.sc.gov.br/d/nivel-do-rio ");
            } catch (MalformedURLException ex) {
                Logger.getLogger(SensorTemp.class.getName()).log(Level.SEVERE, null, ex);
            }
              URLConnection urlConn = null;
       
            try {
                urlConn = url.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(SensorTemp.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        InputStreamReader inStream = null;
         
            try {
                inStream = new InputStreamReader(urlConn.getInputStream());
            } catch (IOException ex) {
                Logger.getLogger(SensorTemp.class.getName()).log(Level.SEVERE, null, ex);
            }
     
             
         
        BufferedReader buff = new BufferedReader(inStream);
        //setPrice("not found");
        
        String line = null;
         try {
             line = buff.readLine();
         } catch (IOException ex) {
             Logger.getLogger(Valor_Acao.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    }

    @Override
    public int getUpdateInterval() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

