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
import org.apache.log4j.Layout;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.RollingFileAppender;

/**
 *
 * @author wolfpack
 */
public class VotingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        votingWindow in = new votingWindow();
        in.setVisible(true);
        
        RollingFileAppender roll = new RollingFileAppender();
        PatternLayout ly =new PatternLayout();
        ly.setConversionPattern("%d{yyyy-MM-dd HH:mm:ss}:%L - %m%n");
        
        roll.setName("reultLog");
        roll.setAppend(true);
        roll.setFile("log.txt", true, true, 10);
        roll.setLayout(ly);
        org.apache.log4j.BasicConfigurator.configure(roll);
        
       
 
    }
    
}
