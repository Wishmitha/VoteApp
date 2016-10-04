/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.Timer;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author wolfpack
 */
public class VotingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        votingWindow in = new votingWindow();
        in.setVisible(true);
        PropertyConfigurator.configure("log4j.properties");
        
 
    }
    
}
