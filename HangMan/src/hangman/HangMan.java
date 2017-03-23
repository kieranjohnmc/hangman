/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.IOException;
import java.util.HashSet;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.applet.Main;

/**
 *
 * @author Kieran
 */
public class HangMan {
    /**
     * @param args the command line arguments
     */
    
    public static StartupForm sf = new StartupForm();
    
    public static void main(String[] args) {
        sf.setVisible(true);
    }
}

