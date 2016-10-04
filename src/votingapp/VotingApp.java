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
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.RollingFileAppender;
import static votingapp.votingWindow.team2;

/**
 *
 * @author wolfpack
 */
public class VotingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        
        RollingFileAppender roll = new RollingFileAppender();
        PatternLayout ly =new PatternLayout();
        ly.setConversionPattern("%d{yyyy-MM-dd HH:mm:ss}:%L - %m%n");
        
        roll.setName("reultLog");
        roll.setAppend(true);
        roll.setFile("log.txt", true, true, 10);
        roll.setLayout(ly);
        org.apache.log4j.BasicConfigurator.configure(roll);
        
        final Logger logger = Logger.getLogger(votingWindow.class);
        
        logger.info("Session Started....");
        
        votingWindow in = new votingWindow();
        in.setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
         @Override
            public void run()
            {
                logger.info("Session Ends...");
                logger.info("Session Results :");
                logger.info("=============================================================");
                logger.info("Total votes for "+votingWindow.team1+" : "+votingWindow.vote1);
                logger.info("Total votes for "+votingWindow.team2+" : "+votingWindow.vote2);
                logger.info("Total votes for "+votingWindow.team3+" : "+votingWindow.vote3);
                logger.info("Total votes for "+votingWindow.team4+" : "+votingWindow.vote4);
                logger.info("Total votes for "+votingWindow.team5+" : "+votingWindow.vote5);
                logger.info("=============================================================");
                
            }
        });
        
       
 
    }
    
}
