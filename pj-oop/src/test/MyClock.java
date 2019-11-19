/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author LAB207_26
 */
public class MyClock extends JLabel implements Runnable {

    public static void main(String[] args) {
        
    }

    @Override
    public void run() {
        while (true) {
        Calendar d = Calendar.getInstance();
        int sec = d.get(Calendar.SECOND);
        int min = d.get(Calendar.MINUTE);
        int hour = d.get(Calendar.HOUR_OF_DAY);
        setFont(new Font("TimesRoman", Font.BOLD, 24));
        setText(String.format("%02d:%02d:%02d", hour, min, sec));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
